package io;

import java.awt.event.InputEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class MenuPane extends JMenuBar {
	private JMenu fileM, editM, viewM;
	private JMenuItem newM, openM, saveM, exitM, cutM, copyM, pasteM;
    
	public MenuPane() {
    	fileM = new JMenu("파일");
    	newM = new JMenuItem("새로 만들기");
    	openM = new JMenuItem("열기");
    	saveM = new JMenuItem("저장");
    	exitM = new JMenuItem("나가기");
    	fileM.add(newM);
    	fileM.add(openM);
    	fileM.add(saveM);
    	fileM.add(exitM);
    	add(fileM);
    	
    	editM = new JMenu("편집");
    	cutM = new JMenuItem("자르기");
    	cutM.setAccelerator(KeyStroke.getKeyStroke('X', InputEvent.ALT_MASK));
    	copyM = new JMenuItem("복사");
    	copyM.setAccelerator(KeyStroke.getKeyStroke('V', InputEvent.ALT_MASK));
    	pasteM = new JMenuItem("붙여넣기");
    	editM.add(cutM);
    	editM.add(copyM);
    	editM.add(pasteM);
    	add(editM);
    	
    	viewM = new JMenu("보기");
    	add(viewM);
    }

	public JMenu getFileM() {
		return fileM;
	}

	public JMenu getEditM() {
		return editM;
	}

	public JMenu getViewM() {
		return viewM;
	}

	public JMenuItem getNewM() {
		return newM;
	}

	public JMenuItem getOpenM() {
		return openM;
	}

	public JMenuItem getSaveM() {
		return saveM;
	}

	public JMenuItem getExitM() {
		return exitM;
	}

	public JMenuItem getCutM() {
		return cutM;
	}

	public JMenuItem getCopyM() {
		return copyM;
	}

	public JMenuItem getPasteM() {
		return pasteM;
	}
}
