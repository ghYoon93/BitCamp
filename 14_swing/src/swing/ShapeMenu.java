package swing;

import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class ShapeMenu implements IMenu{
	private JPanel shapeMenu;
    private String[] shape = {"선","원","사각형","둥근 사각형"};
    private JRadioButton shapeB;
    private ArrayList<JRadioButton> shapeList;
//    private JRadioButton[] shapeB;
    public ShapeMenu() {
    	shapeList = new ArrayList<JRadioButton>();
    	for(int i=0; i < shape.length; i++) {
    		shapeB = new JRadioButton(shape[i]);
    		if(shape[i].equals("사각형")) shapeB.setSelected(true);
    		shapeList.add(shapeB);
    	}
    	
    	shapeMenu = new JPanel();
    	shapeMenu.setLayout(new FlowLayout());
    	ButtonGroup shapeGroup = new ButtonGroup();
    	for(JRadioButton each : shapeList) {
    		shapeGroup.add(each);
    		shapeMenu.add(each);
    	}
    }
    @Override
    public JPanel getMenu() {
    	return shapeMenu;
    }
    
    public String getShape() {
    	for(JRadioButton each : shapeList) {
    		if(each.isSelected()) {
    			return each.getActionCommand();
    		}
    	}
    	return null;
    }
}
