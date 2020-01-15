package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapTest {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
		Map<String, String> map = new HashMap<String, String>();
		map.put("book001", "백설공주");
		map.put("book201", "인어공주");
		map.put("book101", "백설공주");
		map.put("book102", "피오나");
		map.put("book101", "엄지공주");
		System.out.println(map.get("book101"));
//		System.out.println(map.get("book101"));
		System.out.print("코드 입력: ");
		String code = map.get(scanner.nextLine());
		if(code != null) {
			System.out.println(code);
		}else {
			System.out.println("없는 키 입니다.");
		}
	}
}
