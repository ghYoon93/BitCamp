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
		// �޴� �Լ� ȣ��
		at4.menu(ar);
		System.out.println("���α׷��� �����մϴ�.");
	}
	
	public void menu(boolean[] ar) throws IOException{
		while(true) {
			System.out.println("**************");
			System.out.println("   1. ����");
			System.out.println("   2. ����");
			System.out.println("   3. ����Ʈ");
			System.out.println("   4. ����");
			System.out.println("**************");
			System.out.print("  �޴� : ");
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
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			} // if - choice
		} // while
	} // menu()
	
	public void input(boolean[] ar) throws IOException{
		System.out.print("��ġ �Է� : ");
		int location = Integer.parseInt(br.readLine());
		if(location <= ar.length) {
			if(!ar[location-1]) {
				System.out.println(location+"��ġ�� ����");
				ar[location-1] = true;
			}else {
				System.out.println("�̹� �����Ǿ��ֽ��ϴ�.");
			}
		}else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		} // if location
		
	} // input()
	
	public void output(boolean[] ar) throws IOException {
		System.out.print("��ġ �Է� : ");
		int location = Integer.parseInt(br.readLine());
		if(location <= ar.length) {
			if(ar[location-1]) {
				System.out.println(location+"��ġ�� ����");
				ar[location-1] = false;
			}else {
				System.out.println("�����Ǿ� �����ʽ��ϴ�.");
			}
		}else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		} // if location
	} // output()
	
	public void list(boolean[] ar) {
		for(int i = 0; i < ar.length; i++) {
			System.out.println((i+1)+"��ġ : "+ ar[i]);
		} // for list
	} // list()
}
