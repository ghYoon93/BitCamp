package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ChatHandler extends Thread {
	private Socket socket;
	private List<ChatHandler> list = new ArrayList<ChatHandler>();
	private BufferedReader br;
	private PrintWriter pw;
	
    public ChatHandler(Socket socket ,List<ChatHandler> list) {
    	this.socket = socket;
    	this.list = list;
    	System.out.println("chatHandler");
    	try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	@Override
	public void run() {
		// 닉네임 받는 쪽
		String nickName;
		try {
			nickName = br.readLine();
			broadcast(nickName+"님이 입장하셨습니다.");
			String line;
			while(true) {
				//받는 쪽
				line = br.readLine();
				System.out.println("qwe");
				System.out.println(line);
				if(line == null || line.toLowerCase().equals("quit")) {
					break;
				}
				System.out.println(line);
				broadcast("["+nickName+"] "+line);
			}
			pw.println("quit");
			pw.flush();
			// 남은 클라이언트에게 퇴장 메세지 보내기
			list.remove(this);
			broadcast(nickName+"님이 퇴장하셨습니다.");
			br.close();
			pw.close();
			socket.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public void broadcast(String string) {
		for(ChatHandler each : list) {
			System.out.println(string);
			each.pw.println(string);
			each.pw.flush();
		}
	}

}
