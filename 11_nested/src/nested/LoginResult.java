package nested;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class LoginResult {
	private JFrame frame;
	private JLabel checkValid;
	public static final String ID = "angel";
	public static final String PWD = "1004";
	
    public LoginResult(String id, String pwd) {
    	frame = new JFrame();
    	
    	if(ID.equals(id) && PWD.equals(pwd)) {
    		checkValid = new JLabel("성 공");
    	}else {
    		checkValid = new JLabel("실 패");	
    	}
    	
    	
    	checkValid.setBounds(80,40,80,80);
    	frame.add(checkValid);
    	frame.setLayout(null);
    	frame.setBounds(900,200,200,200);
    	frame.setVisible(true);
    	
    }
}
