package class_2;
// [����1]
// ġȯ�ϴ� ���α׷��� �ۼ��Ͻÿ�
// String Ŭ������ �޼ҵ�(indexOf(), replace())�� �̿��Ͻÿ�
// ��ҹ��� ������� ������ ����Ͻÿ�

import java.util.Scanner;

public class Practice1Backup {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	System.out.print("���ڿ� �Է�: ");
    	StringBuilder sb =new StringBuilder(scan.nextLine());
    	System.out.println(sb);
        System.out.print("���� ���ڿ� �Է�: ");
        String currentStr = scan.nextLine();
        System.out.print("�ٲ� ���ڿ� �Է�: ");
        String replacedStr = scan.nextLine();
        
       
        int count = 0;
        StringBuilder newSb = new StringBuilder();
        
        if(sb.length() < currentStr.length() || sb.length() == 0) {
    		System.out.println("�Է��� ���ڿ��� ũ�Ⱑ �۽��ϴ�.");
    	}else {
    		
    		while(sb.toString().toLowerCase().indexOf(currentStr.toLowerCase()) != -1) {
        		newSb.append(sb.substring(0, sb.indexOf(currentStr)+currentStr.length()));
        		sb.delete(0, sb.indexOf(currentStr)+currentStr.length());
        		newSb.replace(newSb.toString().toLowerCase().indexOf(currentStr.toLowerCase()), newSb.length(), replacedStr);
        		count++;
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
