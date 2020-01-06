package inheritance;

public class ChildTest extends SuperTest{
    private String name;
    private int age;
    
    public ChildTest() {
    	System.out.println("ChildTest 기본 생성자");
    }
    
    public ChildTest(String name, int age, double weight, double height) {
    	super(weight,height); // 부모 생성자 호출
    	System.out.println("ChildTest 생성자");
    	this.name = name;
    	this.age = age;
//    	super.weight = weight;
//    	super.height = height;
    }
    
    public void disp() {
    	System.out.println("이름 = " + name);
    	System.out.println("나이 = " + age);
    	System.out.println("몸무게: "+ weight);
    	System.out.println("키: "+height);
    }
    
    public static void main(String[] args) {
    	ChildTest aa = new ChildTest("홍길동", 25, 79.5, 185.3); // 생성자 두 번 호출
//		aa.output();
		System.out.println("---------------");
		aa.disp();
		
		SuperTest bb = new ChildTest("또치", 16, 52.3, 162.3);  // SuperTest 참조
		bb.disp();
	}
}
