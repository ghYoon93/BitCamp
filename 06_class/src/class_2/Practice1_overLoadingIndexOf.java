package class_2;

import java.util.Scanner;

public class Practice1_overLoadingIndexOf {
	public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	System.out.print("���ڿ� �Է�: ");
    	StringBuilder sb = new StringBuilder(scan.nextLine());
        System.out.print("���� ���ڿ� �Է�: ");
        String currentStr = scan.nextLine();
        System.out.print("�ٲ� ���ڿ� �Է�: ");
        String replacedStr = scan.nextLine();
                       
        if(sb.length() < currentStr.length() || sb.length() == 0) {
    		System.out.println("�Է��� ���ڿ��� ũ�Ⱑ �۽��ϴ�.");
    		return;
    	}
        
        int count = 0; // ġȯ Ƚ��
        int index = 0; // Ž�� ���� index
		int indexOfStr = sb.toString().toLowerCase().indexOf(currentStr.toLowerCase(), index); 
		while(indexOfStr != -1) {
			index = indexOfStr + replacedStr.length();   		
    		count++;
    		indexOfStr = sb.toString().toLowerCase().indexOf(currentStr.toLowerCase(), index);
        }
		sb.append(sb.toString().replace(currentStr, replacedStr));
		sb.delete(0, sb.length()/2);
    	
		if(count == 0) {
	       	System.out.println("ġȯ�� ���ڰ� �����ϴ�.");
	       	System.out.println(sb);
	    }else {
	       	System.out.println(count+"�� ġȯ");
	       	System.out.println(sb);
	    }
        
        
    }  // main
}
