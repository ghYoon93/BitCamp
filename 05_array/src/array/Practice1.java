package array;

public class Practice1 {
	public static void main(String[] args) {
		char[] arrayChar = new char[50];
		int[] arrayCount = new int[26];
		for(int i = 0; i < arrayChar.length; i++) {
			int alphabet = (int)(Math.random()*26+65);
			System.out.print((char)alphabet+" ");
			arrayChar[i] = (char)alphabet;
			arrayCount[alphabet-65]++;
			if((i+1)%10 == 0) {
				System.out.println();
			}
		} // for - 알파벳 생성, 출력, 저장, 개수 카운트
		
		System.out.println();
		
		for(int i = 0; i < arrayCount.length; i++) {
			System.out.println((char)(i+65)+" : "+arrayCount[i]);
		} // for - 개수 출력
	} // main
}
