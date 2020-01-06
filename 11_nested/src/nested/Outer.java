package nested;

public class Outer {
	private String name;
	public void disp() {
		System.out.println("이름: "+this.name+"\t나이: "+new Inner().age);
	}
	
	class Inner {
		private int age;
		
		public void disp() {
			System.out.println("이름: "+Outer.this.name+"\t나이: "+age);
		}
	}
    public static void main(String[] args) {
    	Outer outer = new Outer();
    	outer.name = "홍길동";
    	System.out.println("이름: "+outer.name);
    	
    	Outer.Inner inner = outer.new Inner(); // Outer.java Outer.class/Outer$Inner.class
    	inner.age = 25;
    	inner.disp();
    	
    	Outer.Inner inner2 = outer.new Inner();
    	inner.age = 30;
    	inner.disp();
    	
    	Outer.Inner inner3 = new Outer().new Inner();
//    	inner3.name = "코난"; 클래스 외부에서는 Inner 클래스가 Outer 클래스의 변수에 접근할 수 없다.
//    	error-> Outer을 생성하거나 내부에서 name을 고쳐야한다.
    	inner3.disp();
    }
}
