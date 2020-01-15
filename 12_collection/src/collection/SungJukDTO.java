package collection;

import java.text.DecimalFormat;

public class SungJukDTO implements Comparable<SungJukDTO>{
    private int number, kor, eng, math, total;
    private double avg;
    private String name;
    
	public void setNumber(int number) {
		this.number = number;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTot() {
		total = kor + eng + math;
	}
	public void setAvg() {
		avg = total / 3.0;
	}
	public int getNumber() {
		return number;
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
	public int getTotal() {
		return total;
	}
	public double avg() {
		return avg;
	}
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat();
		return number+"\t"+name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+"\t"+total+"\t"+df.format(avg);
		
	}
	public int compareTo(SungJukDTO dto) {
		return name.compareTo(dto.name);
	}
	
    
}
