package inheritance;

class AA{
	public int a = 3;
	public void disp() {
		a += 5;
		System.out.println("AA: "+a+" ");
	}
}

class BB extends AA{
	public int a = 8;
	
	@ Override
	public void disp() {
		this.a += 5;
		System.out.println("BB: "+a+" ");
	}
}
public class TestMain2 {
    public static void main(String[] args) {
		BB bb = new BB();
		bb.disp();
		System.out.println(bb.a + " ");
		bb.disp();
		AA aa = new BB();
		aa.disp();
		System.out.println(aa.a + " ");
		
		BB bb2 = (BB) aa;
		System.out.println(bb2.a + " ");
	}
}
