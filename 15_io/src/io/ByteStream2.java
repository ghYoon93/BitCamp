package io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStream2 {
	public static void main(String[] args) throws IOException {
		File file = new File("data.txt");
    	FileInputStream fis = new FileInputStream(file);
    	BufferedInputStream bis = new BufferedInputStream(fis);
    	
    	int size = (int) file.length();
    	byte[] arr = new byte[size];
    	bis.read(arr, 0, size);
    	
    	System.out.println(new String(arr));
    	bis.close();
    }
}
