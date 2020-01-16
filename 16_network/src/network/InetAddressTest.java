package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
    public static void main(String[] args) throws UnknownHostException {
//		InetAddress naver = new InetAddress(); // InetAddress의 생성자가 private
		
		InetAddress naver = InetAddress.getByName("www.naver.com");
		System.out.println("naver IP: "+naver.getHostAddress());
		System.out.println();
		InetAddress local = InetAddress.getLocalHost();
		System.out.println("LOCALHOST IP: "+local.getHostAddress());
		System.out.println();
		
		InetAddress[] daumAr = InetAddress.getAllByName("www.daum.net");
		for(InetAddress each : daumAr) {
			System.out.println(each.getHostAddress());
		}
		
		InetAddress[] naverAr = InetAddress.getAllByName("www.naver.com");
		for(InetAddress each : naverAr) {
			System.out.println(each.getHostAddress());
		}
		
	}
}
