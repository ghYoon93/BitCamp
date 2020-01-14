package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStream {
    public static void main(String[] args) throws IOException {
    	FileInputStream fis = new FileInputStream("data.txt");
    	BufferedInputStream bis = new BufferedInputStream(fis);
    	
    	int data;
    	while((data = bis.read()) != -1) {
    		System.out.print((char)data);
    	}
    	System.out.println(data);
    	bis.close();
    }
}
