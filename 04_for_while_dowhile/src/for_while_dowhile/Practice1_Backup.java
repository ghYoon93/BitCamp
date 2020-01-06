package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice1_Backup {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.print("가위(1), 바위(2), 보(3) 중 번호 입력: ");
			int user = Integer.parseInt(br.readLine());
			
			int computer = (int) (Math.random()*3+1);
			if(computer == 1) {
				System.out.print("컴퓨터 : 가위\t");
			}else if (computer == 2) {
				System.out.print("컴퓨터 : 바위\t");
			}else {
				System.out.print("컴퓨터 : 보\t");
			}
			
			
			if(user == 1) {
				System.out.print("나 : 가위");
			}else if (user == 2) {
				System.out.print("나 : 바위");
			}else {
				System.out.print("나: 보");
			}
			System.out.println();
			
			int result = user - computer;
			if(result == -2 || result == 1) {
				System.out.println("You Win!!");
			}else if(result == -1 || result == 2) {
				System.out.println("You Lose!!");
			} else {
				System.out.println("You Draw!!");
			}
			System.out.print("또 할래(Y/N) : ");
			String restart = br.readLine();
			if(restart.equalsIgnoreCase("N")) break;	
		} // while
		System.out.println("프로그램을 종료합니다.");
		
	} // main
}
