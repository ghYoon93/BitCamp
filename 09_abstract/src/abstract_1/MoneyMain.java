package abstract_1;

import java.util.Scanner;

public class MoneyMain {
	public static void main(String[] args) {
		Money money;
		Scanner scanner = new Scanner(System.in);
		System.out.print("현금 입력: ");
		int cashKor = scanner.nextInt();
		while(true) {
			System.out.print("1. 달러\t2. 엔화\t3. 위안: ");
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
				System.out.println("잘못 선택하셨습니다.");
			}	// if - choice
		} // while
		money.calcMoney();
		money.dispMoney();
	}
}
