package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodTest4 {
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�̸� �Է�: ");
		String name = br.readLine();
		System.out.print("�ֹι�ȣ �Է�: ");
		String id = br.readLine();
		
		char genderNumber = id.charAt(7);
		MethodTest4 mt4 = new MethodTest4();
		String gender = mt4.comp(genderNumber);
		int bornYear = Integer.parseInt(id.substring(0, 2));
		bornYear  += (genderNumber == '1' || genderNumber == '2'? 1900+bornYear:2000+bornYear);
		int age = mt4.calAge(bornYear);
		System.out.println(name+"�� "+gender+"�̰� "+age+"�� �Դϴ�.");
	}

	public int calAge(int bornYear) {
		return 2019 - bornYear + 1;
	}

	public String comp(char genderNumber) {
		return genderNumber == '1' || genderNumber == '3'?"����":"����";
	}
}
