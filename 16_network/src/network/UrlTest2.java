package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class UrlTest2 {
    public static void main(String[] args) throws IOException {
    	//http://liebli.com/goods/goods_list.php?cateCd=001002
		URL url = new URL("http://liebli.com/goods/goods_list.php?cateCd=001002");
		InputStreamReader iStream = new InputStreamReader(url.openStream());
		BufferedReader buffReader = new BufferedReader(iStream);
		StringBuilder line = new StringBuilder();
		
		int[] count = new int[2];
		String[][] strings = {{"18K","18k"},{"14K","14k"}};

		while(true) {
			if(line.append(buffReader.readLine()).toString().equals("null")) break;
			
			for(int i = 0; i < strings.length; i++) {
				for(int j = 0; j < strings[i].length; j++) {
					count[i] += new UrlTest2().findStr(line, strings[i][j]);
				}
			}
			
			line.setLength(0);
		}
		buffReader.close();
		
		for(int i = 0; i < count.length; i++) {
			System.out.println(strings[i][0]+": " + count[i]);
		}
	} // main
    
    public int findStr(StringBuilder line, String word) {
    	StringBuilder tmpLine = new StringBuilder(line);
    	int count = 0;
    	int index = tmpLine.indexOf(word);
    	while(index != -1) {
    		count++;
    		tmpLine.delete(0, index + 1);
    		index = tmpLine.indexOf(word);
    	}
    	return count;
    }
}
