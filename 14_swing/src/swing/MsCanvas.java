package swing;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class MsCanvas extends Canvas{
	private Shape shape;
	private ArrayList<Shape> shapeList;
    public MsCanvas() {
    	setBackground(new Color(255, 219, 255));
    	shapeList = new ArrayList<Shape>();
    }
    public void paint(Graphics g) {
    	for(Shape each : shapeList) {
    		int x1 = each.getX1();
    		int x2 = each.getX2();
    		int y1 = each.getY1();
    		int y2 = each.getY2();
    		String shape = each.getShape();
    		Color color = each.getColor();
    		boolean fillCheck = each.isFillCheck();
    		int width = each.getX2() - each.getX1();
    		int height = each.getY2() - each.getY1();
    		
    		g.setColor(color);
    		if(shape.equals("선")) {
    			g.drawLine(x1, y1, x2, y2);
    		}else if(shape.equals("사각형")) {
    			if(fillCheck) g.fillRect(x1, y1, width, height);
    			else g.drawRect(x1, y1, width, height);
    		}else if(shape.equals("원")) {
    			if(fillCheck) g.fillOval(x1, y1, width, height);
    			else g.drawOval(x1, y1, width, height);
    		}else if(each.getShape().equals("둥근 사각형")) {
    			if(fillCheck) g.fillRoundRect(x1, y1, width, height, 50, 50);
    			else g.drawRoundRect(x1, y1, width, height, 50, 50);
    		}
    	}
    }
    public void draw(int[] coord, String shape, Color color, boolean fillCheck) {
    	this.shape= new Shape(coord, shape, color, fillCheck);
    	shapeList.add(this.shape);
    	repaint();
    }
}