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
	private InfoDTO user;
	public ChatHandlerObject(Socket socket, List<ChatHandlerObject> list) {
		this.socket = socket;
		this.list = list;
		try {
//			oos.flush();
			oos = new ObjectOutputStream(socket.getOutputStream());
			ois = new ObjectInputStream(socket.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(0);
		}
	}
	
	public void run() {
		try {
			user = (InfoDTO) ois.readObject();
			System.out.println(user.getMsg()+"\t"+user.getCode());
			while(true) {
				System.out.println("while"+user.getMsg()+"\t"+user.getCode());
				if(user == null || user.getCode() == Protocol.EXIT) {
					System.out.println("handler run break");
					break;
				}
				System.out.println("run ChatHandler"+user);
				broadcast(user);
				user = (InfoDTO) ois.readObject();
				System.out.println("whileE"+user.getMsg()+"\t"+user.getCode());
			}
			user.setCode(Protocol.EXIT);
			oos.writeObject(user);
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
