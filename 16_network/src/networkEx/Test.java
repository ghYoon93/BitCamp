package networkEx;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;

public class Test implements Serializable{
	private int a;
    public Test(int a) {
    	this.a = a;
    }
    public int getA() {
    	return a;
    }
    public static void main(String[] args) {
		Test a = new Test(1);
		Test b = new Test(2);
		Test c = new Test(3);
		Test d = new Test(4);
		try {
			Socket socket = new Socket("192.168.0.62", 9500);
			ObjectOutputStream objOut = new ObjectOutputStream(socket.getOutputStream());
			System.out.println("objOut");
			ObjectInputStream objIn = new ObjectInputStream(socket.getInputStream());
			System.out.println("objIn");
			while(true) {
				objOut.writeObject(a);
				objOut.writeObject(b);
				objOut.writeObject(c);
				objOut.writeObject(d);
				objOut.flush();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(0);
		}
	}
}
