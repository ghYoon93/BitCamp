package instance;
/*
 * ����
 * 328, 258�� ������ �����Ͽ� ���� ���Ͻÿ�.
 * 
 *  [���� ���]
 *  320 + 258 = xxx (sum)
 *  320 - 258 = xxx (sub)
 *  320 * 258 = xxx (mul)
 *  320 / 258 = xxx (div)
 */

public class NumberTest {
	public static void main(String[] args) {
        int a = 320;
        int b = 258;
        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        double div = (double)a / b;
        
        System.out.println(a+" + "+b+" = "+sum);
        System.out.println(a+" - "+b+" = "+sub);
        System.out.println(a+" * "+b+" = "+mul);
        System.out.println(a+" / "+b+" = "+String.format("%.2f", div));
	}
}
