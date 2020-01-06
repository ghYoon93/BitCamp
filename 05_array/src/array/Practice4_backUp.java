package array;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practice4_backUp {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	boolean gameStart = false;
    	while(true) {
    		System.out.print("게임을 실행하시겠습니까(Y/N)");
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
//    		 게임 실행
			System.out.println("게임을 시작합니다.");
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
				} // for - 중복 확인
			} // for - com 숫자 생성
			
			int[] user = new int[size];
			int strike = 0;
			int ball = 0;
			while(strike < 3) {
				System.out.print("숫자 입력: ");
				String input = br.readLine();
				boolean check = true; // 사용자 숫자 입력 확인
				if(input.length() < 1 || input.length() > size) { // 입력된 숫자 개수 확인
					System.out.println("3개의 숫자를 입력해주세요.");
					check = false;
				}else {
					for(int i = 0; i < size; i++) { // 1~9까지인지 확인
						user[i] = (int)(input.charAt(i)) - 48;
						if(user[i] < 1 || user[i] > 9) {
							System.out.println("1~9까지의 숫자를 입력해주세요.");
							check = false;
							break;
						}
						for(int j = 0; j < i; j++) { // 중복 확인
							if(user[i] == user[j]) {
								System.out.println("중복된 숫자가 있습니다.");
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
					System.out.println(strike+"스트라이크 "+ball+"볼");
				}
			}
			
    	} // if - 야구 게임
    } // main
    
    
}
