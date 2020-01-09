package thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ATMTest implements Runnable {
	private long depositMoney = 100000;
	private long balance;
    public static void main(String[] args) {
    	ATMTest atm = new ATMTest();
    	Thread mom = new Thread(atm);
    	Thread son = new Thread(atm);
    	
    	mom.setName("엄마");
    	mom.setPriority(10);
    	son.setName("아들");
    	son.setPriority(1);
    	mom.start();
    	son.start();
    }
	@Override
	public synchronized void run() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(Thread.currentThread().getName()+"님 안녕하세요.");
		System.out.print("찾고자하는 금액 입력: ");
		try {
			balance = Long.parseLong(br.readLine());
		}  catch (IOException e) {
			e.printStackTrace();
		}
		withDraw();
	}
	public void withDraw() {
		if(balance%10000 != 0) {
			System.out.println("만원 단위로 입력하세요.");
		}else if(depositMoney >= balance) {
			depositMoney -= balance;
			System.out.println("잔액은 "+depositMoney+"원입니다.");			
		}else {
			System.out.println("잔액이 부족합니다.");
		}
	}
}
