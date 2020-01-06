package if_switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 3���� ���� (a, b, c)�� �Է¹޾Ƽ� ������� ����Ͻÿ�.
 * a�� �Է�: 78
 * b�� �Է�: 25
 * c�� �Է�: 36
 * 25 36 78
 */
public class IfTest2 {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("a�� �Է�: ");
		int a = Integer.parseInt(br.readLine());
		System.out.print("b�� �Է�: ");
		int b = Integer.parseInt(br.readLine());
		System.out.print("c�� �Է�: ");
		int c = Integer.parseInt(br.readLine());
		
		// if - else ���
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
		// if�� ���
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
