package class_2;

public class StringTest {
    public static void main(String[] args) {
    	String a = "apple";
    	String b = "apple";
    	if(a==b) System.out.println("a�� b�� �������� ����.");
    	else System.out.println("a�� b�� �������� �ٸ���.");
    	System.out.println();
    	
    	String c = new String("apple");
    	String d = new String("apple");
    	if(c==d) System.out.println("c�� d�� �������� ����.");
    	else System.out.println("c�� d�� �������� �ٸ���.");
    	System.out.println();
    	
    	String e = "ABC ���� ��¥�� "+2019+12+30;
    	System.out.println("e= "+e);
    	e = "abc ���� ��¥�� " + 2019+12+31;
    	System.out.println("e= "+e);
    	System.out.println("���ڿ��� ũ�� = "+e.length());
    	for(int i = 0; i < e.length(); i++) {
    		System.out.println(i+" : " + e.charAt(i));
    	}
    	System.out.println("�κ� ���ڿ� ����: "+e.substring(7));
    	System.out.println("�κ� ���ڿ� ����: "+e.substring(7,11));
    	
    	System.out.println("�빮�� ����: "+"Hello".toUpperCase());
    	System.out.println("�ҹ��� ����: "+"Hello".toLowerCase());
    	
    	System.out.println("���ڿ� �˻�:" + e.indexOf("¥"));
    	System.out.println("���ڿ� �˻�:" + e.indexOf("��¥"));
    	System.out.println("���ڿ� �˻�:" + e.indexOf("abc"));
    }
}
