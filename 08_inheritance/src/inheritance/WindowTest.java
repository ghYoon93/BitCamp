package inheritance;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Color;

public class WindowTest extends Frame {
	public WindowTest() {
		super("내가 만든 윈도우");
		System.out.println("도형");
		setBackground(new Color(195, 195, 195));
//    	setSize(300, 400);
		setBounds(700, 200, 300, 400);
    	setVisible(true);
    	
    }
	@Override
	public void paint(Graphics g) {  // Call back 콜백메소드 repaint()
		g.drawLine(100, 120, 250, 270);
		g.drawLine(250, 120, 100, 270);
		g.drawRect(100, 120, 150, 150);
		g.drawOval(100, 120, 150, 150);
	}
	
	 public static void main(String[] args) {
		new WindowTest();
	}
	
}
