package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class URLtest {
    public static void main(String[] args) throws IOException {
		URL url = new URL("https://www.naver.com/index.html");
		System.out.println("��������: "+url.getProtocol());
		System.out.println("ȣ��Ʈ: "+url.getHost());
		System.out.println("��Ʈ: "+url.getPort());
		System.out.println("�⺻ ��Ʈ: "+url.getDefaultPort());
		System.out.println("����: "+url.getFile());
		System.out.println();
		
		InputStreamReader iStream = new InputStreamReader(url.openStream());
		BufferedReader buffReader = new BufferedReader(iStream);
		String line = null;
		while((line = buffReader.readLine()) != null) {
			System.out.println(line);
		}
		buffReader.close();
	}
}
