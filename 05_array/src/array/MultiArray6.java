package array;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MultiArray6 {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	System.out.print("�ο� �� : ");  // for
    	int cnt = Integer.parseInt(br.readLine());
    	String[] name = new String[cnt];
    	String[][] subject = new String[cnt][];
    	int[][] jumsu = new int[cnt][];
    	int[] total = new int[cnt];
    	double[] avg = new double[cnt];
    	
    	for(int i = 0 ; i < cnt; i++) {
    		System.out.print("�̸� �Է� : ");
    		name[i] = br.readLine();
    		System.out.print("���� �� �Է� : "); // for
    		int subjectCnt = Integer.parseInt(br.readLine());
    		subject[i] = new String[subjectCnt];
    		for(int j = 0; j < subjectCnt; j++) {    			
    			System.out.print("���� �� �Է� : ");
    			subject[i][j] = br.readLine();
    		} // for - ���� �� �̸�
    		jumsu[i] = new int[subjectCnt];
    		for(int j = 0; j < subjectCnt; j++) {
    			System.out.print(subject[i][j]+" ���� �Է� : ");
    			jumsu[i][j] = Integer.parseInt(br.readLine());
    			total[i] += jumsu[i][j];
    		} // for - ���� �Է� �� ���� ���
    		avg[i] = (double)total[i] / subjectCnt;
    		System.out.println("------------------------------------------");
    	} // for - �Է� (�̸�, ���� ��, ���� ��, ����, ����)
    	
    	for(int i = 0; i < cnt; i++) {
    		System.out.print("�̸�\t");
    		for(int j = 0; j < subject[i].length; j++) {
    			System.out.print(subject[i][j]+"\t");
    		} // for - ���� �� ���
    		System.out.println("����\t���");
    		
    		System.out.print(name[i]+"\t");
    		for(int j = 0; j < subject[i].length; j++) {
    			System.out.print(jumsu[i][j]+"\t");
    		} // for - ���� ���
    		System.out.println(total[i]+"\t"+String.format("%.2f",avg[i]));
    		System.out.println();
    	} // for - ���

    	
    }
}
