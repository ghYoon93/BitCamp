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
    	System.out.println("�迭 �� ar = "+ar);
    	System.out.println("�迭 �� ar = "+ar.toString());
    	System.out.println("�迭 ũ�� = "+ar.length);
    	
    	for(int i = 0; i < 5; i++) {
    		System.out.println("arr["+i+"] = "+ar[i]);
    	}
    	System.out.println();
    	System.out.println("�Ųٷ� ���");
    	for(int i = ar.length-1; i > 0; i--) {
    		System.out.println("arr["+i+"] = "+ar[i]);
    	}
    	
    	System.out.println();
    	System.out.println("Ȧ�� �����͸� ���");
    	for(int i = 0; i < ar.length; i++) {
    		if(ar[i]%2 != 0) {
    			System.out.println("arr["+i+"] = "+ar[i]);	
    		}
    	}
    	
    	System.out.println("Ȯ�� for"); // foreach ar�� ũ�⸸ŭ �ݺ��ϸ鼭 �����͸� �����ش�.
    	for(int i: ar) {
    		if(i%2 != 0) {
    			System.out.println("arr["+i+"] = "+i);
    		}
    	}
    }
}
