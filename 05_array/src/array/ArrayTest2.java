package array;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArrayTest2 {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int size= (int)(Math.random()*4+1); // 2~5
    	System.out.println(size);
    	String[] ar;
    	ar = new String[size];
    	
    	System.out.println("�迭�� ar = " + ar);
    	System.out.println("�迭 ũ�� = " + ar.length);
    	
    	for(int i = 0; i < ar.length; i++) {
    		System.out.print("���� �� �Է�: ");
    		ar[i] = br.readLine();
    	}
    	
    	for(String data : ar) {
    		System.out.println(data);
    		System.out.println("ù��° ����= "+data.charAt(0));
    		System.out.println("���ڿ� ũ�� = "+data.length());
    		System.out.println();
    	}
    }
}
