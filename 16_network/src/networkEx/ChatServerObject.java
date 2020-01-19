package networkEx;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ChatServerObject {
	private ServerSocket serverSocket;
	private List<ChatHandlerObject> list;
    public ChatServerObject() {
    	try {
			serverSocket = new ServerSocket(9500);
			System.out.println("���� ���� ��Ʈ��ȣ: 9500");
			list = new ArrayList<ChatHandlerObject>();
			while(true) {
				Socket socket = serverSocket.accept();
				ChatHandlerObject handler = new ChatHandlerObject(socket, list);
				handler.start();
				list.add(handler);
			}
		} catch (IOException e) {
			System.out.println("���� ����");
			e.printStackTrace();
		}
    }
    public static void main(String[] args) {
    	new ChatServerObject();
    }
}
