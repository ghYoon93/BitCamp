package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputTest {
	public static void main(String[] args) throws IOException {
		/*
		 *  메모리 <(BufferedReader)- buffer <(InputStreamReader)- 키보드 (System.in)
		 *  키보드로 들어오는 데이터 타입은 InputStream이다.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("문자열을 입력해주세요: ");
		String str = br.readLine();
		
		System.out.print("정수를 입력해주세요: ");
		int aa = Integer.parseInt(br.readLine());
		
		System.out.print("실수를 입력해주세요: ");
		double bb = Double.parseDouble(br.readLine());
		br.close();
		System.out.println("==================================================");
		System.out.println("str: "+str+"\t"+"str: "+aa+"\t"+String.format("bb: %.2f", bb));
		
	}
}
