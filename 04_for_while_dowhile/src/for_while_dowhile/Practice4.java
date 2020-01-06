package for_while_dowhile;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * [문제4] 덧셈 공부
 * 10~99 사이의 난수를 2개(a,b) 발생하여 합을 맞추는 게임
 * 문제수는 총 5문제를 제공한다
 * 1문제당 점수 20점씩 계산
 * 만약 틀리면 기회를 1번 더 제공한다

 * [실행결과]
 * [1] 25 + 36 = 45
 * 틀렸다
 * [1] 25 + 36 = 61
 * 딩동뎅

 * [2] 78 + 10 = 100
 * 틀렸다
 * [2] 78 + 10 = 95
 * 틀렸다...정답 :
 * ...

 * 당신의 총 x문제를 맞추어서 xx점 입니다

 * continue(y/n) : w
 * continue(y/n) : n
 * 프로그램을 종료합니다
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
    					System.out.println("딩동댕");
    					count += 1;
    					score += 20;
    					break;
    				}else {
    					System.out.println("틀렸다...");
    					if(j == 2) {
    						System.out.println("정답:" + answer);
    					}
    				}
    			} // while - 기회
    		} // for - 5문제
    		
    		System.out.println();
    		System.out.println("당신은 총 "+count+"문제를 맞추어서 "+score+"점 입니다.");
    		System.out.println();
    		
    		while(true) {
    			System.out.print("continue (Y/N) : ");
    			String con = br.readLine();
    			if(con.equals("Y") || con.equals("y")) {
    				break;
    			}else if(con.equals("N") || con.equals("n")){
    				System.out.println("프로그램을 종료합니다.");
    				sw = false;
    				break;
    			}else {

    			}
    		} // while - 새로운 공부 시작 여부
    	} // while - 숫자공부
    } // main
}
