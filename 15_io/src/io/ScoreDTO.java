package io;

public class ScoreDTO {
	private String hak, name;
    private int kor, eng, math, tot;
    private double avg;
    
    public ScoreDTO(String hak, String name, int kor, int eng, int math, int tot, double avg) {
    	this.hak = hak;
    	this.name = name;
    	this.kor = kor;
    	this.eng = eng;
    	this.math = math;
    	this.tot = tot;
    	this.avg = avg;
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

	public int getTot() {
		return tot;
	}

	public double getAvg() {
		return avg;
	}
}
