package abstract_1;

import java.util.Scanner;

public class Assert {
	private int x, y;
    public static void main(String[] args) {
    	Assert assrt = new Assert();
    	assrt.input();
    	assrt.output();
	}
    public  void input() {
    	Scanner scanner = new Scanner(System.in);
		System.out.print("x�� �Է�: ");
		x = scanner.nextInt();
		System.out.print("y�� �Է�: ");
		y = scanner.nextInt();
//		int[] arr = {x,y};
//		return arr;
    }
    
    public void output() {
    	assert y >= 0: "y�� 0���� ũ�ų� ���ƾ� �Ѵ�.";
    	
    	int answer = 1;
    	for(int i = 1; i <= y; i++) {
    		answer*=y;
    	}
    	System.out.println(x+"�� "+y+"���� "+answer);
    }
}
