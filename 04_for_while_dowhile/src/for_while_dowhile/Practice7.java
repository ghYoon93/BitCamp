package for_while_dowhile;

/*
 * [문제7] 구구단 
 * 3중 for문 사용하세요
 */
public class Practice7 {
    public static void main(String[] args) {
    	for(int enter = 0; enter <= 6; enter+=3) {
    		for(int i = 1; i <= 9; i++) {
    			for(int dan = 2+enter; dan <= 4+enter; dan++) {
    				if(dan > 9) break;
    				System.out.print(dan+" * "+i+" = "+dan*i+"\t");
    			} // for - 2~9단
    			System.out.println();
    		} // for - 1 ~ 9 곱하기
    		System.out.println();
    	} // for - 줄 바꿈
	}
}
