package class_1;

class This{
	private String name;
    private int age;
    
    public void setName(String n) {
    	name = n;
    }
    public void setAge(int a) {
    	age = a;
    }
    
    public String getName() {
    	return name;
    }
    public int getAge() {
    	return age;
    }
}

public class ThisTest {
	public static void main(String[] args) {
    	This aa = new This();
    	aa.setName("홍길동");
    	aa.setAge(21);
		System.out.println("이름: "+aa.getName()+"\t 나이: "+aa.getAge());
    }
}
