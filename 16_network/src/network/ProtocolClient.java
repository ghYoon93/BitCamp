package network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ProtocolClient {
    private Socket socket;
    private BufferedReader br;
    private BufferedWriter bw;
    private BufferedReader keyboard;
    public ProtocolClient() {
    	try {
			socket = new Socket("192.168.0.62", 9500);
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			keyboard = new BufferedReader(new InputStreamReader(System.in));
		} catch (UnknownHostException e) {
			System.out.println("서버를 찾을 수 없습니다.");
			e.printStackTrace();
			System.exit(0);
		}
    	catch (IOException e) {
    		System.out.println("서버와 연결할 수 없습니다..");
			e.printStackTrace();
			System.exit(0);
		}
    	String msg, line;
    	while(true) {
    		try {
    			// 서버로 보내는 쪽 (클라이언트)
    			/*
    			 * 100:angel
    			 * 200:angel
    			 * 300:angel:안녕
    			 */
				msg = keyboard.readLine();
				bw.write(msg+"\n");
				bw.flush();
				// 서버로부터 받는 쪽(클라이언트)
				/*
				 * angel님 입장
				 * angel님 퇴장
				 * [angel] 안녕
				 */
				line = br.readLine();
				System.out.println(line);
				String[] ar = msg.split(":");
				if(ar[0].equals("200")) {
					br.close();
					bw.close();
					socket.close();
					
					keyboard.close();
					
					System.exit(0);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    }
    public static void main(String[] args) {
		new ProtocolClient();
	}
}
