package for_while_dowhile;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * 소수 - 1과 자기자신의 수
 * 소수를 구하기
 * 단, 0이 입력되면 프로그램 종료합니다.
 * 
 * [실행 결과]
 * 숫자 입력: 12
 * 12는 소수가 아니다.
 * 
 * 숫자 입력: 37
 * 37는 소수이다.
 * 
 * 숫자입력: 0
 * 프로그램을 종료합니다.
 */

public class ForTest_Sosu {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	while(true) {
    		System.out.print("숫자 입력: ");
        	int number = Integer.parseInt(br.readLine());
        	boolean sw = true;
    		if(number == 0) {
    			System.out.println("프로그램을 종료합니다.");
    			break;
    		} // while-  종료 조건
    		
			if(number == 1) {
				sw = false;
			}
    		for(int i = 2; i <= number/2; i++) {
    			if(number % i == 0 ) {
    				sw = false;
    			}
    		} // for - 소수 찾기
    		
    		if(sw) {
    			System.out.println(number+"는 소수이다.");
    		}else {
    			System.out.println(number+"는 소수가 아니다.");
    		} // if - 결과 출력
    		System.out.println();
    	} // while
    } // main
}
