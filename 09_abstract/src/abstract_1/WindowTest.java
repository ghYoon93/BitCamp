package abstract_1;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.Toolkit;

public class WindowTest extends Frame {
	
	public WindowTest() {	
		setBackground(new Color(195, 195, 195));
		setBounds(700, 200, 320, 500);
    	setVisible(true);
//    	Label image = new Label("이미지");
//    	add(image);
    	
    }
	
	@Override
	public void paint(Graphics g) {
		Toolkit t = Toolkit.getDefaultToolkit();// 이미지 불러오기
		Image img = t.getImage("lion.jpg");
		g.drawImage(img, 20, 100, this);
	}
	
    public static void main(String[] args) {
    	new WindowTest();
	}
}
