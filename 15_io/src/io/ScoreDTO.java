package io;

import java.io.Serializable;

public class ScoreDTO implements Serializable {
	private String hak, name;
    private int kor, eng, math, tot;
    private double avg;
    
    public ScoreDTO(String hak, String name, int kor, int eng, int math) {
    	this.hak = hak;
    	this.name = name;
    	this.kor = kor;
    	this.eng = eng;
    	this.math = math;
    }

	public String getHak() {
		return hak;
	}

	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}
	public void setTot() {
		tot = kor+eng+math;
	}
	public int getTot() {
		return tot;
	}
	public void setAvg() {
		avg = tot / 3.0;
	}
	public double getAvg() {
		return avg;
	}
}
