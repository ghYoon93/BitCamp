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
		System.out.print("x값 입력: ");
		x = scanner.nextInt();
		System.out.print("y값 입력: ");
		y = scanner.nextInt();
//		int[] arr = {x,y};
//		return arr;
    }
    
    public void output() {
    	assert y >= 0: "y는 0보다 크거나 같아야 한다.";
    	
    	int answer = 1;
    	for(int i = 1; i <= y; i++) {
    		answer*=y;
    	}
    	System.out.println(x+"의 "+y+"승은 "+answer);
    }
}
