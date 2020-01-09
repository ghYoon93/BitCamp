package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) {
		if(args[0].length() != 0) System.out.println("args[0]: "+args[0]);
		
		Scanner scan = new Scanner(System.in);
		try{
			System.out.print("숫자입력: ");
			int num = Integer.parseInt(args[0]);
			int num2 = scan.nextInt();			
			System.out.println(num +" / "+num2+" = "+(num/num2));
		}catch(ArithmeticException e) {
			System.out.println("0으로 나누면 안된다.");
		}catch(InputMismatchException e) {
			System.out.println("숫자만 입력해주세요.");
		}finally {
			System.out.println("error가 있건 없건 무조건 실행");
		}
	}
}
