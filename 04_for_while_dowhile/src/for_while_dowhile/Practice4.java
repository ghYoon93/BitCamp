package for_while_dowhile;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * [����4] ���� ����
 * 10~99 ������ ������ 2��(a,b) �߻��Ͽ� ���� ���ߴ� ����
 * �������� �� 5������ �����Ѵ�
 * 1������ ���� 20���� ���
 * ���� Ʋ���� ��ȸ�� 1�� �� �����Ѵ�

 * [������]
 * [1] 25 + 36 = 45
 * Ʋ�ȴ�
 * [1] 25 + 36 = 61
 * ������

 * [2] 78 + 10 = 100
 * Ʋ�ȴ�
 * [2] 78 + 10 = 95
 * Ʋ�ȴ�...���� :
 * ...

 * ����� �� x������ ���߾ xx�� �Դϴ�

 * continue(y/n) : w
 * continue(y/n) : n
 * ���α׷��� �����մϴ�
*/

public class Practice4 {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	boolean sw = true;
    	while(sw) {
    		int score = 0;
    		int count = 0;
    		
    		for(int i = 1; i <=5; i++) {
    			int a = (int)(Math.random()*90+10);
    			int b = (int)(Math.random()*90+10);
    			int answer = a + b;
    			
    			for(int j = 1; j <= 2; j++) {   			
    				System.out.print("["+i+"] "+a+" + "+b+" = ");
    				int myAnswer = Integer.parseInt(br.readLine());
    				
    				if(myAnswer == answer) {
    					System.out.println("������");
    					count += 1;
    					score += 20;
    					break;
    				}else {
    					System.out.println("Ʋ�ȴ�...");
    					if(j == 2) {
    						System.out.println("����:" + answer);
    					}
    				}
    			} // while - ��ȸ
    		} // for - 5����
    		
    		System.out.println();
    		System.out.println("����� �� "+count+"������ ���߾ "+score+"�� �Դϴ�.");
    		System.out.println();
    		
    		while(true) {
    			System.out.print("continue (Y/N) : ");
    			String con = br.readLine();
    			if(con.equals("Y") || con.equals("y")) {
    				break;
    			}else if(con.equals("N") || con.equals("n")){
    				System.out.println("���α׷��� �����մϴ�.");
    				sw = false;
    				break;
    			}else {

    			}
    		} // while - ���ο� ���� ���� ����
    	} // while - ���ڰ���
    } // main
}
