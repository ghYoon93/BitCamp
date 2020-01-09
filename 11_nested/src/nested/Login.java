package nested;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Container;

public class Login {
	private JFrame frame;
	private JLabel idL, pwdL;
	private JTextField idT;
	private JPasswordField pwdT;
	private JButton cancel, login;
	
    public Login() {
    	frame = new JFrame();
    	idL = new JLabel("아이디");
    	pwdL = new JLabel("비밀번호");
    	idT = new JTextField();
    	pwdT = new JPasswordField();
    	login = new JButton("로그인");
    	cancel = new JButton("취소");
    	
    	idL.setBounds(100, 100, 200, 30);
    	pwdL.setBounds(100, 150, 200, 30);
    	idT.setBounds(180, 100, 220, 30);
    	pwdT.setBounds(180,150,220,30);
    	login.setBounds(180, 200, 100, 30);
    	cancel.setBounds(300, 200, 100, 30);
    	
    	Container c = frame.getContentPane();
    	frame.setLayout(null);
    	c.add(idL);
    	c.add(pwdL);
    	c.add(idT);
    	c.add(pwdT);
    	c.add(login);
    	c.add(cancel);
    	
    	frame.setTitle("로그인");
    	frame.setBounds(700, 100, 600, 400);
    	frame.setVisible(true);
    	
    	// Event
    	frame.addWindowListener(new WindowAdapter() {
    		@Override
    		public void windowClosing(WindowEvent e) {
    			System.exit(0);
    		}
    	});
    	
    	login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = idT.getText();
				String pwd = pwdT.getText();
				new LoginResult(id, pwd);
			}
    	});
    	
    	cancel.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			idT.setText("");
    			pwdT.setText("");
    		}
    	});
    	
    } // Login()
    
    public static void main(String[] args) {
		new Login();
	}  // main
}
