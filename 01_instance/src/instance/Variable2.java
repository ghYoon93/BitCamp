package instance;

public class Variable2 {
	int a;  // field, �ʱ�ȭ
	static	int b = 10;  // field, �ʱ�ȭ, Ŭ���� ����
	String str;
	
    public static void main(String[] args) {
	int a = 10;  // local variable(��������), �����Ⱚ(�ݵ�� �ʱ�ȭ)
	
	System.out.println("���� a: " + a);
	System.out.println("�ʵ� a: " + new Variable2().a);
	System.out.println("�ʵ� b: " + b);
	System.out.println("�ʵ� str=" + new Variable2().str);
	
	int score = 60;
	System.out.println(60 < 80 | 60 <40);
	}
}
