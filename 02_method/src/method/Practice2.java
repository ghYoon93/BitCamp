package method;
/*
[����2]
�ֻ����� 2�� ������ ���� ���� ���� ���Ͻÿ�
�ֻ����� input()���� 1~6������ ������ �߻��Ͽ� �����Ѵ�
���� add()���� ���Ͽ� ���� �޴´�

[������]
ù��° �ֻ��� �� : 3
�ι�° �ֻ��� �� : 6
���� 9 �̴�
 */
public class Practice2 {
    public static void main(String[] args) {
    	Practice2 p2 = new Practice2();
		int firstValue = p2.input();
		int secondValue = p2.input();
		int sum = p2.add(firstValue, secondValue);
	    System.out.println("ù��° �ֻ��� �� : " + firstValue);
	    System.out.println("�ι�° �ֻ��� �� : " + secondValue);
		System.out.println("���� "+sum+" �̴�.");
	}

	private int add(int firstValue, int secondValue) {
		return firstValue + secondValue;
	}

	private int input() {
		return (int)(Math.random()*6+1);
	}
}
