package class_1;

public class ShapeTest {
    public static final double PI = 3.141592;
    public void area(int a) {
    	System.out.println("���� ���� : "+(a*a*PI));
    }
    public void area(int a, int b) {
    	System.out.println("�ﰢ���� ����:" + (a*b*0.5));
    }
    public void area(int a, int b, int c) {
    	System.out.println("��ٸ����� ����: "+((a+b)*c*0.5));
    }
    
    public static void main(String[] args) {
		ShapeTest st = new ShapeTest();
		st.area(3);
		st.area(5,7);
		st.area(2,3,5);
	}
}
