package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
[����1] ���������� ���� - if��
[������]
����(1),����(2),��(3) �� ��ȣ �Է� : 3 (user)
��ǻ�� : ����	�� : ���ڱ�
You Win!!
�� �ҷ�(Y/N) : y

����(1),����(2),��(3) �� ��ȣ �Է� : 3 (user)
��ǻ�� : ����	�� : ���ڱ�
You Lose!!
�� �ҷ�(Y/N) : y

����(1),����(2),��(3) �� ��ȣ �Է� : 2 (user)
��ǻ�� : ����	�� : ����
You Draw!!
�� �ҷ�(Y/N) : n
���α׷��� �����մϴ�
 */

public class Practice1 {
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.print("����(1), ����(2), ��(3) �� ��ȣ �Է�: ");
			int user = Integer.parseInt(br.readLine());
			int computer = (int) (Math.random()*3+1);
			
			Practice1 p1 = new Practice1();
			System.out.println("��ǻ�� : "+p1.toStr(computer) +"    �� : "+p1.toStr(user));
			

			int result = user - computer;
			if(result == -2 || result == 1) System.out.println("You Win!!");
			else if(result == -1 || result == 2) System.out.println("You Lose!!");
			else System.out.println("You Draw!!");
			System.out.println();
			
			
			// �����
			System.out.print("�� �ҷ�(Y/N) : ");
			String restart = br.readLine();
			System.out.println();
			if(restart.equals("N") || restart.equals("n")) break;
			else if(restart.equals("Y") || restart.equals("y")) continue;
			else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				break;
			}
			
		} // while
		System.out.println("���α׷��� �����մϴ�.");
		
	} // main
    
    public String toStr(int number) {
    	if(number == 1) return "����";
    	else if(number == 2) return "����";
    	else  return "��";
    }
   
}
