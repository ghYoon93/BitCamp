package swing;

import java.awt.Color;
import java.util.HashMap;

public class ColorItem {
	private HashMap<String, Color> colorMap = new HashMap<String,Color>();
	private String[] colorName = {"»ö»ó ¼±ÅÃ","»¡°­","ÃÊ·Ï","ÆÄ¶û","º¸¶ó","ÇÏ´Ã"};
	private Color[] colors = {Color.BLACK,Color.RED,Color.GREEN, Color.BLUE, Color.MAGENTA, Color.CYAN};
	private Color color;
    public ColorItem(String colorName) {
    	for(int i = 0; i < this.colorName.length; i++) {
    		colorMap.put(this.colorName[i], colors[i]);
    	}
    	this.color = colorMap.get(colorName);
    }
    public Color getColor() {
    	return color;
    }
}
