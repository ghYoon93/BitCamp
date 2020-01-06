package array;

/*
 * 배열의 크기를 입력받아서 배열을 생성하고 데이터를 입력 후 출력하시오.
 * 
 * [실행 결과]
 * 배열 크기: 3
 * ar[0] : 25
 * ar[1] : 36
 * ar[2] : -78
 * 
 * 25  36  -78
 */

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ArrayTest3 {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException{
    	ArrayTest3 at3 = new ArrayTest3();
		System.out.print("배열 크기: ");
		int size = Integer.parseInt(at3.br.readLine());
		int[] ar = new int[size];
		
		int sum = at3.input(ar);
		int max = at3.big(ar);
		int min = at3.small(ar);
		
		at3.output(ar, sum, max, min);
		
	} // main
        
    public int input(int[] ar) throws IOException{
    	int sum = 0;
    	for(int i = 0; i < ar.length; i++) {
			System.out.print("ar["+i+"]: ");
			ar[i] = Integer.parseInt(br.readLine());
			sum += ar[i];
		} // for 데이터 입력
    	System.out.println();
    	return sum;
    } // input
    
    public int big(int[] ar) {
    	int max = ar[0];
    	for(int i = 1; i < ar.length; i++) {
    		if(ar[i] > max) max = ar[i];
    	}
    	return max;
    } // big
    
    public int small(int[] ar) {
    	int min = ar[0];
    	for(int i = 1; i < ar.length; i++) {
    		if(ar[i] < min) min = ar[i];
    	}
    	return min;
    }  // small
    
    public void output(int[] ar, int sum, int max, int min) {
    	for(int data : ar) {
    		System.out.print(data + "    ");
    	}
    	System.out.println();
    	System.out.println("합 = "+sum);
    	System.out.println("최대값 = "+max);
    	System.out.println("최소값 = "+min);
    }
}
