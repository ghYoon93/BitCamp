package io;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JButton;

enum ButtonType{
	INPUT("�Է�"), OUTPUT("���"), SEARCH("�й��˻�"),
	RANKING("����"), SAVE("��������"), READ("�����б�");
	public final String name;
	private ButtonType(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}

public class ButtonItem implements ICompItem<ButtonType, JButton>{
	private HashMap<ButtonType, JButton> list = new HashMap<ButtonType, JButton>();
//	HashMap<ButtonType, JButton> buttonValue = new HashMap<ButtonType, JButton>();
	public ButtonItem() {
		for(ButtonType type : ButtonType.values()) {
			JButton button = new JButton(type.getName());
			list.put(type, button);
		}
	}
	@Override
	public HashMap<ButtonType, JButton> getComp() {
		return list;
	}
    
}
