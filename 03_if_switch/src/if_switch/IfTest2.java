package if_switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 3개의 숫자 (a, b, c)를 입력받아서 순서대로 출력하시오.
 * a값 입력: 78
 * b값 입력: 25
 * c값 입력: 36
 * 25 36 78
 */
public class IfTest2 {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("a값 입력: ");
		int a = Integer.parseInt(br.readLine());
		System.out.print("b값 입력: ");
		int b = Integer.parseInt(br.readLine());
		System.out.print("c값 입력: ");
		int c = Integer.parseInt(br.readLine());
		
		// if - else 사용
		if(a<b) 
			if(a<c) 
				if(b<c) 
					System.out.print(a+" "+b+" "+c); 
				else
					System.out.print(a+" "+c+ " "+b); 
			else 
				System.out.print(c+" "+a+" "+b); 
		else if(b<c)
			if(a<c)
				System.out.print(b+" "+a+" "+c); 
			else
				System.out.print(b+" "+c+" "+a);
		else 
			System.out.print(c+" "+b+" "+a);
		System.out.println();
		// if만 사용
		if(a<b) {
			if(a<c) {
				if(b<c) System.out.print(a+" "+b+ " "+c+ " ");
				if(c<b) System.out.print(a+" "+c+" "+b+" ");
			}
		}
		if(b<a) {
			if(b<c) {
				if(a<c) System.out.print(b+" "+ a + " "+ c + " ");
				if(c<a) System.out.print(b+" "+ c + " "+ a + " ");
			}
		}
		if(c<a) {
			if(c<b) {
				if(a<b) System.out.print(c+" "+ a + " "+ b + " ");
				if(b<a) System.out.print(c+" "+ b + " "+ a + " ");
			}
		}
		if(a == b && b == c) System.out.print(a+" "+ b + " "+ c + " ");
	}
}
