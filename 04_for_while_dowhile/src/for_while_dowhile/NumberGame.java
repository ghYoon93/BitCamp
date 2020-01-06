package for_while_dowhile;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/*
 * 숫자 맞추기 게임
 * 1~100 사이의 난수를 발생하여 맞추는 게임
 * 
 * [실행 결과]
 * 숫자 입력: 50
 * 50보다 큽니다.
 * 숫자 입력: 90
 * 90보다 작습니다.
 * 
 * ...
 * 숫자 입력: 87
 * 딩동댕 xx번만에 맞추셨습니다.
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
        		System.out.print("숫자 입력: ");
        		int user = Integer.parseInt(br.readLine());
        		
        		if(user == com) {
        			System.out.println("딩동댕 "+count+"번만에 맞추셨습니다.");
        			break;
        		}else if(user > com) {
        			System.out.println(user+"보다 작습니다.");
        		}else {
        			System.out.println(user+"보다 큽니다.");
        		}
        	}// 숫자 확인 while
        	
        	
        	while(true) {
        		System.out.print("또 하시겠습니까? (Y/N): ");
            	String restart = br.readLine();
            	
            	if(restart.equals("Y") || restart.equals("y")) {
            		System.out.println("게임을 재시작합니다!");
            		break;
            	}else if(restart.equals("N") || restart.equals("n")) {
            		System.out.println("프로그램을 종료합니다.");
            		restartCheck = false;
            		break;
            	}else {
            		System.out.println("잘못 입력하셨습니다.");
            	} 
        	} // 재시작 while
    	} while(restartCheck); // 숫자 게임 do - while
    	
    	
    } // main
}
