package swing;

import java.awt.Color;
import java.util.HashMap;

import javax.swing.JComboBox;
import javax.swing.JPanel;

public class ColorMenu implements IMenu{
	private JPanel colorMenu;
	private JComboBox<String> colorList;
	private HashMap<String, Color> colorMap = new HashMap<String,Color>();
	private String[] colorName = {"»ö»ó ¼±ÅÃ","»¡°­","ÃÊ·Ï","ÆÄ¶û","º¸¶ó","ÇÏ´Ã"};
	private Color[] color = {Color.BLACK,Color.RED,Color.GREEN, Color.BLUE, Color.MAGENTA, Color.CYAN};
   
	public ColorMenu() {
		colorMenu = new JPanel();
    	colorList = new JComboBox<String>();
    	colorMap = new HashMap<String, Color>();
    	for(int i = 0; i<colorName.length; i++) {
    		colorMap.put(colorName[i], color[i]);
    		colorList.addItem(colorName[i]);
    	}
    	colorMenu.add(colorList);
    }
	

	@Override
	public JPanel getMenu() {
		return colorMenu;
	}


	public Color getColor() {
		System.out.println(colorMap.get(colorList.getSelectedItem()));
		return colorMap.get(colorList.getSelectedItem());
	}
}
