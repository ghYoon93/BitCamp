package for_while_dowhile;

public class ForTest_Random {
    public static void main(String[] args) {
    	int count = 0;
		for(int i = 1; i <= 100; i++) {
			char alphabet = (char)(Math.random()*26+65);
			if(alphabet == 'A') count ++;
			System.out.print(alphabet+" ");
			if(i % 10 == 0) System.out.println();
		}
		System.out.println("A�� ����: "+count);
	}
// A~Z �������� 100�� ���
//    [������]
// F G Q W T O P ...... 
 
}
