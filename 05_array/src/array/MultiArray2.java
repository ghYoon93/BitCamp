package array;

public class MultiArray2 {
    public static void main(String[] args) {
		int[][] ar = new int[10][10];
		// 입력
		int num = 1;
		for (int j = ar.length-1; j >= 0; j--) {
			for(int i = ar.length-1; i >= 0; i--) {
				ar[i][j] = num++;
			}
		}
		// 출력
		for(int i = 0; i < ar.length; i++) {
			for(int j = 0; j < ar[i].length; j++) {
				System.out.print(String.format("%4d", ar[i][j]));
			}
			System.out.println();
		}
	}
}
