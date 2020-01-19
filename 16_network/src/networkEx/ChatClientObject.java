package networkEx;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClientObject extends JFrame implements ActionListener, Runnable{
	private JTextField input;
	private JTextArea output;
	private JButton send;
	private Socket socket;
	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	private static int number = 1;
	private InfoDTO user; 
	
    public ChatClientObject() {
    	Container container = getContentPane();
    	output = new JTextArea();
    	output.setEditable(false);
    	JScrollPane scroll = new JScrollPane(output);
    	scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    	container.add("Center", scroll);
    	
    	JPanel southPanel = new JPanel();
    	southPanel.setLayout(new BorderLayout());
    	input = new JTextField();
    	southPanel.add("Center", input);
    	send = new JButton("전송");
    	southPanel.add("East", send);
    	container.add("South", southPanel);
    	
    	setBounds(700,100,516,539);
    	setVisible(true);
    	
    	addWindowListener(new WindowAdapter() {
    		@Override
    		public void windowClosing(WindowEvent e) {
    			if(user != null) {
    				user.setCode(Protocol.EXIT);
    				try {
						oos.writeObject(user);
						oos.flush();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
    			}else {
    				System.exit(0);    				
    			}
    		}
    	});
    }
    public void service() {
    	String serverIP = JOptionPane.showInputDialog(this,"서버 IP를 입력하세요","192.168.0.62");
    	if(serverIP == null || serverIP.length() == 0) {
    		System.out.println("서버 IP가 입력되지 않았습니다.");
    		System.exit(0);
    	}
    	
    	String nickName = JOptionPane.showInputDialog(this, "닉네임을 입력하세요", "닉네임",JOptionPane.INFORMATION_MESSAGE);
    	if(nickName == null || nickName.length() == 0) {
    		nickName = "guest"+Integer.toString(number++);
    	}
    	
    	
    	try {
    		InetAddress local = InetAddress.getLocalHost();
        	String userIP = local.getHostAddress();
        	user = new InfoDTO(nickName, userIP);
        	user.setCode(Protocol.ENTER);
			socket = new Socket(serverIP, 9500);
			oos = new ObjectOutputStream(socket.getOutputStream());
//			oos.flush();
			ois = new ObjectInputStream(socket.getInputStream());
			oos.writeObject(user);
			oos.flush();
			
		} catch (UnknownHostException e) {
			System.out.println("서버를 찾을 수 없습니다.");
			e.printStackTrace();
			System.exit(0);
		} catch (IOException e) {
			System.out.println("서버에 연결할 수 없습니다.");
			e.printStackTrace();
			System.exit(0);
		}
    	Thread t = new Thread(this);
		t.start();
    	send.addActionListener(this);
    	input.addActionListener(this);
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			System.out.println("actionPerformed start");
			String msg = input.getText();
			user.setMsg(msg+"\n");
			user.setCode(Protocol.SEND_MESSAGE);
			System.out.println("actionPerformed: "+user.getMsg());
			if(msg.equalsIgnoreCase("quit")) {
				System.out.println("actionPerformed: "+user.getMsg());
				user.setCode(Protocol.EXIT);
			}
			oos.writeObject(user);
			System.out.print(user.getCode()+"\t"+user.getMsg());
			oos.flush();
			input.setText("");
		} catch (IOException e1) {
			e1.printStackTrace();
			System.exit(0);
		}	
	}

	public void run() {
		System.out.println("client run");
		InfoDTO user;
		while(true) {
			try {
				user = (InfoDTO) ois.readObject();
				Protocol code = user.getCode();
				System.out.println("run/while code"+code);
				System.out.println("message"+user.getMsg());
				if(user == null || code.equals(Protocol.EXIT)){
					oos.close();
					ois.close();
					socket.close();
					System.exit(0);
				}
				System.out.println("run client: "+user);
				output.append(user+"\n");
				int pos = output.getText().length();
				output.setCaretPosition(pos);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.exit(0);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.exit(0);
			}
		}
		
	}
	
	public static void main(String[] args) {
		new ChatClientObject().service();
	}
}
