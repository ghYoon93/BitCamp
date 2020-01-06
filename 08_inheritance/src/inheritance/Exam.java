package inheritance;

import java.util.Scanner;

public class Exam {
	private String name;
	private String dap;
	private char[] ox;
	private int score;
	private final String JUNG="11111";
	
	public Exam() {
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 입력: ");
		name = scan.nextLine();
		System.out.print("답 입력: ");
		dap = scan.nextLine();
		ox = new char[dap.length()];
	}
	
	public void compare() {
		for(int i = 0; i < dap.length(); i++) {
			if(dap.charAt(i) == JUNG.charAt(i)) {
				ox[i] = 'O';
				score += 20;
			}else {
				ox[i] = 'X';
			}
		}
	}
	public String getName() {
		return name;
	}
	public char[] getOx() {
		return ox;
	}
	public int getScore() {
		return score;
	}
}
