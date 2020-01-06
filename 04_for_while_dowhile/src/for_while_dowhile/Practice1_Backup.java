package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice1_Backup {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.print("����(1), ����(2), ��(3) �� ��ȣ �Է�: ");
			int user = Integer.parseInt(br.readLine());
			
			int computer = (int) (Math.random()*3+1);
			if(computer == 1) {
				System.out.print("��ǻ�� : ����\t");
			}else if (computer == 2) {
				System.out.print("��ǻ�� : ����\t");
			}else {
				System.out.print("��ǻ�� : ��\t");
			}
			
			
			if(user == 1) {
				System.out.print("�� : ����");
			}else if (user == 2) {
				System.out.print("�� : ����");
			}else {
				System.out.print("��: ��");
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
			System.out.print("�� �ҷ�(Y/N) : ");
			String restart = br.readLine();
			if(restart.equalsIgnoreCase("N")) break;	
		} // while
		System.out.println("���α׷��� �����մϴ�.");
		
	} // main
}
