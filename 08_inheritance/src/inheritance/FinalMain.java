package inheritance;

class Final{
	public final String FRUIT = "���";
	public final String FRUIT2;
	
	public static final String ANIMAL = "����";
	public static final String ANIMAL2;
	
	// final�� �ʱ�ȭ ������
	static{
		ANIMAL2  = "�⸰";
	}
	public Final() {
		this.FRUIT2 = "����";
	}
	
}

public class FinalMain {
    public static void main(String[] args) {
    	final int AGE =25;
    	//AGE++;
    	
    	final int AGE2;
    	AGE2 = 30;
//    	AGE2 = 35;
    	
    	System.out.println("FRUIT = " + new Final().FRUIT );
    	System.out.println("FRUIT2 = " + new Final().FRUIT2);
    }
}
