package swing;

import java.awt.Color;

public class ShapeDTO {
	private int[] coord = new int [6];
	private String shapeType;
	private Color color;
	private boolean fillCheck;
	private int x1,x2,y1,y2,z1,z2;
    public ShapeDTO(int x1,int x2, int y1, int y2, int z1, int z2, String shapeType, Color color, boolean fillCheck) {
    	this.x1 = x1;
    	this.x2 = x2;
    	this.y1 = y1;
    	this.y2 = y2;
    	this.z1 = z1;
    	this.z1 = z2;
    	this.shapeType = shapeType;
    	this.color = color;
    	this.fillCheck = fillCheck;
    }

	public String getShapeType() {
		return shapeType;
	}

	public int getX1() {
		return x1;
	}

	public int getX2() {
		return x2;
	}

	public int getY1() {
		return y1;
	}

	public int getY2() {
		return y2;
	}

	public int getZ1() {
		return z1;
	}

	public int getZ2() {
		return z2;
	}

	public boolean isFillCheck() {
		return fillCheck;
	}

	public int[] getCoord() {
		return coord;
	}


	public String getShape() {
		return shapeType;
	}

	public Color getColor() {
		return color;
	}
}
