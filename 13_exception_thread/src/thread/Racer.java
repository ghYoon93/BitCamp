package thread;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Racer extends Canvas implements Runnable{ // 말 한 마리
	private static int ranking = 1;
	private int x;
	private String name;
	
	Toolkit t = Toolkit.getDefaultToolkit();
	Image image = t.getImage("hourse.gif");
	public Racer(String name) {
		this.name = name;
		System.out.println("Racer 생성자");
	}
    public void paint(Graphics g) {
    	System.out.println("paint");
    	g.drawLine(0, getHeight()/2, getWidth(), getHeight()/2);
    	g.drawImage(image, x,0,25,this.getHeight(), this);
    }
   
	@Override
	public void run() {
		for(int i = 0; i < 600; i+=(int)(Math.random()*10+1)) {
			x = i;
			repaint();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(ranking+"등마: "+name);
		ranking++;
	}
}
