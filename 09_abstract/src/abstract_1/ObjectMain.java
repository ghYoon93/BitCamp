package abstract_1;

// 
// class Object {
//     public String toString() {} // Ŭ����@16����
//     public int hashCode()}{ 10����
//     public boolean equals(Object ob){} // ������ ��
// }
//class String extends Object {
//	public String toString() {} // ���ڿ�
//	public int hashCode() {} // int 21��, �Ұ���
//  public boolean equals(Object ob){} // ���ڿ� ��
//}

class Test3 extends Object{
	public String toString() {
		return getClass()+"���ٺ�";
	}
}
// ------
public class ObjectMain  {
    public static void main(String[] args) {
    	Test3 t = new Test3();
		System.out.println("��ü t = "+t);
		System.out.println("��ü t = "+t.toString());
		System.out.println("��ü t = "+t.hashCode());
		System.out.println();
		
		String str = "apple";
		System.out.println("��ü str = " + str);
		System.out.println("��ü str = " + str.toString());
		System.out.println("��ü str = " + str.hashCode());
		System.out.println();
		
		String aa = new String("apple");
		String bb = new String("apple");
		System.out.println("aa == bb : "+(aa==bb));
		System.out.println("aa.equals(bb) : "+aa.equals(bb));
		System.out.println();
		
		Object cc = new Object();
		Object dd = new Object();
		System.out.println("cc == dd : "+(cc == dd)); // ������ ��
		System.out.println("cc.equals(dd) : "+cc.equals(dd)); // ������ ��
		System.out.println();
		
		Object ee = new String("apple");
		Object ff = new String("apple");
		System.out.println("ee == ff : "+(ee==ff));
		System.out.println("ee.equals(ff) : "+ee.equals(ff));
		System.out.println();
	}
}
