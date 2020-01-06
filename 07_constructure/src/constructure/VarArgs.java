package constructure;


public class VarArgs {
//	public int sum(int a, int b) {
//		return a+b;
//	}
//	public int sum(int a, int b, int c) {
//		return a+b+c;
//	}
//	public int sum(int a, int b, int c, int d) {
//		return a+b+c+d;
//	}
	public int sum (int... ar) {
		int tot = 0;
		for(int i = 0; i <ar.length; i++) {
			tot +=ar[i];
		}
		return tot;
	}
    public static void main(String[] args) {
    	VarArgs va = new VarArgs();
    	System.out.println("합: "+va.sum(10,20));  // 호출
    	System.out.println("합: "+va.sum(10,20,30));  // 호출
    	System.out.println("합: "+va.sum(10,20,30,40)); // 호출
    }
}
