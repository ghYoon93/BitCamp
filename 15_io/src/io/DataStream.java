package io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStream {
    public static void main(String[] args) throws IOException {
    	File file = new File("result.txt");
    	FileOutputStream fos = new FileOutputStream(file);
    	DataOutputStream dos = new DataOutputStream(fos);
    	
    	dos.writeUTF("ȫ�浿");
    	dos.writeInt(25);
    	dos.writeFloat(185.3f);
    	dos.close();
    	
    	FileInputStream fis = new FileInputStream(file);
    	DataInputStream dis = new DataInputStream(fis);
    	
    	System.out.println("�̸�: "+dis.readUTF());
    	System.out.println("����: "+dis.readInt());
    	System.out.println("�̸�: "+dis.readFloat());
    	dis.close();
	}
}