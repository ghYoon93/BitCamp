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
		System.out.print("���ϴ� �� �Է�: ");
		dan = Integer.parseInt(br.readLine());
		
//		try {
//		}catch(NumberFormatException e) {
//			System.out.println("���ڸ� �Է����ּ���.");
//			input();
//		}
	}
	public void output() {
		if (dan > 1 && dan < 10) {
			for(int i = 1; i <10; i++) {
				System.out.println(dan+" * "+i+" = "+ (dan*i));
			}
		}else {
			// �����ڰ� ������ Exception �߻�
			try {
				throw new MakeException("���� �ʰ� (2���� 9���� ����)");
//				throw new Exception("���� �ʰ� (2���� 9���� ����)");
			}catch (Exception e) {
			e.printStackTrace();
			}
		}
	}
}
