package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ScoreImpl implements Score {
	private Pane<InputType, JPanel> centerPane;
	private ArrayList<ScoreDTO> dtoList = new ArrayList<ScoreDTO>();
	private ScoreDTO dto;
	private JTextArea output;
    public ScoreImpl(Pane<InputType, JPanel> centerPane, Pane<InputType, JPanel> southPane) {
    	this.centerPane = centerPane;
    	JPanel centerRP= (JPanel) this.centerPane.getPane().getComponent(1);
    	JPanel outputP = (JPanel) centerRP.getComponent(0);
    	output = (JTextArea) outputP.getComponent(0);
    }
    public void callEvent(ButtonType cmd) {
    	if(cmd.equals(ButtonType.INPUT)) {
    		input(dto);
    	}
    	if(cmd.equals(ButtonType.OUTPUT)) {
    		print(output);
    	}
    	if(cmd.equals(ButtonType.SEARCH)) {
    	}
    	if(cmd.equals(ButtonType.RANKING)) {
    	}
    	if(cmd.equals(ButtonType.SAVE)) {
    	}
    	if(cmd.equals(ButtonType.READ)) {
    	}
    }
	@Override
	public void input(ScoreDTO dto) {
//		JPanel centerLP = (JPanel) centerPane.getPane().getComponent(0);
		HashMap<InputType, JPanel> inputList = centerPane.getComp();
		Iterator<InputType> key = inputList.keySet().iterator();
		String hak = "", name = "";
		int kor = 0, eng = 0, math = 0;
		while(key.hasNext()) {
			InputType type = key.next();
			JPanel input = inputList.get(type);
			JTextField inputValue = (JTextField) input.getComponent(1);
//			System.out.println(inputValue.getText());
			if(type.equals(InputType.HAK)) hak = inputValue.getText();
			if(type.equals(InputType.NAME)) name = inputValue.getText();
			if(type.equals(InputType.KOR)) kor = Integer.parseInt(inputValue.getText().trim());
			if(type.equals(InputType.ENG)) eng = Integer.parseInt(inputValue.getText().trim());
			if(type.equals(InputType.MATH)) math = Integer.parseInt(inputValue.getText().trim());
		}
		dto = new ScoreDTO(hak, name, kor, eng, math);
		dto.setTot();
		dto.setAvg();
		dtoList.add(dto);
		ObjectOutputStream oos;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("score.txt"));
			oos.writeObject(dtoList);
			oos.close();
		}  catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void print(JTextArea output) {
		ObjectInputStream ois;
		output.setText("");
		try {
			ois = new ObjectInputStream(new FileInputStream("score.txt"));
			try {
				System.out.println("학번\t이름\t국어\t수학\t총점\t평균");
				output.append("학번\t이름\t국어\t수학\t총점\t평균\n");
				dtoList = (ArrayList<ScoreDTO>) ois.readObject(); 
				for(ScoreDTO dto : dtoList) {
					output.append(dto.getHak()+"\t");
					output.append(dto.getName()+"\t");
					output.append(dto.getEng()+"\t");
					output.append(dto.getMath()+"\t");
					output.append(dto.getTot()+"\t");
					output.append(dto.getAvg()+"\n");	
//					System.out.print(dto.getHak()+"\t");
//					System.out.print(dto.getName()+"\t");
//					System.out.print(dto.getEng()+"\t");
//					System.out.print(dto.getMath()+"\t");
//					System.out.print(dto.getTot()+"\t");
//					System.out.println(dto.getAvg());					
				}
//				if(dto == null) 
				
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void search(JTextArea output) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tot_desc() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void load() {
		// TODO Auto-generated method stub
		
	}

}
