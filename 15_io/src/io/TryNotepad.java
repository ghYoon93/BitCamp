package io;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TryNotepad extends JFrame implements ActionListener {
	private JTextArea area;
	private JScrollPane scroll;
	private MenuPane menu;
	private File file;
//	private FileWriter fw;
	
	public TryNotepad() {
		super("간단 메모장");
		area = new JTextArea();
		scroll = new JScrollPane(area);
		area.setFont(new Font("고딕체", Font.PLAIN, 24));
		menu = new MenuPane();
		
		
		
		setJMenuBar(menu);
		add("Center", scroll);
//		scroll.add(output);
		setBounds(700,100,600,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	} // TryNotepad();
	
	public void event() {
		menu.getNewM().addActionListener(this);
		menu.getOpenM().addActionListener(this);
		menu.getSaveM().addActionListener(this);
		menu.getExitM().addActionListener(this);
		menu.getPasteM().addActionListener(this);
		menu.getCopyM().addActionListener(this);
		menu.getCutM().addActionListener(this);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e1) {
		String command= e1.getActionCommand();
		
		if(command.equals("새로 만들기")) {
			area.setText("");
		}
		if(command.equals("열기")) {
			// 열기 다이얼로그
			openDialog();
			// file 읽기
			if(file != null) fileRead();
		}
		if(command.equals("저장")) {
			saveDialog();
			if(file != null) fileWrite();
			System.exit(0);
			
		}
		if(command.equals("나가기")) {
			int result = JOptionPane.showConfirmDialog(null, "저장하시겠습니까?", "메모장", JOptionPane.YES_NO_CANCEL_OPTION);
			if(result == JOptionPane.YES_OPTION){
				// 파일 저장 후 종료
				System.exit(0);
			} else if(result == JOptionPane.NO_OPTION){
			System.exit(0);				
			}
		}
		if(command.equals("자르기")) {
			area.cut();
		}
		if(command.equals("복사")) {
			area.copy();
		}
		if(command.equals("붙여넣기")) {
			area.paste();
		}
	} // actionPerformed();
	
	public void openDialog() {
		JFileChooser chooser = new JFileChooser();
		int result = chooser.showOpenDialog(this);
		if(result == JFileChooser.APPROVE_OPTION) {
			file = chooser.getSelectedFile();
		}
//		JOptionPane.showMessageDialog(this, file);
	}
	public void saveDialog() {
		JFileChooser chooser = new JFileChooser();
		int result = chooser.showSaveDialog(this);
		if(result == JFileChooser.APPROVE_OPTION) {
			file = chooser.getSelectedFile();
		}
	}
	public void fileRead() {
		area.setText("");
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;
			while((line = br.readLine()) != null) {
				area.append(line);
				area.append("\n");
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void fileWrite() {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			String data = area.getText();
			bw.write(data);
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
    public static void main(String[] args) {
		new TryNotepad().event();
	} //  main();
	
}
