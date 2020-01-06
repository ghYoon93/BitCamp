package class_2;

import java.util.Scanner;

public class Practice1_overLoadingIndexOf {
	public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	System.out.print("문자열 입력: ");
    	StringBuilder sb = new StringBuilder(scan.nextLine());
        System.out.print("현재 문자열 입력: ");
        String currentStr = scan.nextLine();
        System.out.print("바꿀 문자열 입력: ");
        String replacedStr = scan.nextLine();
                       
        if(sb.length() < currentStr.length() || sb.length() == 0) {
    		System.out.println("입력한 문자열의 크기가 작습니다.");
    		return;
    	}
        
        int count = 0; // 치환 횟수
        int index = 0; // 탐색 시작 index
		int indexOfStr = sb.toString().toLowerCase().indexOf(currentStr.toLowerCase(), index); 
		while(indexOfStr != -1) {
			index = indexOfStr + replacedStr.length();   		
    		count++;
    		indexOfStr = sb.toString().toLowerCase().indexOf(currentStr.toLowerCase(), index);
        }
		sb.append(sb.toString().replace(currentStr, replacedStr));
		sb.delete(0, sb.length()/2);
    	
		if(count == 0) {
	       	System.out.println("치환한 문자가 없습니다.");
	       	System.out.println(sb);
	    }else {
	       	System.out.println(count+"개 치환");
	       	System.out.println(sb);
	    }
        
        
    }  // main
}
