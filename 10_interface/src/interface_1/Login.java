package interface_1;

import java.awt.Container;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Login extends JFrame implements WindowListener {
	private JLabel idL, pwdL;
	private JTextField idT, pwT;
	private JButton loginB, cancelB;
	
    public Login() {
    	this.setLayout(null);
    	idL = new JLabel("아이디");
    	pwdL = new JLabel ("비밀번호");
    	idT = new JTextField();
    	pwT = new JTextField();
    	loginB = new JButton("로그인");
    	cancelB = new JButton("취소");
    	
    	
    	idL.setBounds(40,70,100,30);
    	idT.setBounds(120,70,110,30);
    	pwdL.setBounds(40,130,100,30);
    	pwT.setBounds(120,130,110,30);
    	loginB.setBounds(40,200,90, 30);
    	cancelB.setBounds(140,200, 70, 30);
    	
    	Container c = this.getContentPane();   	
    	c.add(idT);
    	c.add(idL);
    	
    	c.add(pwdL);
    	c.add(pwT);
    	
    	c.add(loginB);
    	c.add(cancelB);
    	
    	setBounds(900, 100, 300, 300);
    	setVisible(true);
    	
    	// 이벤트
    	this.addWindowListener(this);
    }
    
    public static void main(String[] args) {
		new Login();
	}

	@Override
	public void windowActivated(WindowEvent arg0) {}
	public void windowClosed(WindowEvent e) {}
	public void windowClosing(WindowEvent e) {
		System.out.println("시스템 종료");
	}
	public void windowDeactivated(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowOpened(WindowEvent e) {}
}
