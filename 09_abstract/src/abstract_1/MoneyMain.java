package abstract_1;

import java.util.Scanner;

public class MoneyMain {
	public static void main(String[] args) {
		Money money;
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		int cashKor = scanner.nextInt();
		while(true) {
			System.out.print("1. �޷�\t2. ��ȭ\t3. ����: ");
			int choice = scanner.nextInt();
			if(choice == 1) {
				money = new EngMoney(cashKor);
				break;
			}else if(choice == 2) {
				money = new JpaMoney(cashKor);
				break;
			}else if (choice == 3) {
				money = new ChaMoney(cashKor);
				break;
			}else {
				System.out.println("�߸� �����ϼ̽��ϴ�.");
			}	// if - choice
		} // while
		money.calcMoney();
		money.dispMoney();
	}
}
