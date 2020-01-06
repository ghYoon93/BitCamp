package array;

public class MultiArray3 {
    public static void main(String[] args) {
		int[][] ar = {{1,2,3,0},{4,5,6,0},{7,8,9,0},{0,0,0,0}};
		
		for(int i = 0; i < ar.length; i++) {
			int sum = 0;
			for(int j = 0; j < ar.length-1; j++) {
				sum += ar[i][j];
			}
			ar[i][ar.length-1] = sum;
		}
		
		for(int i = 0 ; i < ar.length; i++) {
			for(int j = 0; j < ar.length; j++) {
				System.out.print(String.format("%4d", ar[i][j]));
			}
			System.out.println();
		}
		System.out.println();
		
		for(int j = 0; j < ar.length; j++) {
			int sum = 0;
			for(int i = 0; i < ar.length-1; i++) {
				sum += ar[i][j];
			}
			ar[ar.length-1][j] = sum;
		}
		
		for(int i = 0 ; i < ar.length; i++) {
			for(int j = 0; j < ar.length; j++) {
				System.out.print(String.format("%4d", ar[i][j]));
			}
			System.out.println();
		}
	}
}
