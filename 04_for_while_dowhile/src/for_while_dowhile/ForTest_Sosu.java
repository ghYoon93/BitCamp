package for_while_dowhile;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * �Ҽ� - 1�� �ڱ��ڽ��� ��
 * �Ҽ��� ���ϱ�
 * ��, 0�� �ԷµǸ� ���α׷� �����մϴ�.
 * 
 * [���� ���]
 * ���� �Է�: 12
 * 12�� �Ҽ��� �ƴϴ�.
 * 
 * ���� �Է�: 37
 * 37�� �Ҽ��̴�.
 * 
 * �����Է�: 0
 * ���α׷��� �����մϴ�.
 */

public class ForTest_Sosu {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	while(true) {
    		System.out.print("���� �Է�: ");
        	int number = Integer.parseInt(br.readLine());
        	boolean sw = true;
    		if(number == 0) {
    			System.out.println("���α׷��� �����մϴ�.");
    			break;
    		} // while-  ���� ����
    		
			if(number == 1) {
				sw = false;
			}
    		for(int i = 2; i <= number/2; i++) {
    			if(number % i == 0 ) {
    				sw = false;
    			}
    		} // for - �Ҽ� ã��
    		
    		if(sw) {
    			System.out.println(number+"�� �Ҽ��̴�.");
    		}else {
    			System.out.println(number+"�� �Ҽ��� �ƴϴ�.");
    		} // if - ��� ���
    		System.out.println();
    	} // while
    } // main
}
