package constructure;

class ConstructorTest {
	private String name;
	private int age;
	public ConstructorTest() {
		System.out.println("기본 생성자");
	}
	public ConstructorTest(String name) {
		this();
		this.name = name;
	}
	public ConstructorTest(int age) {
		this("코난"); //ConstructorTest(String name) 생성자 불러오기
		this.age = age;
	}
	public ConstructorTest(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}

public class ConstructorMain {
    public static void main(String[] args) {
        ConstructorTest ct = new ConstructorTest();
        System.out.println("이름: "+ct.getName()+"\t나이: "+ct.getAge());
        System.out.println();
        
        ConstructorTest ct2 = new ConstructorTest("홍길동");
        System.out.println("이름: "+ct2.getName()+"\t나이: "+ct2.getAge());
        
        ConstructorTest ct3 = new ConstructorTest(20);
        System.out.println("이름: "+ct3.getName()+"\t나이: "+ct3.getAge());
    }
}
