package array;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practice2 {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	while(true) {
    		System.out.print("10���� �Է�: ");
    		int decimal = Integer.parseInt(br.readLine());
    		if(decimal == 0) {
    			System.out.println("���α׷� ����");
    			break;
    		} // if - ���� ����
    		
    		if(decimal > 0) {
    			int[] binary = new int[32];
    			int size = 0;
    			while(decimal > 0) {
					binary[size] = decimal%2;
					decimal/=2;
					size++;    				
    			} // while - 2���� ��ȯ
    			
    			for(int i = size; i > 0; i--) {
    				System.out.print(binary[i-1]);
    				if(i % 4 == 1) System.out.print(" ");
    			} // for - ��� ���
    			System.out.println();
    		} // if - ���� �Է�
    	} // while
    }  // main
}
