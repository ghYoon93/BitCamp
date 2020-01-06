package if_switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/*
 * a�� �Է�: 25
 * b�� �Է�: 36
 * ������(+, -, *, /) �Է�: + /
 * 25 / 36 = xx.xxx
 */
public class SwitchTest2 {
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("a�� �Է�: ");
		int a = Integer.parseInt(br.readLine());
		System.out.print("b�� �Է�: ");
		int b = Integer.parseInt(br.readLine());
		System.out.print("������ �Է�(+, -, *, /): ");
		
		char c = br.readLine().charAt(0);
		switch(c) {
		case '+':
			System.out.println(a+" "+c+" "+b+" = "+(a+b));
			break;
		case '-':
			System.out.println(a+" "+c+" "+b+" = "+(a-b));
			break;
		case '*':
			System.out.println(a+" "+c+" "+b+" = "+(a*b));
			break;
		case '/':
//			if(a%b == 2) {
//				System.out.println(a+" "+c+" "+b+" = "+(a/b));
//			}else {
//				System.out.println(a+" "+c+" "+b+" = "+String.format("%.3f",(double)a/b));
//			}
			DecimalFormat df = new DecimalFormat("#.###");
			System.out.println(a+" "+c+" "+b+" = "+df.format((double)a/b));
			break;
		default:
			System.out.println("������ error");
		}
		
		if(c == '+') {
			System.out.println(a+" "+c+" "+b+" = "+(a+b));
		}else if(c == '-'){
			System.out.println(a+" "+c+" "+b+" = "+(a-b));
		}else if (c == '*') {
			System.out.println(a+" "+c+" "+b+" = "+(a*b));
		}else if ( c == '/') {
			DecimalFormat df = new DecimalFormat("#.###");
			System.out.println(a+" "+c+" "+b+" = "+df.format((double)a/b));
		}else {
			System.out.println("������ error");
		}

	}
}
