package nested;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DecimalFormat;

public class Calculator extends JFrame implements ActionListener{
	public static final int ROW = 5;
	private Container dispCon;
	private JLabel dispL, inputL;
	private JButton[][] button;
	boolean isInit;
	StringBuilder disp, input;
	
    public Calculator() {
    	String[][] buttonTitle = {
    			{"←","C"},
				{"7","8","9","÷"},
				{"4","5","6","×"},
    			{"1","2","3","-"},
    			{".","0","=","+"}
    	};
    	
    	setLayout(null);
    	setBounds(720, 100, 325, 505);
    	
    	isInit = true;
    	disp = new StringBuilder("");
    	dispL = new JLabel(disp.toString(),dispL.RIGHT);
    	dispL.setFont(dispL.getFont().deriveFont(25.0f));
    	dispL.setBackground(Color.WHITE);
    	dispL.setOpaque(true);
    	input = new StringBuilder("0");
    	inputL = new JLabel(input.toString(),dispL.RIGHT);
    	inputL.setFont(inputL.getFont().deriveFont(30.0f));
    	inputL.setBackground(Color.WHITE);
    	inputL.setOpaque(true);
    	
    	
    	JPanel dispPanel = new JPanel();
    	dispPanel.setBounds(10, 10, 295, 120);
    	dispPanel.setLayout(new GridLayout(2,1,0,2));
    	dispPanel.add(dispL);
    	dispPanel.add(inputL);
    	add(dispPanel);
    	
    	button = new JButton[ROW][];
    	for(int i = 0; i < ROW; i++) {
    		int col = buttonTitle[i].length;
    		JPanel buttonPanel = new JPanel();
    		buttonPanel.setBounds(10,140+(i*65),295,63);
    		buttonPanel.setLayout(new GridLayout(1,col, 3, 0));
    		button[i] = new JButton[col];
    		for(int j = 0; j < col; j++) {
    			button[i][j] = new JButton(buttonTitle[i][j]);
    			button[i][j].setFont(button[i][j].getFont().deriveFont(25.0f));
    			button[i][j].addActionListener(this);
    			buttonPanel.add(button[i][j]);
    		}
    		add(buttonPanel);
    	}
    	
    	setTitle("계산기");
    	setResizable(false);
    	setVisible(true);
    	
    	addWindowListener(new WindowAdapter() {
    		@Override
    		public void windowClosing(WindowEvent e) {
    			System.exit(0);
    		}
    	});
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		int command = (int)e.getActionCommand().charAt(0)-48;
		if(command >= 0 && command < 10) {
			System.out.println("숫자");
			if(input.length() == 1 && input.toString().charAt(0) == '0') {
				input.deleteCharAt(0);
//				isInit = true;
			}
			input.append(command);
			Double tmp = Double.parseDouble(input.toString());
			
			DecimalFormat df = new DecimalFormat("#,###.0##############");
			inputL.setText(df.format(tmp));
//			inputL.setText(df.format(input.toString()));
			
		}
		
		if(command == (int)'←'-48) {
			input.deleteCharAt(input.length()-1);
			if(input.length() == 0) {
				input.append("0");
			}
			Double tmp = Double.parseDouble(input.toString());
			DecimalFormat df = new DecimalFormat("#,###.0##############");
			inputL.setText(df.format(tmp));
		
//			inputL.setText(input.toString());
		}
		if(command == (int)'C'-48) {
			if(disp.length() != 0) {
				disp.delete(0, disp.length()-1);
			}
			dispL.setText(disp.toString());
			input.delete(0, input.length());
			input.append("0");
			inputL.setText(input.toString());
		}
		
		if(command == (int)'.'-48 && input.toString().indexOf('.') == -1) {
			input.append(".");
			Double tmp = Double.parseDouble(input.toString());
			DecimalFormat df = new DecimalFormat("#,###.0##############");
			inputL.setText(df.format(tmp));
//			inputL.setText(input.toString());
		}
		System.out.println(command);
	} // actionPerformed
	
	
	public static void main(String[] args) {
		new Calculator();
	} // main
	
	public String addRestMark(StringBuilder sb) {
		String convertedSb = sb.toString().replaceAll(",", "");
		return convertedSb;
	}
}
