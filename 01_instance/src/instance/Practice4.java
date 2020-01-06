package instance;

public class Practice4 {
	public static void main(String[] args) {
		String name = "홍길동";
		int kor = 90;
		int eng = 85;
		int math = 100;
		int tot = kor + eng + math;
		double avg = tot / 3.0;
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(
				name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + tot + "\t" + String.format("%.2f", avg) + "\t");
	}
}
