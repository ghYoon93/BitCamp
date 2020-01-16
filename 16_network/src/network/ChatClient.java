package network;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClient extends JFrame {
    public ChatClient() {
    	Container container = getContentPane();
    	JTextArea output = new JTextArea();
    	output.setEditable(false);
//    	JScrollBar scroll = new JScrollBar();
    	JScrollPane scroll = new JScrollPane(output);
    	scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    	
    	container.add("Center", scroll);
    	
    	JPanel southPanel = new JPanel();
    	southPanel.setLayout(new BorderLayout());
    	JTextField input = new JTextField();
    	southPanel.add("Center", input);
    	JButton send = new JButton("����");
    	southPanel.add("East", send);
    	container.add("South", southPanel);
    	
    	setBounds(700,100,516,539);
    	setVisible(true);
    	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
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
		
	}
    public static void main(String[] args) {
		new ChatClient().service();
	}
	
}
