package method;

public class MethodTest {
	public static void main(String[] args) {
		int big = Math.max(25, 36);
		System.out.println("ū �� = " + big);
		int small = Math.min(25, 36);
		System.out.println("���� �� = " + small);
		double power = Math.pow(2, 5);
		System.out.println("2�� 5���� " + power);
		System.out.println();

		System.out.println("���� - ��ǻ�Ͱ� �ұ�Ģ�ϰ� �߻���Ű�� ��, 0.0 <= ���� < 1.0");
		int a = (int) (Math.random() * 26)+65; //65 ~ 90
		System.out.println("a = " + (char)a);
		System.out.println('2'+'5'); // '0' = 48 ASCII CODE
		System.out.println('2'-48+'5'-48);
		System.out.println();
		System.out.println("2"+"5.7");
		System.out.println(Integer.parseInt("2")+Double.parseDouble("5.7"));
	}
}
