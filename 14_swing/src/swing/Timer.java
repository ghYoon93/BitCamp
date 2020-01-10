package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Timer extends JFrame implements ActionListener, Runnable{
	private Container con;
	private JPanel buttonPane, timePane;
	private JLabel[] time;
	private JButton startButton, stopButton;
	private boolean stop;
	
	public Timer() {
		super("√ Ω√∞Ë");
		
		con = getContentPane();
		con.setLayout(new BorderLayout());
		startButton = new JButton("Ω√¿€");
		startButton.addActionListener(this);
		stopButton = new JButton("∏ÿ√„");
		stopButton.setEnabled(false);
		stopButton.addActionListener(this);
		
		
		buttonPane = new JPanel();
		buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
		buttonPane.add(startButton);
		buttonPane.add(stopButton);
		con.add("South",buttonPane);
		
		time = new JLabel[5];
		for(int i = 0; i < 5; i++) {
			time[i] = new JLabel("0");
			if(i == 2) time[i].setText(":");
			time[i].setFont(new Font("DS_DIGIT",Font.BOLD,80));
			time[i].setForeground(Color.WHITE);
		}
		
		timePane = new JPanel();
		timePane.setLayout(new GridLayout(1,4));
		timePane.setBackground(Color.BLACK);
		for(JLabel sec : time) {
			timePane.add(sec);
		}
		con.add("Center", timePane);
		
		setSize(300,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	private static int ms = 0;
	@Override
	public void run() {
//		if(ms == 2000) ms = 0;
		time[0].setText("0");
		time[1].setText("0");
		time[3].setText("0");
		time[4].setText("0");
		System.out.println("0");
		for(ms = 0; ms <= 2000; ms++) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(stop) break;
			time[4].setText(Integer.toString(ms%10));
			if(ms/10 != 0) time[3].setText(Integer.toString((ms/10)%10));
			if(ms/100 != 0) time[1].setText(Integer.toString((ms/100)%10));
			if(ms/1000 != 0) time[0].setText(Integer.toString(ms/1000));
		}
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == startButton) {
			System.out.println("asdf");
			stop = false;
			Thread t = new Thread(this);
			t.start();
			startButton.setEnabled(false);
			stopButton.setEnabled(true);
		}else if(e.getSource() == stopButton) {
			stop = true;
			startButton.setEnabled(true);
			stopButton.setEnabled(false);
		}
		
	}
	
	public static void main(String[] args) {
		new Timer();
	}
}
