package networkEx;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;

public class ChatHandlerObject extends Thread{
	private Socket socket;
	private ObjectOutputStream oos;
	private ObjectInputStream ois;
	private List<ChatHandlerObject> list;
//	private InfoDTO user;
	public ChatHandlerObject(Socket socket, List<ChatHandlerObject> list) {
		this.socket = socket;
		this.list = list;
		
		try {
			oos = new ObjectOutputStream(socket.getOutputStream());
			oos.flush();
			ois = new ObjectInputStream(socket.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
	
	public void run() {
		try {
//			inputData = (InfoDTO) ois.readObject();
//			broadcast(inputData);
			InfoDTO inputData;
			while(true) {
				inputData = (InfoDTO) ois.readObject();
				System.out.println(inputData.getMsg()+"\t"+inputData.getCode());				
				if(inputData == null || inputData.getCode() == Protocol.EXIT) {
					System.out.println("handler run break");
					break;
				}
				System.out.println("run ChatHandler"+inputData);
				broadcast(inputData);
				System.out.println("whileE"+inputData.getMsg()+"\t"+inputData.getCode());
			}
			inputData.setCode(Protocol.EXIT);
			oos.writeObject(inputData);
			oos.flush();
			list.remove(this);
			oos.close();
			ois.close();
			socket.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(0);
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		}
		
	}
	public void broadcast(InfoDTO user) {
		for(ChatHandlerObject each : list) {
			try {
				each.oos.writeObject(user);
				each.oos.flush();
			} catch (IOException e) {
				e.printStackTrace();
				System.exit(0);
			}
		}
	}
}
