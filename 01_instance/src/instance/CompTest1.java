package instance;

public class CompTest1 {
    public static void main(String[] args) {
		int score = 60;
		// int score = 90;
		String result = score >= 80 && score <= 100 ? "합격" : "불합격";
		System.out.println("결과: " + result);
		
		String result2 = score % 2 == 1 ? "홀수":"짝"
				+ "수";
		System.out.println("결과2: " + result2);

		int b = 80;
		String result3 = score>=b? score+"":b+"";
		System.out.println("큰값: " + result3);





















































































	}
}
