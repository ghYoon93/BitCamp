package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapTest {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
		Map<String, String> map = new HashMap<String, String>();
		map.put("book001", "�鼳����");
		map.put("book201", "�ξ����");
		map.put("book101", "�鼳����");
		map.put("book102", "�ǿ���");
		map.put("book101", "��������");
		System.out.println(map.get("book101"));
//		System.out.println(map.get("book101"));
		System.out.print("�ڵ� �Է�: ");
		String code = map.get(scanner.nextLine());
		if(code != null) {
			System.out.println(code);
		}else {
			System.out.println("���� Ű �Դϴ�.");
		}
	}
}
