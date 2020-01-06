package instance;

public class Practice6 {
	public static void main(String[] args) {
		char ch = 'T';
		char result = (char) (ch >= 65 && ch <= 90 ? ch + 32 : ch - 32);
		System.out.println(ch + " -> " + result);
		ch = 'e';
		result = (char) (ch >= 'A' && ch <= 'Z' ? ch + 32 : ch - 32);
		System.out.println(ch + " -> " + result);
	}
}
