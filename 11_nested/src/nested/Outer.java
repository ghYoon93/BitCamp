package nested;

public class Outer {
	private String name;
	public void disp() {
		System.out.println("�̸�: "+this.name+"\t����: "+new Inner().age);
	}
	
	class Inner {
		private int age;
		
		public void disp() {
			System.out.println("�̸�: "+Outer.this.name+"\t����: "+age);
		}
	}
    public static void main(String[] args) {
    	Outer outer = new Outer();
    	outer.name = "ȫ�浿";
    	System.out.println("�̸�: "+outer.name);
    	
    	Outer.Inner inner = outer.new Inner(); // Outer.java Outer.class/Outer$Inner.class
    	inner.age = 25;
    	inner.disp();
    	
    	Outer.Inner inner2 = outer.new Inner();
    	inner.age = 30;
    	inner.disp();
    	
    	Outer.Inner inner3 = new Outer().new Inner();
//    	inner3.name = "�ڳ�"; Ŭ���� �ܺο����� Inner Ŭ������ Outer Ŭ������ ������ ������ �� ����.
//    	error-> Outer�� �����ϰų� ���ο��� name�� ���ľ��Ѵ�.
    	inner3.disp();
    }
}
