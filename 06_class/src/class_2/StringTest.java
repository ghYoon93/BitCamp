package class_2;

public class StringTest {
    public static void main(String[] args) {
    	String a = "apple";
    	String b = "apple";
    	if(a==b) System.out.println("a와 b의 참조값은 값다.");
    	else System.out.println("a와 b의 참조값은 다르다.");
    	System.out.println();
    	
    	String c = new String("apple");
    	String d = new String("apple");
    	if(c==d) System.out.println("c와 d의 참조값은 값다.");
    	else System.out.println("c와 d의 참조값은 다르다.");
    	System.out.println();
    	
    	String e = "ABC 오늘 날짜는 "+2019+12+30;
    	System.out.println("e= "+e);
    	e = "abc 오늘 날짜는 " + 2019+12+31;
    	System.out.println("e= "+e);
    	System.out.println("문자열의 크기 = "+e.length());
    	for(int i = 0; i < e.length(); i++) {
    		System.out.println(i+" : " + e.charAt(i));
    	}
    	System.out.println("부분 문자열 추출: "+e.substring(7));
    	System.out.println("부분 문자열 추출: "+e.substring(7,11));
    	
    	System.out.println("대문자 변경: "+"Hello".toUpperCase());
    	System.out.println("소문자 변경: "+"Hello".toLowerCase());
    	
    	System.out.println("문자열 검색:" + e.indexOf("짜"));
    	System.out.println("문자열 검색:" + e.indexOf("날짜"));
    	System.out.println("문자열 검색:" + e.indexOf("abc"));
    }
}
