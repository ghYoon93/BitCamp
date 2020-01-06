package array;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practice4_backUp {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	boolean gameStart = false;
    	while(true) {
    		System.out.print("������ �����Ͻðڽ��ϱ�(Y/N)");
    		String choice = br.readLine();
    		if(choice.equals("y") ||choice.equals("Y")) {
    			gameStart = true;
    			break;
    		}else if (choice.equals("n") || choice.equals("N")) {
    			gameStart = false;
    			break;
    		}
    	}
    	
    	if(gameStart) {
//    		 ���� ����
			System.out.println("������ �����մϴ�.");
			System.out.println();
			int size = 3;
			int[] com = new int[size];
			for(int i = 0; i < size; i++) {
				com[i] = (int)(Math.random()*9+1);
				for(int j = 0; j < i; j++) {
					if(com[i] == com[j]) {
						i--;
						break;
					}
				} // for - �ߺ� Ȯ��
			} // for - com ���� ����
			
			int[] user = new int[size];
			int strike = 0;
			int ball = 0;
			while(strike < 3) {
				System.out.print("���� �Է�: ");
				String input = br.readLine();
				boolean check = true; // ����� ���� �Է� Ȯ��
				if(input.length() < 1 || input.length() > size) { // �Էµ� ���� ���� Ȯ��
					System.out.println("3���� ���ڸ� �Է����ּ���.");
					check = false;
				}else {
					for(int i = 0; i < size; i++) { // 1~9�������� Ȯ��
						user[i] = (int)(input.charAt(i)) - 48;
						if(user[i] < 1 || user[i] > 9) {
							System.out.println("1~9������ ���ڸ� �Է����ּ���.");
							check = false;
							break;
						}
						for(int j = 0; j < i; j++) { // �ߺ� Ȯ��
							if(user[i] == user[j]) {
								System.out.println("�ߺ��� ���ڰ� �ֽ��ϴ�.");
								i += size;
								check = false;
								break;
							} 
						}  
					} 
				}
				if(check) {
					strike = 0;
					ball = 0;
					for(int i = 0 ; i < size; i++) {
						for(int j = 0; j < size; j++) {
							if(com[i] == user[j]) {
								if(i == j) strike++;
								else ball++;
							}
						}
					}
					System.out.println(strike+"��Ʈ����ũ "+ball+"��");
				}
			}
			
    	} // if - �߱� ����
    } // main
    
    
}
