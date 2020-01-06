package nested;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener{
	public static final int ROW = 5;
	private JFrame frame;
	private JLabel inputHistoryL, inputL;
	private JButton[][] button;
	StringBuilder inputHistory, input;
	
    public Calculator() {
    	String[][] buttonTitle = {
    			{"←","C"},
				{"7","8","9","÷"},
				{"4","5","6","×"},
    			{"1","2","3","-"},
    			{".","0","=","+"}
    	};
    	
    	frame = new JFrame();
    	inputHistory = new StringBuilder();
    	input = new StringBuilder();
    	inputHistoryL = new JLabel(inputHistory.toString());
//    	inputHistory.setPreferredSize(preferredSize);
    	inputHistoryL.setHorizontalAlignment(inputHistoryL.RIGHT);
    	inputHistoryL.setOpaque(true);
    	inputHistoryL.setBackground(Color.WHITE);
    	inputL = new JLabel(input.toString());
    	inputL.setHorizontalAlignment(inputHistoryL.RIGHT);
    	inputL.setOpaque(true);
    	inputL.setBackground(Color.WHITE);
    	
    	frame.add(inputHistoryL);
    	frame.add(inputL);
    	
    	button = new JButton[ROW][];
    	for(int i = 0; i < ROW; i++) {
    		int col = buttonTitle[i].length;
    		JPanel p = new JPanel();
    		p.setLayout(new GridLayout(1,col,0,5));
    		button[i] = new JButton[col];
    		for(int j = 0; j < col; j++) {
    			button[i][j] = new JButton(buttonTitle[i][j]);
    			button[i][j].addActionListener(this);
    			p.add(button[i][j]);
    			
    		}
    		frame.add(p);
    	}
    	frame.setTitle("계산기");
    	frame.setLayout(new GridLayout(7,1 , 5, 0));
    	frame.setBounds(700,100,300,500);
    	frame.setResizable(false);
    	frame.setVisible(true);
    }
    public static void main(String[] args) {
		new Calculator();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		int command = (int)e.getActionCommand().charAt(0)-48;
		if(command >= 0 && command < 10) {
			System.out.println("숫자");
			inputHistory.append(command);
			inputHistoryL.setText(inputHistory.toString());
		}
		if(command == (int)'←'-48) {
			System.out.println();
			inputHistory.deleteCharAt(inputHistory.length()-1);
			inputHistoryL.setText(inputHistory.toString());
		}
		System.out.println(command);
	}
}
