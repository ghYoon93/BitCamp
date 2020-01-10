package nested;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Calculator extends JFrame implements ActionListener{
	public static final int ROW = 5;
	private JLabel dispL, inputL;
	private JButton[][] button;
//	boolean isDouble, isZero, isInit;
	StringBuilder disp, input, result;
	private ArrayList<Character> op;
    public void init() {
    	String[][] buttonTitle = {
    			{"←","C"},
				{"7","8","9","÷"},
				{"4","5","6","×"},
    			{"1","2","3","-"},
    			{".","0","=","+"}
    	};
    	
    	result = new StringBuilder("0");
    	op = new ArrayList<Character>();
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
    	setLayout(null);
    	setBounds(720, 100, 325, 505);
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
		char command = e.getActionCommand().charAt(0);
		
		if(isNumber(command)) {
			System.out.println("숫자");
			if(isZero(input)) {
				input.deleteCharAt(0);
			}
			input.append(command);
			inputL.setText(convertSb(input));
		}
		
		if(command=='←' && !isInit(input)) {
			if(isInit(input)) {
				input.append("0");
			}else {
				input.deleteCharAt(input.length()-1);				
			}
			inputL.setText(convertSb(input));
		}
		if(command == 'C') {
			reset();
			dispL.setText(disp.toString());
			inputL.setText(convertSb(input));
		}
		if(command=='÷') {
			System.out.println("연산자");
			if(op.size() == 2) {
				op.remove(1);
				disp.deleteCharAt(disp.length()-1);
			}
			if(!isNumber(input)) {
				System.out.println(".........");
				input.deleteCharAt(input.length()-1);
			}
			disp.append(input);
			calc();
			op.add(command);
			disp.append(command);
			dispL.setText(disp.toString());
			inputL.setText(convertSb(result));
		}
		if(command == '×') {
			if(isInit(input)) {
				if(command != op.get(op.size()-1)) {
					op.remove(op.size()-1);
					op.add(command);
				}
				disp.deleteCharAt(disp.length()-1);
			}else {
				if(!isNumber(input)) {
					System.out.println(".........");
					input.deleteCharAt(input.length()-1);
				}
				disp.append(input);
				calc();
				op.add(command);
			}
			disp.append(command);
			dispL.setText(disp.toString());
			inputL.setText(convertSb(result));
		}
		if(command == '+') {
			if(isInit(input)) {
				if(command != op.get(op.size()-1)) {
					op.remove(op.size()-1);
					op.add(command);
				}
				disp.deleteCharAt(disp.length()-1);
			}else {
				if(!isNumber(input)) {
					System.out.println(".........");
					input.deleteCharAt(input.length()-1);
				}
				disp.append(input);
				calc();
				op.add(command);
			}
			disp.append(command);
			dispL.setText(disp.toString());
			inputL.setText(convertSb(result));
		}
		
		if(command=='.' && !isDouble(input)) {
			input.append(".");
			inputL.setText(convertSb(input));
		}
		
		if(command == '-') {
			if(isInit(input)) {
				if(command != op.get(op.size()-1)) {
					op.remove(op.size()-1);
					op.add(command);
				}
				disp.deleteCharAt(disp.length()-1);
			}else {
				if(!isNumber(input)) {
					System.out.println(".........");
					input.deleteCharAt(input.length()-1);
				}
				disp.append(input);
				calc();
				op.add(command);
			}
			disp.append(command);
			dispL.setText(disp.toString());
			inputL.setText(convertSb(result));
		}
		if(command == '=') {
			System.out.println(command+"=====");
			if(isInit(input)) {
				input.append(result);
				calc();
			}
		}
		if(command=='.' && !isDouble(input)) {
			input.append(".");
			inputL.setText(convertSb(input));
		}
		
		
		System.out.println(command);
	} // actionPerformed
	
	public  boolean isInit(StringBuilder sb) {
		if(sb.length() == 0) {
			return true;
		}
		return false;
	} // isInit(StringBuilder sb)
	
	public boolean isZero(StringBuilder sb) {
		if(sb.length() == 1 && sb.toString().charAt(0) == '0') {
			return true;
		}
		return false;
	} // isZero(StringBuilder sb)
	
	public boolean isDouble(StringBuilder sb) {
		if(sb.toString().indexOf('.') != -1) {
			return true;
		}
		return false;
	} // isDouble(StringBuilder sb)

	public boolean isOperator(StringBuilder sb) {
		int lastInput = sb.toString().charAt(sb.length()-1);
		System.out.println("sb.length"+sb.length());
		if(lastInput =='÷' || lastInput=='×' || lastInput=='-' || lastInput=='+'|| lastInput=='=') {
			System.out.println("LI"+lastInput);
			return true;
		}
		return false;
	} // isOperator(StringBuilder sb)
	
	public boolean isNumber(StringBuilder sb) {
		char lastInput =sb.toString().charAt(sb.length()-1);
		if(lastInput == '.') return false;
		return true;
	} // isNumber(StringBuilder sb)
	
	public boolean isNumber(char command) {
		if(command >= '0' && command <= '9') {
			return true;
		}
		return false;
	} // isNumber(int command)
	
	public void calc() {
		double tempInput = Double.parseDouble(input.toString());
		double tempResult = Double.parseDouble(result.toString());
		if(op.size() != 0) {
			char cmd = op.remove(0);
			System.out.println("op: "+cmd);
			System.out.println("poll(): "+op.size());
			if(cmd == '÷') {
				if(isZero(input)) {
					clear(input);
					input.append("정의되지 않은 결과입니다.");
				}else {
					clear(result);
					if(tempResult%tempInput == 0) {
						result.append((int)(tempResult/tempInput)+"");						
					}else {
						result.append((tempResult/tempInput)+"");
					}
				}
//				System.out.println(input);
			}else if(cmd == '×') {
				clear(result);
				if((tempResult*tempInput)%1 == 0) {
					System.out.println("int");
					result.append((int)(tempResult*tempInput)+"");		
					System.out.println("result: "+ result);
				}else {
					System.out.println("double");
					result.append((tempResult*tempInput)+"");
					System.out.println("result: "+ result);
				}
			}else if(cmd == '-') {
				clear(result);
				if((tempResult-tempInput)%1 == 0) {
					result.append((int)(tempResult-tempInput)+"");						
				}else {
					result.append((tempResult-tempInput)+"");
				}
			}else if(cmd == '+') {
				clear(result);
				if((tempResult+tempInput)%1 == 0) {
					result.append((int)(tempResult+tempInput)+"");						
				}else {
					result.append((tempResult+tempInput)+"");
				}
			}
		}else {
			if((tempResult+tempInput)%1 == 0) {
				result.append((int)(tempResult+tempInput)+"");						
			}else {
				result.append((tempResult+tempInput)+"");
			}
		}
		clear(input);
	} // calc()
	
	
	public String convertSb(StringBuilder sb) {
		DecimalFormat df = new DecimalFormat("#,###");
		StringBuilder convertedSb = new StringBuilder("");
		if(isDouble(sb)) {
			long tmp = Long.parseLong(sb.substring(0, sb.toString().indexOf('.')));
			convertedSb.append(df.format(tmp));
			convertedSb.append(sb.substring(sb.toString().indexOf('.'), sb.length()));				
			
		}else {
			long tmp = Long.parseLong(sb.toString());
			convertedSb.append(df.format(tmp));
		}
		return convertedSb.toString();
	} // convertSb()
	public void clear(StringBuilder sb) {
		sb.delete(0, sb.length());
	}
	public void reset() {
		clear(disp);
		disp.append("");
		clear(input);
		input.append("0");
		if(op.size()!=0)op.remove(0);
	}
	public static void main(String[] args) {
		new Calculator().init();
	} // main
	
}
