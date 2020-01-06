package abstract_1;

// 
// class Object {
//     public String toString() {} // 클래스@16진수
//     public int hashCode()}{ 10진수
//     public boolean equals(Object ob){} // 참조값 비교
// }
//class String extends Object {
//	public String toString() {} // 문자열
//	public int hashCode() {} // int 21억, 불가능
//  public boolean equals(Object ob){} // 문자열 비교
//}

class Test3 extends Object{
	public String toString() {
		return getClass()+"개바부";
	}
}
// ------
public class ObjectMain  {
    public static void main(String[] args) {
    	Test3 t = new Test3();
		System.out.println("객체 t = "+t);
		System.out.println("객체 t = "+t.toString());
		System.out.println("객체 t = "+t.hashCode());
		System.out.println();
		
		String str = "apple";
		System.out.println("객체 str = " + str);
		System.out.println("객체 str = " + str.toString());
		System.out.println("객체 str = " + str.hashCode());
		System.out.println();
		
		String aa = new String("apple");
		String bb = new String("apple");
		System.out.println("aa == bb : "+(aa==bb));
		System.out.println("aa.equals(bb) : "+aa.equals(bb));
		System.out.println();
		
		Object cc = new Object();
		Object dd = new Object();
		System.out.println("cc == dd : "+(cc == dd)); // 참조값 비교
		System.out.println("cc.equals(dd) : "+cc.equals(dd)); // 참조값 비교
		System.out.println();
		
		Object ee = new String("apple");
		Object ff = new String("apple");
		System.out.println("ee == ff : "+(ee==ff));
		System.out.println("ee.equals(ff) : "+ee.equals(ff));
		System.out.println();
	}
}
