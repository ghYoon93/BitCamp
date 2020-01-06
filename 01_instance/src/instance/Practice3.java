package instance;

public class Practice3 {
	public static void main(String[] args) {
		String name = "L";
		int basePay = 2500000;
		int tax = (int) (basePay * 0.033);
		int salary = basePay - tax;
		System.out.println("***" + name + "의 월급 ***");
		System.out.println("세금 = " + tax+"원");
		System.out.println("월급 = " + salary+"원");
	}
}
