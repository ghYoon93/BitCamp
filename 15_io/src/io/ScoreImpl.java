package io;

import java.util.ArrayList;

import javax.swing.JTextArea;

public class ScoreImpl implements Score {
	private Pane southPane, centerPane;
	private ArrayList<ScoreDTO> dtoList;
	private ScoreDTO dto;
    public ScoreImpl(Pane centerPane, Pane southPane) {
    	this.southPane = southPane;
    	this.centerPane = centerPane;
    }
    public void callEvent(ButtonType cmd) {
    	if(cmd.equals(ButtonType.INPUT)) {
    		input(dto);
    	}
    	if(cmd.equals(ButtonType.OUTPUT)) {
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
		
//		dto = new ScoreDTO();
		dtoList.add(dto);
	}

	@Override
	public void print(JTextArea output) {
		// TODO Auto-generated method stub
		
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
