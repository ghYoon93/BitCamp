package collection;

public class GenericTest2 <T> {
    private T a;
    public GenericTest2 (T a){
    	this.a = a;
    }
    public void setA(T a) {
    	this.a = a;
    }
    public T getA() {
    	return a;
    }
    public static void main(String[] args) {
		GenericTest2<String> aa = new GenericTest2<String>("ȫ�浿");
//		aa.setA("ȫ�浿"); error
		String name = aa.getA();
		System.out.println("�̸�: "+name);
		
		GenericTest2<?> bb = new GenericTest2<Integer>(25);
		int  age =(Integer)bb.getA();
		System.out.println("����: "+age);
	}
}
