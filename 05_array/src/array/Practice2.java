package array;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practice2 {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	while(true) {
    		System.out.print("10진수 입력: ");
    		int decimal = Integer.parseInt(br.readLine());
    		if(decimal == 0) {
    			System.out.println("프로그램 종료");
    			break;
    		} // if - 종료 조건
    		
    		if(decimal > 0) {
    			int[] binary = new int[32];
    			int size = 0;
    			while(decimal > 0) {
					binary[size] = decimal%2;
					decimal/=2;
					size++;    				
    			} // while - 2진수 변환
    			
    			for(int i = size; i > 0; i--) {
    				System.out.print(binary[i-1]);
    				if(i % 4 == 1) System.out.print(" ");
    			} // for - 결과 출력
    			System.out.println();
    		} // if - 정상 입력
    	} // while
    }  // main
}
