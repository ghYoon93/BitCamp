package class_2;

import java.util.Scanner;

public class StringBufferTest {
    private int dan;
    public StringBufferTest() {
    	Scanner scan = new Scanner(System.in);
    	System.out.print("원하는 단을 입력: ");
    	dan = scan.nextInt();
    	scan.nextLine();
    }
    public void output() {
    	// for을 돌려서 구구단 계산
    	StringBuffer sb = new StringBuffer();
    	for(int i = 1; i <= 9; i ++) {
//    		System.out.println(dan+" * "+i+" = "+ (dan*i));
    		sb.append(dan);
    		sb.append(" * ");
    		sb.append(i);
    		sb.append(" = ");
    		sb.append(dan*i);
    		System.out.println(sb);
    		sb.delete(0, sb.length());
    	}
    }
    public static void main(String[] args) {
    	StringBufferTest sbt = new StringBufferTest();
    	sbt.output();
    }
}
