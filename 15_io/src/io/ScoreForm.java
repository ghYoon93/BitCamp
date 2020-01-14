package io;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class ScoreForm extends JFrame implements ActionListener{
	private ScoreImpl scoreImpl;
	private ButtonType cmd;
    public ScoreForm() {
    	Container con = getContentPane();
    	Pane centerP = new CenterPane();
    	con.add("Center", centerP.getPane());
    	Pane southP = new SouthPane(this);
    	con.add("South",southP.getPane());
    	
    	setBounds(700,100,500,500);
    	setVisible(true);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
    	scoreImpl = new ScoreImpl(centerP, southP);
    	
    }
    @Override
	public void actionPerformed(ActionEvent e) {
		//  버튼의 밸류에 해당하는 키 값
		String command = e.getActionCommand();
//		System.out.println(command);
		for(ButtonType cmd : ButtonType.values()) {
			if(command.equals(cmd.getName())) {
				setCmd(cmd);
				scoreImpl.callEvent(cmd);
				
			}
		}
	}
    public void setCmd(ButtonType cmd) {
		this.cmd = cmd;
	}
    public ButtonType getCmd() {
		return cmd;
	}
	public static void main(String[] args) {
		new ScoreForm();
	}
}
