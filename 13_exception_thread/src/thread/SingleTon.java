package thread;

public class SingleTon {
	private int num = 3;
	private static SingleTon instance;
	
	public static SingleTon getInstance() {
		if(instance == null) {
			synchronized(SingleTon.class) {
				instance = new SingleTon(); // √≥¿Ω «—π¯∏∏ √≥∏Æµ»¥Ÿ.
			}			
		}
		return instance;
	}
	
    public static void main(String[] args) {
    	System.out.println("*** ΩÃ±€≈Ê");
		SingleTon aa = SingleTon.getInstance();
		aa.num++;
		System.out.println("aa = "+aa);
		System.out.println("num = "+aa.num);
		System.out.println();
		
		System.out.println("*** ΩÃ±€≈Ê");
		SingleTon bb = SingleTon.getInstance();
		bb.num++;
		System.out.println("bb = "+bb);
		System.out.println("num = "+bb.num);
		System.out.println();
		
		System.out.println("*** ΩÃ±€≈Ê");
		SingleTon cc = SingleTon.getInstance();
		cc.num++;
		System.out.println("cc = "+cc);
		System.out.println("num = "+cc.num);
		System.out.println();
		
		System.out.println("*** ΩÃ±€≈Ê");
		SingleTon dd = SingleTon.getInstance();
		dd.num++;
		System.out.println("dd = "+dd);
		System.out.println("num = "+dd.num);
		System.out.println();
		
		System.out.println("*** ΩÃ±€≈Ê");
		SingleTon ee = SingleTon.getInstance();
		ee.num++;
		System.out.println("ee = "+ee);
		System.out.println("num = "+ee.num);
		System.out.println();
	}
}
