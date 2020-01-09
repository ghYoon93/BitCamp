package thread;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Clock extends Frame implements Runnable{
    public Clock() {
    	
    	
    	setBounds(900,100, 300, 100);
    	addWindowListener(new WindowAdapter() {
    		public void windowClosing(WindowEvent e) {
    			System.exit(0);
    		}
    	});
    	setVisible(true);
    	Thread t = new Thread(this);
    	t.start();
    }
    public void paint(Graphics g) {
    	// thread
    	SimpleDateFormat sdf = new SimpleDateFormat("HHΩ√mm∫–ss√ ");
    	Date d = new Date();
    	g.drawString(sdf.format(new Date()), 60, 50);
    }
    @Override
    public void run() {
    	while(true) {
    		repaint();
    		try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
    	}
    	
    }
    public static void main(String[] args) {
		new Clock();
	}
}
