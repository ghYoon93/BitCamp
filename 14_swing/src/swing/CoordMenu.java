package swing;

import java.awt.FlowLayout;
import java.util.HashMap;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class CoordMenu implements IMenu{
	private JPanel coordMenu;
	private String[] coordName = {"x1","x2","y1","y2","z1","z2"};
	private JPanel coordPane;
	private JLabel coordL;
	private HashMap<String, JTextField> coordMap;
	private int[] coordList;
	private JTextField coordT;
	
    public CoordMenu() {
    	coordMenu = new JPanel();
    	coordMenu.setLayout(new FlowLayout());
    	
    	coordMap = new HashMap<String, JTextField>();
    	coordPane = new JPanel();
    	coordPane.setLayout(new FlowLayout());
    	for(String each : coordName) {
    		coordL = new JLabel(each);
    		System.out.println(each);
    		coordT = new JTextField(5);
    		coordMap.put(each, coordT);
    		coordPane.add(coordL);
    		coordPane.add(coordMap.get(each));
    		coordMenu.add(coordPane);
    	}
    	
    	
    	
    }
	@Override
	public JPanel getMenu() {
		return coordMenu;
		
	}
	
	public int[] getCoord() {
		coordList = new int[6];
		for(int i=0; i<6; i++) {
			coordList[i] = new Coord(coordMap.get(coordName[i])).getCoord();
		}
		return coordList;
	}
}