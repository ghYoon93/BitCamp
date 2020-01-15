package nested;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Panel;


public class RGBTest extends JFrame {
	private JButton redB, greenB, blueB;
	private DrCanvas can;
	
    public RGBTest() {
    	can = new DrCanvas();
    	redB = new JButton("»¡°­");
    	greenB = new JButton("ÃÊ·Ï");
    	blueB = new JButton("ÆÄ¶û");
    	
    	JPanel p = new JPanel();
    	p.setLayout(new GridLayout(1,3));
    	p.add(redB);
    	p.add(greenB);
    	p.add(blueB);
    	
    	Container c = this.getContentPane();
    	c.add("North", p);
    	add("Center", can);
    	
    	redB.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			can.setBackground(new Color(255,0,0));
    		}
    	});
    	
    	greenB.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			can.setBackground(new Color(0,255,0));
    		}
    	});
    	
    	blueB.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			can.setBackground(new Color(0,0,255));
    		}
    	});
    	
    	setBounds(700, 400, 500, 500);
    	setVisible(true);
    	addWindowListener(new WindowAdapter() {
    		@Override
    		public void windowClosing(WindowEvent e) {
    			System.exit(0);
    		}
    	});
    }

	class DrCanvas extends Canvas {
		public DrCanvas(){
			this.setBackground(new Color(255,255,255));
		}
	}  // DrCanvas
	public void paint(Graphics g) {
		
	}
	public static void main(String[] args) {
		new RGBTest();
	}
} // class
