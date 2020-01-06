package for_while_dowhile;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/*
 * ���� ���߱� ����
 * 1~100 ������ ������ �߻��Ͽ� ���ߴ� ����
 * 
 * [���� ���]
 * ���� �Է�: 50
 * 50���� Ů�ϴ�.
 * ���� �Է�: 90
 * 90���� �۽��ϴ�.
 * 
 * ...
 * ���� �Է�: 87
 * ������ xx������ ���߼̽��ϴ�.
 */
public class NumberGame {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		boolean restartCheck = true;
    	do {
    		int com = (int)(Math.random()*100+1);
        	int count = 0;
        	while(true) {
        		count++;
        		System.out.print("���� �Է�: ");
        		int user = Integer.parseInt(br.readLine());
        		
        		if(user == com) {
        			System.out.println("������ "+count+"������ ���߼̽��ϴ�.");
        			break;
        		}else if(user > com) {
        			System.out.println(user+"���� �۽��ϴ�.");
        		}else {
        			System.out.println(user+"���� Ů�ϴ�.");
        		}
        	}// ���� Ȯ�� while
        	
        	
        	while(true) {
        		System.out.print("�� �Ͻðڽ��ϱ�? (Y/N): ");
            	String restart = br.readLine();
            	
            	if(restart.equals("Y") || restart.equals("y")) {
            		System.out.println("������ ������մϴ�!");
            		break;
            	}else if(restart.equals("N") || restart.equals("n")) {
            		System.out.println("���α׷��� �����մϴ�.");
            		restartCheck = false;
            		break;
            	}else {
            		System.out.println("�߸� �Է��ϼ̽��ϴ�.");
            	} 
        	} // ����� while
    	} while(restartCheck); // ���� ���� do - while
    	
    	
    } // main
}
