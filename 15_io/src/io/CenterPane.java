package io;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CenterPane implements Pane{
	private JPanel centerP; 
	private HashMap<InputType, JPanel> inputList;
	private HashMap<OutputType, JPanel> outputList;
    public CenterPane() {
    	centerP = new JPanel();
    	centerP.setLayout(new BorderLayout());
    	ICompItem<InputType, JPanel> inputItem = new InputItem();
    	JPanel centerLP = new JPanel();
    	centerLP.setLayout(new GridLayout(inputList.size(), 1));
    	inputList = inputItem.getComp();
    	Iterator<InputType> keys = inputList.keySet().iterator();
    	while(keys.hasNext()) {
    		InputType key = keys.next();
    		JPanel pane = inputList.get(key);
    		centerLP.add(pane);
    	}
    	centerP.add("West",centerLP);
    	
    	JPanel centerRP = new JPanel();
    	centerRP.setLayout(new BorderLayout());
    	ICompItem<OutputType, JPanel> outputItem = new OutputItem();
    	outputList = outputItem.getComp();
    	Iterator<OutputType> keys2 = outputList.keySet().iterator();
    	while(keys2.hasNext()) {
    		OutputType key = keys2.next();
    		JPanel pane = outputList.get(key);
    		centerRP.add("Center", pane);
    	}
    	centerP.add("Center", centerRP);
    } // CenterPane();
	@Override
	public JPanel getPane() {
		return centerP;
	}
	
	
}
