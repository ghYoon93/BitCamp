package main;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainMenu extends JFrame implements ActionListener {
    public MainMenu() {
    	super("지뢰 찾기");
    	Container container = getContentPane();
    	container.setLayout(null);
    	// ***** 난이도 버튼 *****
    	JButton easyMode = new JButton("초급");
    	easyMode.setBounds(100, 150, 300, 60);
    	easyMode.addActionListener(this);
    	container.add(easyMode);
    	//
    	JButton normalMode = new JButton("중급");
    	container.add(normalMode);
    	normalMode.setBounds(100, 230, 300, 60);
    	normalMode.addActionListener(this);
    	//
    	JButton hardMode = new JButton("고급");
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
		if(clickedButton.equals("초급")) {
			System.out.println("초급");
		}
		if(clickedButton.equals("중급")) {
			System.out.println("중급");
		}
		if(clickedButton.equals("고급")) {
			System.out.println("고급");
		}
		
		
	}
}
