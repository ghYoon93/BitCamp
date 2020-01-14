package io;

import java.awt.FlowLayout;
import java.util.HashMap;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

enum InputType{
	HAK("학번"), NAME("이름"), KOR("국어"),
	ENG("영어"), MATH("수학");
	public final String name;
	private InputType(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}

public class InputItem implements ICompItem<InputType, JPanel> {
	private HashMap<InputType, JPanel> list = new HashMap<InputType, JPanel>();
//	private ArrayList<JPanel> list = new ArrayList<JPanel>();
    public InputItem() {
    	for(InputType type : InputType.values()) {
    		JPanel inputP = new JPanel();
    		inputP.setLayout(new FlowLayout());
    		JLabel inputL = new JLabel(type.getName());
    		inputP.add(inputL);
    		JTextField inputF = new JTextField(10);
    		inputP.add(inputF);
//    		list.add(inputP);
    		list.put(type, inputP);
    	}
    }
	@Override
	public HashMap<InputType, JPanel> getComp() {
		return list;
	}

}
