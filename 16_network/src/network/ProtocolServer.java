package network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ProtocolServer {
	private ServerSocket serverSocket;
	private Socket socket;
	private BufferedReader br;
	private BufferedWriter bw;
	public ProtocolServer() {
		try {
			serverSocket = new ServerSocket(9500);
			System.out.println("서버 준비 완료");
			socket = serverSocket.accept();
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		} catch (IOException e) {
			System.out.println("클라이언트와 연결이 안되었습니다.");
			System.exit(0);
			e.printStackTrace();
		}
		String line;
		while(true) {
			try {
				//받는 쪽
				line = br.readLine();
				
				//보내는 쪽
				String[] ar = line.split(":");
				if(ar[0].equals(Command.ENTER)) {
					bw.write(ar[1]+"님 입장\n");
					bw.flush();
				}else if(ar[1].equals(Command.EXIT)){
					bw.write(ar[1]+"님퇴장\n");
					bw.flush();
					br.close();
					bw.close();
					socket.close();
					System.exit(0);
				}else if(ar[1].equals(Command.SEND_MESSAGE)){
					bw.write("["+ar[1]+"]"+ar[2]);
					bw.flush();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	public static void main(String[] args) {
		new ProtocolServer();
	}
}
