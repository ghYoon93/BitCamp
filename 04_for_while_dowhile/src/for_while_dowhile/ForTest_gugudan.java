package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForTest_gugudan {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int dan, i;
		System.out.print("원하는 단을 입력: ");
		dan = Integer.parseInt(br.readLine());
		for(i = 1; i<=9; i++) {
			System.out.print(dan+"*"+i+"="+(dan*i));
			System.out.println();
		}
		
	}
}
