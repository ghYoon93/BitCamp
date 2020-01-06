package instance;

public class Practice7 {
	public static void main(String[] args) {
		String name = "홍길동";
		char gender = 'M';
		String result = gender == 'M' ? "남자이다." : "여자이다.";
		System.out.println(name+"은 " + result);
		gender = 'F';
		result = gender == 'M' ? "남자이다." : "여자이다.";
		System.out.println(name+"은 " + result);
	}
}
