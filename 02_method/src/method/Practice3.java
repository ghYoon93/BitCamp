package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
[문제3]
초를 입력받아서 time()에서 시,분,초를 구하여 출력한다

[실행결과]
초를 입력하시오 : 3850
1시간 4분 10초 입니다
 */
public class Practice3 {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("초를 입력하시오 : ");
		int second = Integer.parseInt(br.readLine());
		Practice3 p3 = new Practice3();
		p3.time(second);
		
	} // main

	private void time(int second) {
		int hour = second / 3600; // 1
		int minute = (second % 3600) / 60; // 4
		int sec =  (second % 3600) % 60; // 10
		System.out.println(hour+"시간 "+minute+"분 "+sec+"초 입니다.");
	} // time
}
