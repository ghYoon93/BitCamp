package inheritance;
import java.util.Scanner;

class ShapeTest {
	protected double area;
	protected Scanner scan = new Scanner(System.in);
	
	public ShapeTest() {
		System.out.println("Shape Test 기본 생성자");
	}
	public void calcArea() {
		System.out.println("도형을 계산합니다.");
	}
	public void dispArea() {
		System.out.println("도형을 출력합니다.");
	}
}

class SamTest extends ShapeTest {
	
	private int base, height;
	
	public SamTest() {
		System.out.println("Sam Test 기본 생성자");
		System.out.print("밑변: ");
		base = scan.nextInt();
		System.out.print("높이: ");
		height = scan.nextInt();
	}
	@ Override
	public void calcArea() {
		area = base * height / 2.0;
	};
	@ Override
	public void dispArea() {
		System.out.println("삼각형의 넓이: "+area);
	};
}

class SaTest extends ShapeTest {
	
	private int width, height;
	
	public SaTest() {
		System.out.println("Sa Test 기본 생성자");
		System.out.print("넓이: ");
		width = scan.nextInt();
		System.out.print("높이: ");
		height = scan.nextInt();
	}
	@ Override
	public void calcArea() {
		area = width * height / 2.0;
	};
	@ Override
	public void dispArea() {
		System.out.println("사각형의 넓이: "+area);
	};
}

class SadariTest extends ShapeTest {
	
	private int top, bottom, height;
	
	public SadariTest() {
		System.out.println("Sadari Test 기본 생성자");
		System.out.print("밑변: ");
		bottom = scan.nextInt();
		System.out.print("윗변: ");
		top = scan.nextInt();
		System.out.print("높이: ");
		height = scan.nextInt();
	}
	@ Override
	public void calcArea() {
		area = (top+bottom) * height / 2.0;
	};
	@ Override
	public void dispArea() {
		System.out.println("사다리꼴의 넓이: "+area);
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
    	shape = new SamTest();  // 결합도 낮추기 부모 = 자식, 자식 = (자식)부모
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
