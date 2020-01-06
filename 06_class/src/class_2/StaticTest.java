package class_2;

public class StaticTest {
    private int a; // 필드, 인스턴스 변수
    private static int b; // 필드, 클래스 변수
    
    static {
    	System.out.println("static 초기화 영역");
    }
    public StaticTest() {
    	System.out.println("기본 생성자");
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
//		Static 안에는 절대 일반 변수를 쓸 수 없다.
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
