package array;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MultiArray6 {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	System.out.print("인원 수 : ");  // for
    	int cnt = Integer.parseInt(br.readLine());
    	String[] name = new String[cnt];
    	String[][] subject = new String[cnt][];
    	int[][] jumsu = new int[cnt][];
    	int[] total = new int[cnt];
    	double[] avg = new double[cnt];
    	
    	for(int i = 0 ; i < cnt; i++) {
    		System.out.print("이름 입력 : ");
    		name[i] = br.readLine();
    		System.out.print("과목 수 입력 : "); // for
    		int subjectCnt = Integer.parseInt(br.readLine());
    		subject[i] = new String[subjectCnt];
    		for(int j = 0; j < subjectCnt; j++) {    			
    			System.out.print("과목 명 입력 : ");
    			subject[i][j] = br.readLine();
    		} // for - 과목 명 이름
    		jumsu[i] = new int[subjectCnt];
    		for(int j = 0; j < subjectCnt; j++) {
    			System.out.print(subject[i][j]+" 점수 입력 : ");
    			jumsu[i][j] = Integer.parseInt(br.readLine());
    			total[i] += jumsu[i][j];
    		} // for - 점수 입력 및 총점 계산
    		avg[i] = (double)total[i] / subjectCnt;
    		System.out.println("------------------------------------------");
    	} // for - 입력 (이름, 과목 수, 과목 명, 점수, 총점)
    	
    	for(int i = 0; i < cnt; i++) {
    		System.out.print("이름\t");
    		for(int j = 0; j < subject[i].length; j++) {
    			System.out.print(subject[i][j]+"\t");
    		} // for - 과목 명 출력
    		System.out.println("총점\t평균");
    		
    		System.out.print(name[i]+"\t");
    		for(int j = 0; j < subject[i].length; j++) {
    			System.out.print(jumsu[i][j]+"\t");
    		} // for - 점수 출력
    		System.out.println(total[i]+"\t"+String.format("%.2f",avg[i]));
    		System.out.println();
    	} // for - 출력

    	
    }
}
