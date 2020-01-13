package swing;

import javax.swing.JTextField;

public class Coord {
	private int coord;
	public Coord(JTextField jTextF) {
		this.coord = 0;
		if(!jTextF.getText().equals("")) {			
			this.coord = Integer.parseInt(jTextF.getText().trim());
		}
	}
	public int getCoord() {
		return coord;
	}
}
