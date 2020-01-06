package array;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Practice3 {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int[] lottoArray = new int[6];
    	Practice3 p3 = new Practice3();
    	System.out.print("현금 입력: ");
    	int cash = Integer.parseInt(br.readLine());
    	for(int i = 0; i < cash / 1000; i++) {
    		p3.input(lottoArray);
    		p3.sort(lottoArray);
    		p3.output(lottoArray);
    		if(i%5 == 4) System.out.println();
    	}
    } // main
    
    private void sort(int[] lottoArray) {
		//Selection Sort
    	for(int i = 0; i < lottoArray.length-1; i++) {
    		for(int j = i+1; j < lottoArray.length; j++) {
    			if(lottoArray[i] > lottoArray[j]) {
    				int temp = lottoArray[i];
    				lottoArray[i] = lottoArray[j];
    				lottoArray[j] = temp;
    			}
    	}
    		
    	}
	}

	public void input(int[] lottoArray) {
    	for(int i = 0; i < lottoArray.length; i++) {
    		lottoArray[i] = (int)(Math.random()*45+1);
	    	for(int j = 0; j < i; j++) {
	    		if(lottoArray[i] == lottoArray[j]) {
	    			i--;
	    			break;
	    		}
    	    	  // for
    	    }  // while
    	}  // for
    }  // input()
    
    public void output(int[] lottoArray) {
    	for(int number : lottoArray) {
    		System.out.print(String.format("%5d", number));
    	}  // for
    	System.out.println();
    } // output()
    
}
