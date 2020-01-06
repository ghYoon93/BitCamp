package class_2;
// [문제1]
// 치환하는 프로그램을 작성하시오
// String 클래스의 메소드(indexOf(), replace())를 이용하시오
// 대소문자 상관없이 개수를 계산하시오

import java.util.Scanner;

public class Practice1Backup {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	System.out.print("문자열 입력: ");
    	StringBuilder sb =new StringBuilder(scan.nextLine());
    	System.out.println(sb);
        System.out.print("현재 문자열 입력: ");
        String currentStr = scan.nextLine();
        System.out.print("바꿀 문자열 입력: ");
        String replacedStr = scan.nextLine();
        
       
        int count = 0;
        StringBuilder newSb = new StringBuilder();
        
        if(sb.length() < currentStr.length() || sb.length() == 0) {
    		System.out.println("입력한 문자열의 크기가 작습니다.");
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
    	        	System.out.println("치환한 문자가 없습니다.");
    	        	System.out.println(newSb);
    	        }else {
    	        	System.out.println(count+"개 치환");
    	        	System.out.println(newSb);
    	        }
    	}
        
       
    }
}
