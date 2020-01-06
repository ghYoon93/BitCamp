package array;

public class ArrayTest {
    public static void main(String[] args) {
    	int[] ar;
    	ar = new int[5];
    	ar[0] = 25;
    	ar[1] = 36;
    	ar[2] = 47;
    	ar[3] = 55;
    	ar[4] = 60;
    	System.out.println("배열 명 ar = "+ar);
    	System.out.println("배열 명 ar = "+ar.toString());
    	System.out.println("배열 크기 = "+ar.length);
    	
    	for(int i = 0; i < 5; i++) {
    		System.out.println("arr["+i+"] = "+ar[i]);
    	}
    	System.out.println();
    	System.out.println("거꾸로 출력");
    	for(int i = ar.length-1; i > 0; i--) {
    		System.out.println("arr["+i+"] = "+ar[i]);
    	}
    	
    	System.out.println();
    	System.out.println("홀수 데이터만 출력");
    	for(int i = 0; i < ar.length; i++) {
    		if(ar[i]%2 != 0) {
    			System.out.println("arr["+i+"] = "+ar[i]);	
    		}
    	}
    	
    	System.out.println("확장 for"); // foreach ar의 크기만큼 반복하면서 데이터를 꺼내준다.
    	for(int i: ar) {
    		if(i%2 != 0) {
    			System.out.println("arr["+i+"] = "+i);
    		}
    	}
    }
}
