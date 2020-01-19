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
		BufferedReader br = new BufferedReader(iStream);
		StringBuilder line = new StringBuilder();
		
		String[] stringArr = {"14K","18K"};
		int[] count = new int[stringArr.length];

		while(true) {
			line.append(br.readLine());
			if(line.toString().equals("null")) break;
			
			for(int i = 0; i < stringArr.length; i++) {
				count[i] += new UrlTest2().findStr(line, stringArr[i]);
			}
			
			line.setLength(0);
		}
		br.close();
		
		for(int i = 0; i < count.length; i++) {
			System.out.println(stringArr[i]+": " + count[i]);
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
