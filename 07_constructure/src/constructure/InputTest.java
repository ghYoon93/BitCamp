package constructure;

import java.util.Scanner;

public class InputTest {
	private int a;
	private double b;
	public InputTest() {
		Scanner scan = new Scanner(System.in);
		System.out.println("���� �Է�: ");
		a = scan.nextInt();
		System.out.println("�Ǽ� �Է�: ");
		b= scan.nextDouble();
	}
	
	public void display() {
		System.out.println(a+"+"+b+"="+(a+b));
	}
	public static void main(String[] args) {
		InputTest it = new InputTest();
		it.display();
	}
}