package array;

public class MultiArray {
    public static void main(String[] args) {
    	int[][] ar = new int[3][2];
    	ar[0][0] = 10;
    	ar[0][1] = 20;
    	ar[1][0] = 30;
    	ar[1][1] = 40;
    	ar[2][0] = 50;
    	ar[2][1] = 60;
    	for(int i = 0; i < 3; i++) {
    		for(int j = 0; j < 2; j++) {
    			System.out.print(ar[i][j]+" ");
    		}
    		System.out.println();
    	}
    }
}
