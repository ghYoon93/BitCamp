package for_while_dowhile;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
// ���ڸ� �Է��Ͽ� ����� 7���� ���Ͻÿ�.
// ��, �����̸� �ٽ� �Է��ϰ� 0�̸� �����Ͻÿ�.
//
// [���� ���]
// ���� �Է�: -7
// ���� �Է�: 8
// 8	16	24	32	40	48	56

public class Multiple {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	while(true) {
    		System.out.print("���� �Է�: ");
        	int number = Integer.parseInt(br.readLine());
        	if(number == 0) {
        		System.out.println("���α׷��� �����մϴ�.");
        		break;
        	}
        	if(number < 0) {
        		System.out.println("������ �Է��ϼ̽��ϴ�.");
        		continue;
        	}
        	for(int i = 1; i <=7; i++) {
        		System.out.print(number*i+"\t");
        	}
        	System.out.println();
    	}
    }
}
