package swing;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class Coord {
	private int coord;
	public Coord(JTextField jTextF) {
		this.coord = 0;
		System.out.println(jTextF.getText());
		if(!jTextF.getText().equals("")) {			
			this.coord = Integer.parseInt(jTextF.getText());
		}
	}
	public int getCoord() {
		return coord;
	}
}
