package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionTest2 {
	private int dan;
	public static void main(String[] args) throws IOException {
		ExceptionTest2 et2 = new ExceptionTest2();
		et2.input();
		et2.output();
		
	}
	public void input() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("원하는 단 입력: ");
		dan = Integer.parseInt(br.readLine());
		
//		try {
//		}catch(NumberFormatException e) {
//			System.out.println("숫자만 입력해주세요.");
//			input();
//		}
	}
	public void output() {
		if (dan > 1 && dan < 10) {
			for(int i = 1; i <10; i++) {
				System.out.println(dan+" * "+i+" = "+ (dan*i));
			}
		}else {
			// 개발자가 강제로 Exception 발생
			try {
				throw new MakeException("범위 초과 (2부터 9까지 가능)");
//				throw new Exception("범위 초과 (2부터 9까지 가능)");
			}catch (Exception e) {
			e.printStackTrace();
			}
		}
	}
}
