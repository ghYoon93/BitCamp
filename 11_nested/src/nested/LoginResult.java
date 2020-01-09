package nested;

import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class LoginResult extends JFrame{
	private JFrame frame;
	private JLabel checkValid;
	public static final String ID = "angel";
	public static final String PWD = "1004";
	
    public LoginResult(String id, String pwd) {
    	if(ID.equals(id) && PWD.equals(pwd)) {
    		JOptionPane.showMessageDialog(this, "로그인 성공");
    	}else {
    		JOptionPane.showMessageDialog(this, "로그인 실패");
    	}
    }
}
