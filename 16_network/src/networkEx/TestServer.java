package networkEx;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

import network.ProtocolServer;

public class TestServer {
	private ServerSocket serverSocket;
	private Socket socket;
	private ObjectInputStream objIn;
	private ObjectOutputStream objOut;
	public TestServer() {
		try {
			serverSocket = new ServerSocket(9500);
			System.out.println("���� �غ� �Ϸ�");
			socket = serverSocket.accept();
			objOut = new ObjectOutputStream(socket.getOutputStream());
			objIn = new ObjectInputStream(socket.getInputStream());
		} catch (IOException e) {
			System.out.println("Ŭ���̾�Ʈ�� ������ �ȵǾ����ϴ�.");
			System.exit(0);
			e.printStackTrace();
		}
		Test test;
		while(true) {
			System.out.println("���");
			try {
				//�޴� ��
				test = (Test) objIn.readObject();
				if(test == null) break;
				System.out.println(test.getA());
			} catch (IOException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.exit(0);
			}
			
		}
	}
	public static void main(String[] args) {
		new TestServer();
	}
}
