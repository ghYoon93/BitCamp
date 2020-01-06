package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
[문제8] 계좌관리 프로그램
예금, 출금, 잔고, 종료 기능을 제공하는 간단 계좌관리 프로그램을 작성하시오.
조건) 예금은 input(), 출금은 output()에서 처리하세요

[실행결과]
****************
   1. 예금
   2. 출금
   3. 잔고
   4. 종료
****************
번호 선택 : 1
예금액 : 10000
당신의 잔액은 10000원 입니다
또는
예금액 : 12000
만원 단위로 입력하세요

****************
   1. 예금
   2. 출금
   3. 잔고
   4. 종료
****************
번호 선택 : 2
출금액 : 8000
당신의 잔액은 2000원 입니다
또는 
출금액 : 18000
잔액이 부족합니다

1. 예금 2. 출금 3. 잔고 4. 종료
번호 선택 : 3
당신의 잔액은 2000원 입니다

1. 예금 2. 출금 3. 잔고 4. 종료
번호 선택 : 4
프로그램을 종료합니다.

 */

public class Practice8 {
     public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
		
		boolean sw = true;
		int balance = 0;
		while(sw) {
			System.out.println("****************");
			System.out.println("   1. 예금");
			System.out.println("   2. 출금");
			System.out.println("   3. 잔고");
			System.out.println("   4. 종료");
			System.out.println("****************");
			
			Practice8 p8 = new Practice8();
			while(true) {
				System.out.print("번호 선택: ");
				int choice = Integer.parseInt(br.readLine());
				
				if(choice == 1) {
					System.out.print("예금액: ");
					int deposit = Integer.parseInt(br.readLine());
					balance = p8.input(deposit, balance);
					break;
				}else if(choice == 2) {
					System.out.print("출금액: ");
					int forwarding = Integer.parseInt(br.readLine());
					balance = p8.output(forwarding, balance);
					break;
				}else if(choice == 3) {
					System.out.println("당신의 잔액은 "+balance+" 입니다.");
					break;
				}else if (choice == 4) {
					System.out.println("프로그램을 종료합니다.");
					sw = false;
					break;
				}else {
					System.out.println("잘못 입력하셨습니다.");
				}
			} // while 번호 선택
			
		} // while 계좌관리 프로그램 메뉴
	} // main

    public int input(int deposit, int balance) {
    	int newBalance = balance;
    	if(deposit % 10000 == 0) {
    		newBalance += deposit;
    		System.out.println("당신의 잔액은 "+newBalance+"원 입니다.");
    	}else {
    		System.out.println("만원 단위로 입력하세요.");
    	}
    	return newBalance;
    	 
    } // input 메소드
    
	public int output(int forwarding, int balance) {
		int newBalance = balance;
		if(balance > forwarding) {
			newBalance -= forwarding;
			System.out.println("당신의 잔액은 "+newBalance+"원 입니다.");
		}else {
			System.out.println("잔액이 부족합니다.");
		}
		return newBalance;
	} // output 메소드

}
