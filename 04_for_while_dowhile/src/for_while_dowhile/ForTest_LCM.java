package for_while_dowhile;

/*
 * 1~500 ������ ������ 100�� �߻����� 2�� 3�� ������� ����ϰ� �հ� ������ ����Ͻÿ�.
 * ��, �� �ٿ� 7�� �� ����Ͻÿ�.
 * 
 * [������]
 * 36  12  ...
 * 
 * 2�� 3�� ����� ���� =
 * 2�� 3�� ����� �� =
 * 
 */
public class ForTest_LCM {
    public static void main(String[] args) {
    	int count = 0;
    	int sum = 0;
    	
    	System.out.println("[���� ���]");
    	for(int i = 1; i <= 100; i++) {
    		int randomNumber = (int)(Math.random()*500+1);
    		if(randomNumber%2 == 0 && randomNumber%3 == 0) {
    			System.out.print(String.format("%3d", randomNumber)+" ");
    			count++;
    			sum += randomNumber;
    			if(count%7 == 0) {
    				System.out.println();
    			}
    		}
    	} // for
    	System.out.println();
    	System.out.println("2�� 3�� ����� ���� = "+count);
    	System.out.println("2�� 3�� ����� �� = "+sum);
    } // main
}
