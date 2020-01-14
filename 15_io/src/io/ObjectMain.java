package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectMain {
    public static void main(String[] args) throws IOException {
//		PersonDTO dto = new PersonDTO("ȫ�浿",25,185.3);
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("result2.txt"));
//		oos.writeObject(dto);
//		oos.close();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("result2.txt"));
		try {
			PersonDTO dto = (PersonDTO) ois.readObject();
			System.out.println("�̸�: "+ dto.getName());
			System.out.println("����: "+dto.getAge());
			System.out.println("Ű: "+dto.getHeight());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
