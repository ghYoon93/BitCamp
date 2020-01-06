package instance;

public class Operator2 {
	public static void main(String[] args) {
		boolean a = 25 > 36;
		System.out.println("a = " + a);
		System.out.println("!a = " + !a);
		System.out.println();
		
		// 클래스 메모리 생성 - new
		String b = "apple"; // 문자열 literal
		String c = new String("apple");
		System.out.println("b==c : "+(b==c?"같다.":"다르다."));
		System.out.println("b!=c : "+(b!=c?"참":"거짓"));
		System.out.println();
		
		System.out.println("b.equals(c) : " + (b.equals(c)?"같다.":"다르다."));
		System.out.println("b.equals(c) : " + (!b.equals(c)?"참":"거짓"));
	}
}
