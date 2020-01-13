package swing;

import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.JPanel;

public class ColorMenu implements IMenu{
	private JPanel colorMenu;
	private JComboBox<String> colorComboBox;
	private String[] colorName = {"»ö»ó ¼±ÅÃ","»¡°­","ÃÊ·Ï","ÆÄ¶û","º¸¶ó","ÇÏ´Ã"};
   
	public ColorMenu() {
		colorMenu = new JPanel();
    	colorComboBox = new JComboBox<String>();
    	for(int i = 0; i<colorName.length; i++) {
    		colorComboBox.addItem(colorName[i]);
    	}
    	colorMenu.add(colorComboBox);
    }

	@Override
	public JPanel getMenu() {
		return colorMenu;
	}


	public Color getColorItem() {
		ColorItem colorItem = new ColorItem(colorComboBox.getSelectedItem().toString());
		return colorItem.getColor();
	}
}
