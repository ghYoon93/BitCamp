package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * [문제6]
	문제5번에서 조건2, 조건3의 if문으로 처리한 것을 switch로 바꾸시오
 */
public class Practice6 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
		System.out.print("중간고사를 입력하시오: ");
		int midExam = Integer.parseInt(br.readLine());
		System.out.print("기말고사를 입력하시오: ");
		int finalExam = Integer.parseInt(br.readLine());
		System.out.print("과제점수를 입력하시오: ");
		int report = Integer.parseInt(br.readLine());
		System.out.print("출석점수를 입력하시오: ");
		int attend = Integer.parseInt(br.readLine());
		System.out.println();
		
		double examScore = ((midExam+finalExam)/2.0)*0.6;
		double reportScore = report * 0.2;
		double attendScore = attend * 0.2;
		double totalScore = (examScore+reportScore+attendScore);
		
		char grade;
		switch((int)totalScore) {
		case 100:
		case 90:
			grade = 'A';
			break;
		case 80:
			grade = 'B';
			break;
		case 70:
			grade = 'C';
			break;
		case 60:
			grade = 'D';
			break;
		default:
			grade = 'F';
		
		} // switch - 학점
		
		String evaluation;
		switch(grade) {
		case 'A':
		case 'B':
			evaluation = "excellent";
			break;
		case 'C':
		case 'D':
			evaluation = "good";
			break;
		default :
			evaluation = "poor";
		} // switch - 평가;
		
		System.out.println("성적  = "+String.format("%.2f", totalScore));
		System.out.println("학점 = " + grade);
		System.out.println("평가 = " + evaluation);
	} // main
}
