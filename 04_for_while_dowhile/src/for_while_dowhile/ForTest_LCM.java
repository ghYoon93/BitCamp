package for_while_dowhile;

/*
 * 1~500 사이의 난수를 100개 발생시켜 2와 3의 공배수만 출력하고 합과 개수를 출력하시오.
 * 단, 한 줄에 7개 씩 출력하시오.
 * 
 * [실행결과]
 * 36  12  ...
 * 
 * 2와 3의 공배수 개수 =
 * 2와 3의 공배수 합 =
 * 
 */
public class ForTest_LCM {
    public static void main(String[] args) {
    	int count = 0;
    	int sum = 0;
    	
    	System.out.println("[실행 결과]");
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
    	System.out.println("2와 3의 공배수 개수 = "+count);
    	System.out.println("2와 3의 공배수 합 = "+sum);
    } // main
}
