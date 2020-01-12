package swing;

import java.awt.Color;

public class Shape {
	private int x1, x2, y1, y2, z1, z2;
	private String shape;
	private Color color;
	private boolean fillCheck;
    public Shape(int[] coord, String shape, Color color, boolean fillCheck) {
    	// 좌표 coordmenu에서 불러오기
    	// 도형 모양
    	// 색상
    	// 채우기 여부
    	x1 = coord[0];
    	x2 = coord[1];
    	y1 = coord[2];
    	y2 = coord[3];
    	this.shape = shape;
    	this.color = color;
    	this.fillCheck = fillCheck;
    }

	public boolean isFillCheck() {
		return fillCheck;
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

	public String getShape() {
		return shape;
	}

	public Color getColor() {
		return color;
	}
}
