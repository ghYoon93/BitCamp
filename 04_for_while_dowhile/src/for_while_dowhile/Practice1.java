package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
[문제1] 가위바위보 게임 - if문
[실행결과]
가위(1),바위(2),보(3) 중 번호 입력 : 3 (user)
컴퓨터 : 바위	나 : 보자기
You Win!!
또 할래(Y/N) : y

가위(1),바위(2),보(3) 중 번호 입력 : 3 (user)
컴퓨터 : 가위	나 : 보자기
You Lose!!
또 할래(Y/N) : y

가위(1),바위(2),보(3) 중 번호 입력 : 2 (user)
컴퓨터 : 가위	나 : 가위
You Draw!!
또 할래(Y/N) : n
프로그램을 종료합니다
 */

public class Practice1 {
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.print("가위(1), 바위(2), 보(3) 중 번호 입력: ");
			int user = Integer.parseInt(br.readLine());
			int computer = (int) (Math.random()*3+1);
			
			Practice1 p1 = new Practice1();
			System.out.println("컴퓨터 : "+p1.toStr(computer) +"    나 : "+p1.toStr(user));
			

			int result = user - computer;
			if(result == -2 || result == 1) System.out.println("You Win!!");
			else if(result == -1 || result == 2) System.out.println("You Lose!!");
			else System.out.println("You Draw!!");
			System.out.println();
			
			
			// 재시작
			System.out.print("또 할래(Y/N) : ");
			String restart = br.readLine();
			System.out.println();
			if(restart.equals("N") || restart.equals("n")) break;
			else if(restart.equals("Y") || restart.equals("y")) continue;
			else {
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
			
		} // while
		System.out.println("프로그램을 종료합니다.");
		
	} // main
    
    public String toStr(int number) {
    	if(number == 1) return "가위";
    	else if(number == 2) return "바위";
    	else  return "보";
    }
   
}
