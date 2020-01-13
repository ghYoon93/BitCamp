package swing;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Arrays;

public class DrCanvas extends Canvas implements MouseListener, MouseMotionListener{
	private MsPaint msPaint;
	private ArrayList<ShapeDTO> shapeList;
	private ShapeDTO shape;
	private Color color;
	private String shapeType;
	private boolean isDrawing, fillCheck;
	private int[] coord;
	private int count = 0;
    public DrCanvas(MsPaint msPaint) {
    	this.msPaint = msPaint;
    	addMouseListener(this);
    	addMouseMotionListener(this);
    	setBackground(new Color(255, 219, 255));
    	shapeList = new ArrayList<ShapeDTO>();
    }
    public void paint(Graphics g) {
    	System.out.println(shapeList.size());
    	for(ShapeDTO each : shapeList) {
    		System.out.print("x1:" +each.getCoord()[0]);
        	System.out.print(" x2:" +each.getCoord()[1]);
        	System.out.print(" y1:" +each.getCoord()[2]);
        	System.out.println(" y2:" + each.getCoord()[3]);
    		int x1 = each.getX1();
    		int x2 = each.getX1();
    		int y1 = each.getCoord()[2];
    		int y2 = each.getCoord()[3];
    		Color color = each.getColor();
    		boolean fillCheck = each.isFillCheck();
    		String shapeType = each.getShape();
    		if(!shapeType.equals("선") && !shapeType.equals("연필") && x1>x2) {
    			int tmp = x1;
    			x1 = x2;
    			x2 = tmp;
    		}
    		if(!shapeType.equals("선") && !shapeType.equals("연필") && y1>y2) {
    			int tmp = y1;
    			y1 = y2;
    			y2 = tmp;
    		}
    		int width = x2 - x1;
    		int height = y2 - y1;
    		
    		
    		
    		g.setColor(color);
    		if(shapeType.equals("선") || shapeType.equals("연필")) {
    			g.drawLine(x1, y1, x2, y2);
    		}else if(shapeType.equals("사각형")) {
    			if(fillCheck) {
    				g.fillRect(x1, y1, width, height);
    			}
    			else g.drawRect(x1, y1, width, height);
    		}else if(shapeType.equals("원")) {
    			if(fillCheck) {
    				g.fillOval(x1, y1, width, height);
    			}
    			else {
    				g.drawOval(x1, y1, width, height);
    			}
    		}else if(shapeType.equals("둥근 사각형")) {
    			if(fillCheck) {
    				g.fillRoundRect(x1, y1, width, height, 50, 50);
    			}
    			else {
    				g.drawRoundRect(x1, y1, width, height, 50, 50);
    			}
    		}
    	}
    }
    public void drawByButton(int[] coord, String shape, Color color, boolean fillCheck) {
    	shape= new ShapeDTO(x1,x2,y1,y2,z1,z2, shape, color, fillCheck);
    	shapeList.add(this.shape);
    	repaint();
    }
    public void draw(int[] coord, String shapeType, Color color, boolean fillCheck) {
    	if(!shapeType.equals("연필") && shapeList.size() > 0 && isDrawing && shapeList.size() >= count) {
    		shapeList.remove(shapeList.size()-1);
    		System.out.println("연필 삭제");
    	}
    	int[] coord2 = Arrays.copyOf(coord,coord.length);
    	shape= new ShapeDTO(x1,x2,y1,y2,z1,z2, shapeType, color, fillCheck);
    	shapeList.add(shape);
    	repaint();
    	if(shapeType.equals("연필")) {
    		x1 = x2;
    		x1 = x2;
    	}
    }
    public void removeAll() {
    	if(shapeList.size()!=0) {
    		shapeList = new ArrayList<ShapeDTO>();
    		count = 0;
    	}
    	
    	repaint();
    }
    public void revert() {
    	if(shapeList.size()!=0) {
			shapeList.remove(shapeList.size()-1);    			
			count--;
    	}
    	repaint();
    }
    @Override
	public void mousePressed(MouseEvent e) {
    	count++;
		isDrawing = true;
		color = msPaint.getColorMenu().getColorItem();
    	shapeType = msPaint.getShapeMenu().getShape();
    	fillCheck = msPaint.getFillCheckBox().isSelected();
		coord = new int[6];
		x1 = e.getX(); // x1;
		y1 = e.getY(); // y1;
	}
	public void mouseDragged(MouseEvent e) {
		x2 = e.getX(); // x2;
		y2 = e.getY(); // y2;
//		int[] coord2 = coord
		draw(coord, shapeType, color, fillCheck);
	}
	public void mouseReleased(MouseEvent e) {
		isDrawing = false;
	}
	public void mouseMoved(MouseEvent e) {}
	public void mouseClicked(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
}