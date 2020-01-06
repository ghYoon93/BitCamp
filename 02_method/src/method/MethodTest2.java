package method;

public class MethodTest2 {
	public static void disp() {
		System.out.println("static method");
	}

	public void output() {
		System.out.println("non-static method");
	}

	public int plus(int a, int b) {
		return a + b;
	}
	
	public int minus(int a, int b) {
		return a - b;
	}
	
	public int multiply(int a, int b) {
		return a * b;
	}
	
	public double divide(int a, int b) {
		return (double)a / b;
	}

	

	

	public static void main(String[] args) {
		disp();
		new MethodTest2().output();
		MethodTest2 aa = new MethodTest2();
		System.out.println("aa " + aa); // 패키지명.클래스명@16진수
		System.out.println("aa " + aa.toString());
		System.out.println("aa " + aa.hashCode());

		aa.output();

		int sum = aa.plus(25, 36);
		int sub = aa.minus(25, 36);
		int mul = aa.multiply(25, 36);
		double div = aa.divide(25, 36);
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
	}

	
}
