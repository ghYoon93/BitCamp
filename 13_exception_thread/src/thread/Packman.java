package thread;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class Packman extends Frame implements KeyListener, Runnable{
	private int sel = 2;
	private int x = 225, y = 225, mx = 0, my = 0;
	private Toolkit t = Toolkit.getDefaultToolkit();
	private Image PackmanImg = t.getImage("packman.jpg");
	private Image foodImg = t.getImage("food2.jpg");
    private ArrayList<Food> foodList = new ArrayList<Food>();
	
	public Packman() {
    	addWindowListener(new WindowAdapter() {
    		@Override
    		public void windowClosing(WindowEvent e) {
    			System.exit(0);
    		}
    	});
    	this.addKeyListener(this);
    	
    	Thread t = new Thread(this);
    	t.start();
    	
    	for(int i = 0; i < 5; i++) {
    		int foodX = (int)(Math.random()*9+1)*50;
    		int foodY = (int)(Math.random()*9+1)*50;
    		if(x >=foodX - 45 && x <= foodX-5 && y >= foodY-45 && y <= foodY-5){
    			i--;
    		}else {
    			Food food = new Food((int)(Math.random()*9+1)*50,(int)(Math.random()*9+1)*50);
    			foodList.add(food);    			
    		}
    	}
    	
    	
    	
    	setBounds(700, 100, 500, 500);
//    	setResizable(false);
    	setVisible(true);
    }
    @Override
    public void paint(Graphics g) {
		if(foodList.size() == 0) return;
    	for(int i = 0; i < foodList.size(); i++) {		
			g.drawImage(foodImg,foodList.get(i).getX(),foodList.get(i).getY(),5,5,this);    			

    	}
    	// image, 시작 x,시작 y, 끝 x, 끝 y, image 시작 x, image 시작 y, image 끝 x, image 끝 y
    	g.drawImage(PackmanImg, 
    				x, y, x+50, y+50, 
    				sel*50, 0, sel*50+50, 50, 
    				this); //위쪽
    	
    }
    public void run() {
    	while(true) {
    		for(int i = 0; i < foodList.size(); i++) {
    			if(x >=foodList.get(i).getX()-45 && x <= foodList.get(i).getX()-5 && y >= foodList.get(i).getY()-45 && y <= foodList.get(i).getY()-5){
    				foodList.remove(i);
        		}
    		}
    		if(sel%2 == 0) sel++;
    		else sel--;
    		if(x > 440 && (sel == 2 || sel == 3)) {
    			mx = 0;
    		}
    		else if(x < 10 && (sel == 0 || sel == 1)) {
    			mx = 0;
    		}
    		else if(y > 440 && (sel == 6 || sel == 7)) {
    			my = 0;
    		}
    		else if ( y< 30 && (sel == 4 || sel == 5)) {
    			my = 0;
    		}
    		x+=mx;
    		y+=my;
    		repaint();
    		try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
    	}
    	
    }
    public void keyPressed(KeyEvent e) {
    	if(e.getKeyCode() == KeyEvent.VK_LEFT) {
    		sel = 0;
    		mx =-10; my = 0;
    		
    	}
    	else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
    		sel = 2;
    		mx = 10; my = 0;
    	}
		else if(e.getKeyCode() == KeyEvent.VK_UP) {
			sel = 4;
			mx = 0; my = -10;
		}
		else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			sel = 6;
			mx = 0; my = 10;
		}
		else if(e.getKeyCode() == KeyEvent.VK_ESCAPE) System.exit(0);
    	System.out.println(x+", "+y);
    }
    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}
    
    public static void main(String[] args) {
		new Packman();
	}
}
