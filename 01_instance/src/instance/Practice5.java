package instance;

public class Practice5 {
	public static void main(String[] args) {
		int score = 25;
		String result = score % 2 == 0 && score % 3 == 0 ? "�̴�." : "�� �ƴϴ�.";
		System.out.println(score + "�� 2�� 3�� �����" + result);
		score = 12;
		result = score % 2 == 0 && score % 3 == 0 ? "�̴�." : "�� �ƴϴ�.";
		System.out.println(score + "�� 2�� 3�� �����" + result);
	}
}
