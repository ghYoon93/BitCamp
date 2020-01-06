package array;

public class MultiArray5 {
    public static void main(String[] args) {
    	int[][] ar = new int[3][]; // 가변 길이
    	ar[0] = new int[2];
    	ar[1] = new int[3];
    	ar[2] = new int[4];
    	
    	ar[0][0] = 10;
    	ar[0][1] = 20;
    	ar[1][0] = 30;
    	ar[1][1] = 40;
    	ar[1][2] = 50;
    	ar[2][0] = 60;
    	
    }
}
