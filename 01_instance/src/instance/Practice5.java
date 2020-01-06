package instance;

public class Practice5 {
	public static void main(String[] args) {
		int score = 25;
		String result = score % 2 == 0 && score % 3 == 0 ? "이다." : "가 아니다.";
		System.out.println(score + "는 2와 3의 공배수" + result);
		score = 12;
		result = score % 2 == 0 && score % 3 == 0 ? "이다." : "가 아니다.";
		System.out.println(score + "는 2와 3의 공배수" + result);
	}
}
