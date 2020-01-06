package constructure;

class ConstructorTest {
	private String name;
	private int age;
	public ConstructorTest() {
		System.out.println("�⺻ ������");
	}
	public ConstructorTest(String name) {
		this();
		this.name = name;
	}
	public ConstructorTest(int age) {
		this("�ڳ�"); //ConstructorTest(String name) ������ �ҷ�����
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
        System.out.println("�̸�: "+ct.getName()+"\t����: "+ct.getAge());
        System.out.println();
        
        ConstructorTest ct2 = new ConstructorTest("ȫ�浿");
        System.out.println("�̸�: "+ct2.getName()+"\t����: "+ct2.getAge());
        
        ConstructorTest ct3 = new ConstructorTest(20);
        System.out.println("�̸�: "+ct3.getName()+"\t����: "+ct3.getAge());
    }
}
