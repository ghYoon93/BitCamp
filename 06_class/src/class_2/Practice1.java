package class_2;
// [����1]
// ġȯ�ϴ� ���α׷��� �ۼ��Ͻÿ�
// String Ŭ������ �޼ҵ�(indexOf(), replace())�� �̿��Ͻÿ�
// ��ҹ��� ������� ������ ����Ͻÿ�

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	System.out.print("���ڿ� �Է�: ");
    	StringBuilder sb = new StringBuilder(scan.nextLine());
        System.out.print("���� ���ڿ� �Է�: ");
        String currentStr = scan.nextLine();
        System.out.print("�ٲ� ���ڿ� �Է�: ");
        String replacedStr = scan.nextLine();
        
       
        int count = 0; // ġȯ Ƚ��
        StringBuilder newSb = new StringBuilder(); // ġȯ �� ���ڿ�
        
        if(sb.length() < currentStr.length() || sb.length() == 0) {
    		System.out.println("�Է��� ���ڿ��� ũ�Ⱑ �۽��ϴ�.");
    	}else {
    		int indexOfStr = sb.toString().toLowerCase().indexOf(currentStr.toLowerCase()); 
    		while(indexOfStr != -1) {
    			StringBuilder tmp = new StringBuilder(sb.substring(0, indexOfStr));
        		tmp.append(currentStr);
        		sb.delete(0, indexOfStr+currentStr.length());
        		newSb.append(tmp.toString().replace(currentStr, replacedStr));
        		count++;
        		indexOfStr = sb.toString().toLowerCase().indexOf(currentStr.toLowerCase());
            }
    		newSb.append(sb);
    		sb.delete(0, sb.length());
    		
    		 if(count == 0) {
    	        	System.out.println("ġȯ�� ���ڰ� �����ϴ�.");
    	        	System.out.println(newSb);
    	        }else {
    	        	System.out.println(count+"�� ġȯ");
    	        	System.out.println(newSb);
    	        }
    	}
        
       
    }
}
