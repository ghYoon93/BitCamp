package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
[����3]
�ʸ� �Է¹޾Ƽ� time()���� ��,��,�ʸ� ���Ͽ� ����Ѵ�

[������]
�ʸ� �Է��Ͻÿ� : 3850
1�ð� 4�� 10�� �Դϴ�
 */
public class Practice3 {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�ʸ� �Է��Ͻÿ� : ");
		int second = Integer.parseInt(br.readLine());
		Practice3 p3 = new Practice3();
		p3.time(second);
		
	} // main

	private void time(int second) {
		int hour = second / 3600; // 1
		int minute = (second % 3600) / 60; // 4
		int sec =  (second % 3600) % 60; // 10
		System.out.println(hour+"�ð� "+minute+"�� "+sec+"�� �Դϴ�.");
	} // time
}
