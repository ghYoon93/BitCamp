package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * [����6]
	����5������ ����2, ����3�� if������ ó���� ���� switch�� �ٲٽÿ�
 */
public class Practice6 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
		System.out.print("�߰���縦 �Է��Ͻÿ�: ");
		int midExam = Integer.parseInt(br.readLine());
		System.out.print("�⸻��縦 �Է��Ͻÿ�: ");
		int finalExam = Integer.parseInt(br.readLine());
		System.out.print("���������� �Է��Ͻÿ�: ");
		int report = Integer.parseInt(br.readLine());
		System.out.print("�⼮������ �Է��Ͻÿ�: ");
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
		
		} // switch - ����
		
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
		} // switch - ��;
		
		System.out.println("����  = "+String.format("%.2f", totalScore));
		System.out.println("���� = " + grade);
		System.out.println("�� = " + evaluation);
	} // main
}
