package inheritance;
import java.util.Scanner;

class ShapeTest {
	protected double area;
	protected Scanner scan = new Scanner(System.in);
	
	public ShapeTest() {
		System.out.println("Shape Test �⺻ ������");
	}
	public void calcArea() {
		System.out.println("������ ����մϴ�.");
	}
	public void dispArea() {
		System.out.println("������ ����մϴ�.");
	}
}

class SamTest extends ShapeTest {
	
	private int base, height;
	
	public SamTest() {
		System.out.println("Sam Test �⺻ ������");
		System.out.print("�غ�: ");
		base = scan.nextInt();
		System.out.print("����: ");
		height = scan.nextInt();
	}
	@ Override
	public void calcArea() {
		area = base * height / 2.0;
	};
	@ Override
	public void dispArea() {
		System.out.println("�ﰢ���� ����: "+area);
	};
}

class SaTest extends ShapeTest {
	
	private int width, height;
	
	public SaTest() {
		System.out.println("Sa Test �⺻ ������");
		System.out.print("����: ");
		width = scan.nextInt();
		System.out.print("����: ");
		height = scan.nextInt();
	}
	@ Override
	public void calcArea() {
		area = width * height / 2.0;
	};
	@ Override
	public void dispArea() {
		System.out.println("�簢���� ����: "+area);
	};
}

class SadariTest extends ShapeTest {
	
	private int top, bottom, height;
	
	public SadariTest() {
		System.out.println("Sadari Test �⺻ ������");
		System.out.print("�غ�: ");
		bottom = scan.nextInt();
		System.out.print("����: ");
		top = scan.nextInt();
		System.out.print("����: ");
		height = scan.nextInt();
	}
	@ Override
	public void calcArea() {
		area = (top+bottom) * height / 2.0;
	};
	@ Override
	public void dispArea() {
		System.out.println("��ٸ����� ����: "+area);
	};
}

public class ShapeMain {
    public static void main(String[] args) {
//    	SamTest sam = new SamTest();
//    	sam.calcArea();
//    	sam.dispArea();
//    	
//    	SaTest sa = new SaTest();
//    	sa.calcArea();
//    	sa.dispArea();
//    	
//    	SadariTest sadari = new SadariTest();
//    	sadari.calcArea();
//    	sadari.dispArea();
    	
    	ShapeTest shape;
    	shape = new SamTest();  // ���յ� ���߱� �θ� = �ڽ�, �ڽ� = (�ڽ�)�θ�
    	shape.calcArea();
    	shape.dispArea();
    
    	shape = new SaTest();
    	shape.calcArea();
    	shape.dispArea();
    	
    	shape = new SadariTest();
    	shape.calcArea();
    	shape.dispArea();
    }
}
