package for_while_dowhile;

public class ForTest {
	public static void main(String[] args) {
    	int i;
		for(i = 1; i<=10; i++) {
			System.out.println("hello"+i);
		}
		System.out.println("Å»Ãâ i = " + i);
		// 10 9 8 7 6 5 4 3 2 1
		for(i = 10; i > 0; i--) {
			System.out.print(i+" ");
		}
		System.out.println();
		// A B C D E F G ... X Y Z
		for(i = 'A'; i <= 'Z'; i++) {
			System.out.print((char)i+" ");
		}
	} // main
}
