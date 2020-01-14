package io;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JPanel;
import javax.swing.JTextArea;

enum OutputType{
	OUTPUT_SCREEN("Ãâ·Â Ã¢");
	public final String name;
	private OutputType(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}

public class OutputItem implements ICompItem<OutputType, JPanel> {
	HashMap<OutputType, JPanel> list = new HashMap<OutputType, JPanel>();
	public OutputItem() {
		JPanel outputP = new JPanel();
		outputP.setLayout(new BorderLayout());
		for(OutputType type : OutputType.values()) {
			JTextArea outputA = new JTextArea();
			outputP.add("Center", outputA);
			list.put(type, outputP);			
		}
		
	}
	@Override
	public HashMap<OutputType, JPanel> getComp() {
		return list; 
	}

}
