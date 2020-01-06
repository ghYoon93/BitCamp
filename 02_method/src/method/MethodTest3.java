package method;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * 이름, 국어, 영어, 수학을 입력 받아서 총점과 평균을 구하시오.
 * 총점을 calcTot()구해오기
 * 평균은 calcAvg() 구해오기
 */

public class MethodTest3 {
	public int calcTot(int kor, int eng, int math) {
		return kor + eng + math;
	} // calcTot()
	public double calcAvg(int tot) {
		return tot/3.0;
	} // calcAvg()

	

    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("이름 입력: ");
		String name = br.readLine();
		System.out.print("국어 입력: ");
		int kor = Integer.parseInt(br.readLine());
		System.out.print("영어 입력: ");
		int eng = Integer.parseInt(br.readLine());
		System.out.print("수학 입력: ");
		int math = Integer.parseInt(br.readLine());
		
		br.close();
		MethodTest3 mt = new MethodTest3();
		int tot = mt.calcTot(kor, eng, math);
		double avg = mt.calcAvg(tot);
		
		System.out.println("\t\t*** "+name+"의 성적표 ***");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+tot+"\t"+String.format("%.2f",avg));
		
	} // main()

} // class
