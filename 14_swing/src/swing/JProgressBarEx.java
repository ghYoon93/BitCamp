package swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class JProgressBarEx extends JFrame implements ActionListener, Runnable{
    	private JProgressBar jProgressBar = new JProgressBar(JProgressBar.HORIZONTAL, 0, 100);
    	private JButton startJButton = new JButton("Ω√¿€");
    	private JButton stopJButton = new JButton("∏ÿ√„");
    	
    	public JProgressBarEx() {
    		super("Test");
    		Container con = getContentPane();
    		con.setLayout(new BorderLayout());
    		con.add("North", new JLabel("«¡∑Œ±◊∑πΩ∫ πŸ"));
    		con.add("Center",jProgressBar);
    		jProgressBar.setStringPainted(true);
    		jProgressBar.setString("0%");
    		
    		JPanel jPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
    		jPanel.add(startJButton); jPanel.add(stopJButton);
    		startJButton.addActionListener(this);
    		stopJButton.addActionListener(this);
    		con.add("South", jPanel);
    		setSize(300,150);
    		setVisible(true);
    		
    	}
    	private boolean bb = true;
    	private static int ii;
		@Override
		public void run() {
			if(ii == 100) ii = 0;
			for(int i = ii; i<=100; i++) {
				if(!bb) break;
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				jProgressBar.setValue(i);
				ii = i;
				jProgressBar.setString(i+"%");
			}
			startJButton.setEnabled(true);
			stopJButton.setEnabled(false);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == startJButton) {
				bb = true; new Thread(this).start();
				startJButton.setEnabled(false);
				stopJButton.setEnabled(true);
			}else if(e.getSource() == stopJButton) {
				bb = false;
				startJButton.setEnabled(true);
				stopJButton.setEnabled(false);
			}
		}
    	
		public static void main(String[] args) {
			new JProgressBarEx();
		}
    	
  
}
