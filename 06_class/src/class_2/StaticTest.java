package class_2;

public class StaticTest {
    private int a; // �ʵ�, �ν��Ͻ� ����
    private static int b; // �ʵ�, Ŭ���� ����
    
    static {
    	System.out.println("static �ʱ�ȭ ����");
    }
    public StaticTest() {
    	System.out.println("�⺻ ������");
    	a = 3;
    }
    public void clac() {
    	a++;
    	b++;
    }
    
    public void disp() {
    	System.out.println("a = "+this.a+"\t b = "+StaticTest.b);
    }
    
    public static void output() {
    	System.out.println("static method");
//    	System.out.println("a = "+a+"\t b = "+StaticTest.b);
//		Static �ȿ��� ���� �Ϲ� ������ �� �� ����.
    }
    public static void main(String[] args) {
    	StaticTest st1 = new StaticTest();
    	st1.clac();
    	st1.disp();
    	System.out.println();
    	
    	StaticTest st2 = new StaticTest();
    	st2.clac();
    	st2.disp();
    	System.out.println();
    	
    	StaticTest st3 = new StaticTest();
    	st3.clac();
    	st3.disp();
    	System.out.println();
    	
    	output();
    }
}
