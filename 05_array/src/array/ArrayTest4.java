package array;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ArrayTest4 {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	ArrayTest4 at4 = new ArrayTest4();
	
	public static void main(String[] args) throws IOException{
		ArrayTest4 at4 = new ArrayTest4();
		boolean[] ar = new boolean[5];
		// 메뉴 함수 호출
		at4.menu(ar);
		System.out.println("프로그램을 종료합니다.");
	}
	
	public void menu(boolean[] ar) throws IOException{
		while(true) {
			System.out.println("**************");
			System.out.println("   1. 입차");
			System.out.println("   2. 출차");
			System.out.println("   3. 리스트");
			System.out.println("   4. 종료");
			System.out.println("**************");
			System.out.print("  메뉴 : ");
			int choice = Integer.parseInt(br.readLine());
			if(choice == 1) {
				at4.input(ar);
			}else if(choice == 2) {
				at4.output(ar);
			}else if (choice == 3) {
				at4.list(ar);
			}else if (choice == 4) {
				break;
			}else {
				System.out.println("잘못 입력하셨습니다.");
			} // if - choice
		} // while
	} // menu()
	
	public void input(boolean[] ar) throws IOException{
		System.out.print("위치 입력 : ");
		int location = Integer.parseInt(br.readLine());
		if(location <= ar.length) {
			if(!ar[location-1]) {
				System.out.println(location+"위치에 입차");
				ar[location-1] = true;
			}else {
				System.out.println("이미 주차되어있습니다.");
			}
		}else {
			System.out.println("잘못 입력하셨습니다.");
		} // if location
		
	} // input()
	
	public void output(boolean[] ar) throws IOException {
		System.out.print("위치 입력 : ");
		int location = Integer.parseInt(br.readLine());
		if(location <= ar.length) {
			if(ar[location-1]) {
				System.out.println(location+"위치에 출차");
				ar[location-1] = false;
			}else {
				System.out.println("주차되어 있지않습니다.");
			}
		}else {
			System.out.println("잘못 입력하셨습니다.");
		} // if location
	} // output()
	
	public void list(boolean[] ar) {
		for(int i = 0; i < ar.length; i++) {
			System.out.println((i+1)+"위치 : "+ ar[i]);
		} // for list
	} // list()
}
