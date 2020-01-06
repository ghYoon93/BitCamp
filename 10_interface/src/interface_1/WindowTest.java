package interface_1;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class WindowTest extends Frame implements MouseListener, MouseMotionListener{
	private int x,y;
    public WindowTest() {
    	setTitle("���� ���� ������");
    	setBounds(700, 200, 300, 400);
    	
    	this.addMouseListener(this);
    	this.addMouseMotionListener(this);
    	this.addWindowListener(new WindowExit());
    	setVisible(true);
    }  // windowTest()
    
    public static void main(String[] args) {
    	new WindowTest();
    	new WindowTest();
    
	}  // main()
    
    // MouseListener Override - EventHandler
	@Override
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseMoved(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {
//		System.out.println("���콺 IN");
	}
	
	public void mouseClicked(MouseEvent e) {
//		System.out.println("���콺 Ŭ��");
//		System.out.println("X:"+ e.getX() + "\t Y: "+e.getY());
		this.x = e.getX();
		this.y = e.getY();
		repaint();  // update() -> paint() ������ ȣ��
	}
	
	
	public void mouseExited(MouseEvent e) {
//		System.out.println("���콺 OUT");
	}
	
	public void mouseDragged(MouseEvent e) {
//		System.out.println("���콺 �巡��");
	}
	
	
	public void paint(Graphics g) {
		g.drawString("X:" + this.x+"\t Y: "+this.y, x,y);
	}
}
