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
    	
    	mom.setName("����");
    	mom.setPriority(1);
    	son.setName("�Ƶ�");
    	son.setPriority(10);
    	mom.start();
    	son.start();
    }
	@Override
//	public synchronized void run() { // ����ȭ O
	public void run() {
		synchronized (ATMTest.class) { // ����ȭ O
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println(Thread.currentThread().getName()+"�� �ȳ��ϼ���.");
			System.out.print("ã�����ϴ� �ݾ� �Է�: ");
			try {
				balance = Long.parseLong(br.readLine());
			}  catch (IOException e) {
				e.printStackTrace();
			}
			withDraw();
		}
	}
	public void withDraw() {
		if(balance%10000 != 0) {
			System.out.println("���� ������ �Է��ϼ���.");
			System.out.println();
		}else if(depositMoney >= balance) {
			depositMoney -= balance;
			System.out.println("�ܾ��� "+depositMoney+"���Դϴ�.");
			System.out.println();
		}else {
			System.out.println("�ܾ��� �����մϴ�.");
			System.out.println();
		}
	}
}
