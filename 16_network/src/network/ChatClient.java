package network;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClient extends JFrame implements ActionListener, Runnable {
	private JTextField input;
	private JTextArea output;
	private JButton send;
	private Socket socket;
	private PrintWriter pw;
	private BufferedReader br;
    public ChatClient() {
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
    	send = new JButton("����");
    	southPanel.add("East", send);
    	container.add("South", southPanel);
    	
    	setBounds(700,100,516,539);
    	setVisible(true);
    	this.addWindowListener(new WindowAdapter() {
    		@Override
    		public void windowClosing(WindowEvent e) {
    			pw.println("quit");
    			pw.flush();
    		}
    	});
    }
    public void service() {
    	String serverIP = JOptionPane.showInputDialog(this,"���� IP�� �Է��ϼ���","192.168.0.62");
    	if(serverIP == null || serverIP.length() == 0) {
    		System.out.println("���� IP�� �Էµ��� �ʾҽ��ϴ�.");
    		System.exit(0);
    	}
    	
    	String nickName = JOptionPane.showInputDialog(this, "�г����� �Է��ϼ���", "�г���",JOptionPane.INFORMATION_MESSAGE);
    	if(nickName == null || nickName.length() == 0) {
    		nickName = "guest";
    	}
    	
    	// ���� ����
    	try {
			socket = new Socket(serverIP, 9500);
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			pw = new PrintWriter(osw);
			pw.println(nickName);
			pw.flush();
		} catch (UnknownHostException e) {
			System.out.println("������ ã�� �� �����ϴ�.");
		}
    	catch (IOException e) {
    		System.out.println("������ ������ �ȵǾ����ϴ�.");
			e.printStackTrace();
		}
    	// �г����� ������ ����
    	
    	// ������ ����
    	Thread t = new Thread(this);
    	t.start();
    	send.addActionListener(this);
    	input.addActionListener(this);
	}
    @Override
    public void actionPerformed(ActionEvent e) {
    	String msg = input.getText();
    	System.out.println(msg);
    	pw.println(msg);
    	pw.flush();
    	input.setText("");
    	
	}
    
    public void run() {
    	// �޴� ��
    	String line;
    	while(true) {
    		try {
				line = br.readLine();
				if(line == null || line.toLowerCase().trim().equals("quit")) {
					pw.close();
					br.close();
					socket.close();
					System.exit(0);
				}
				output.append(line+"\n");
				
				int pos = output.getText().length();
				output.setCaretPosition(pos);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	
    }
    
    public static void main(String[] args) {
		new ChatClient().service();
	}
	
	
	
}
