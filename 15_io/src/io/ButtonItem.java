package io;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JButton;

enum ButtonType{
	INPUT("입력"), OUTPUT("출력"), SEARCH("학번검색"),
	RANKING("순위"), SAVE("파일저장"), READ("파일읽기");
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
