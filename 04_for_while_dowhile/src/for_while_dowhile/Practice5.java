package for_while_dowhile;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * [����5] ���� ���� ���α׷�
 * �߰����, �⸻���, ����Ʈ, �⼮������ �Է¹޾Ƽ� ����Ͻÿ�
 * 
 * ����1) 
 *       (�߰�+�⸻)/2    ---> 60%
 *       ����   	     ---> 20%
 *       �⼮                ---> 20%     
 * ����2)  
 * 		  90�̻� 'A'����     		
 *        80�̻� 'B'����        		  	 
 *        70�̻� 'C'����        		  	 
 *        60�̻� 'D'����        		  	 
 *          ������ 'F'����
 * ����3)
 *          A, B����  ---->"excellent"     
 *          C, D����  ---->"good"
 *          F����    ---->"poor"

 * [������]
 * �߰���縦 �Է��Ͻÿ� : 90
 * �⸻��縦 �Է��Ͻÿ� : 89
 * ���������� �Է��Ͻÿ� : 99
 * �⼮������ �Է��Ͻÿ� : 100

 * ����=93.20         <---�Ҽ����� 2°�ڸ�����
 * ����=A              
 * ��=excellent
 */
public class Practice5 {
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
		if(totalScore >= 90) {
			grade = 'A';
		}else if(totalScore >= 80) {
			grade = 'B';
		}else if (totalScore >= 70) {
			grade = 'C';
		}else if (totalScore >= 60) {
			grade = 'D';
		}else {
			grade = 'F';
		} // if - ����
		
		String evaluation;
		if(grade == 'A' || grade == 'B') {
			evaluation = "excellent";
		}else if(grade == 'A' || grade == 'B') {
			evaluation = "good";
		}else {
			evaluation = "poor";
		} // if - ��
		
		System.out.println("����  = "+String.format("%.2f", totalScore));
		System.out.println("���� = " + grade);
		System.out.println("�� = " + evaluation);
	} // main
}
