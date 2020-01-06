package array;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practice4 {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException{
    	Practice4 p4 = new Practice4();
    	while(true) {
    		System.out.print("������ �����Ͻðڽ��ϱ�(Y/N)");
    		String choice = p4.br.readLine();
    		if(choice.equals("y") ||choice.equals("Y")) {
    			System.out.println("������ �����մϴ�.");
    			System.out.println();
    			int[] com = new int[3];
    			p4.input(com);
    			p4.output(com);
//    			gameStart = true;
    			break;
    		}else if (choice.equals("n") || choice.equals("N")) {
    			break;
    		}
    	} // while		
    } // main
    
	public void input(int[] com) {
		for(int i = 0; i < 3; i++) {
			com[i] = (int)(Math.random()*9+1);
			for(int j = 0; j < i; j++) {
				if(com[i] == com[j]) {
					i--;
					break;
				}
			} // for - �ߺ� Ȯ��
			System.out.print(com[i]);
		} // for - com ���� ����
		System.out.println();
	}  // input()
	
	public void output(int[] com) throws IOException {
		int[] user = new int[3];
		while(true) {
			int strike = 0;
			int ball = 0;
			System.out.print("���� �Է�: ");
			String input = br.readLine();
			for(int i = 0; i < input.length(); i++) {
				user[i] = (int)input.charAt(i) - 48;
			}
			
			for(int i = 0 ; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					if(com[i] == user[j]) {
						if(i == j) strike++;
						else ball++;
					}
				}
			}
			System.out.println(strike+"��Ʈ����ũ "+ball+"��");
			if(strike == 3) break;
		}  // while strike < 3
	} // output()	   
}
