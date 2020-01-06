package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
[����8] ���°��� ���α׷�
����, ���, �ܰ�, ���� ����� �����ϴ� ���� ���°��� ���α׷��� �ۼ��Ͻÿ�.
����) ������ input(), ����� output()���� ó���ϼ���

[������]
****************
   1. ����
   2. ���
   3. �ܰ�
   4. ����
****************
��ȣ ���� : 1
���ݾ� : 10000
����� �ܾ��� 10000�� �Դϴ�
�Ǵ�
���ݾ� : 12000
���� ������ �Է��ϼ���

****************
   1. ����
   2. ���
   3. �ܰ�
   4. ����
****************
��ȣ ���� : 2
��ݾ� : 8000
����� �ܾ��� 2000�� �Դϴ�
�Ǵ� 
��ݾ� : 18000
�ܾ��� �����մϴ�

1. ���� 2. ��� 3. �ܰ� 4. ����
��ȣ ���� : 3
����� �ܾ��� 2000�� �Դϴ�

1. ���� 2. ��� 3. �ܰ� 4. ����
��ȣ ���� : 4
���α׷��� �����մϴ�.

 */

public class Practice8 {
     public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
		
		boolean sw = true;
		int balance = 0;
		while(sw) {
			System.out.println("****************");
			System.out.println("   1. ����");
			System.out.println("   2. ���");
			System.out.println("   3. �ܰ�");
			System.out.println("   4. ����");
			System.out.println("****************");
			
			Practice8 p8 = new Practice8();
			while(true) {
				System.out.print("��ȣ ����: ");
				int choice = Integer.parseInt(br.readLine());
				
				if(choice == 1) {
					System.out.print("���ݾ�: ");
					int deposit = Integer.parseInt(br.readLine());
					balance = p8.input(deposit, balance);
					break;
				}else if(choice == 2) {
					System.out.print("��ݾ�: ");
					int forwarding = Integer.parseInt(br.readLine());
					balance = p8.output(forwarding, balance);
					break;
				}else if(choice == 3) {
					System.out.println("����� �ܾ��� "+balance+" �Դϴ�.");
					break;
				}else if (choice == 4) {
					System.out.println("���α׷��� �����մϴ�.");
					sw = false;
					break;
				}else {
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				}
			} // while ��ȣ ����
			
		} // while ���°��� ���α׷� �޴�
	} // main

    public int input(int deposit, int balance) {
    	int newBalance = balance;
    	if(deposit % 10000 == 0) {
    		newBalance += deposit;
    		System.out.println("����� �ܾ��� "+newBalance+"�� �Դϴ�.");
    	}else {
    		System.out.println("���� ������ �Է��ϼ���.");
    	}
    	return newBalance;
    	 
    } // input �޼ҵ�
    
	public int output(int forwarding, int balance) {
		int newBalance = balance;
		if(balance > forwarding) {
			newBalance -= forwarding;
			System.out.println("����� �ܾ��� "+newBalance+"�� �Դϴ�.");
		}else {
			System.out.println("�ܾ��� �����մϴ�.");
		}
		return newBalance;
	} // output �޼ҵ�

}
