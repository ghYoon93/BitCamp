package io;

import java.awt.FlowLayout;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JPanel;

public class SouthPane implements Pane{
	private JPanel pane;
	HashMap<ButtonType, JButton> list;
	public SouthPane(ScoreForm scoreForm) {
		
		pane = new JPanel();
    	pane.setLayout(new FlowLayout());
    	
    	ICompItem<ButtonType, JButton> buttonItem = new ButtonItem();
    	list = buttonItem.getComp();
    	Iterator<ButtonType> keys = list.keySet().iterator();
    	while(keys.hasNext()) {
    		ButtonType key = keys.next();
    		JButton button = list.get(key);
    		button.addActionListener(scoreForm);
    		pane.add(button);
    	}
    }
	@Override
	public JPanel getPane() {
		return pane;
	}
}
