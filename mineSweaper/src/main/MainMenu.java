package main;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainMenu extends JFrame implements ActionListener {
    public MainMenu() {
    	super("���� ã��");
    	Container container = getContentPane();
    	container.setLayout(null);
    	// ***** ���̵� ��ư *****
    	JButton easyMode = new JButton("�ʱ�");
    	easyMode.setBounds(100, 150, 300, 60);
    	easyMode.addActionListener(this);
    	container.add(easyMode);
    	//
    	JButton normalMode = new JButton("�߱�");
    	container.add(normalMode);
    	normalMode.setBounds(100, 230, 300, 60);
    	normalMode.addActionListener(this);
    	//
    	JButton hardMode = new JButton("���");
    	hardMode.setBounds(100, 310, 300, 60);
    	hardMode.addActionListener(this);
    	container.add(hardMode);
    	// *******************
    	setBounds(700,100,516,539);
    	setVisible(true);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
		new MainMenu();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String clickedButton = e.getActionCommand();
		if(clickedButton.equals("�ʱ�")) {
			System.out.println("�ʱ�");
		}
		if(clickedButton.equals("�߱�")) {
			System.out.println("�߱�");
		}
		if(clickedButton.equals("���")) {
			System.out.println("���");
		}
		
		
	}
}
