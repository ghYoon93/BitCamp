package collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorTest {
    public static void main (String[] args) {
		Vector<String> v = new Vector<String>();
		for(int i = 1; i <= 10; i++) {
			v.add(i+"");
		}
		System.out.println("벡터 크기: "+v.size());
		System.out.println("벡터 용량: "+v.capacity()); // 기본 용량 10개, 10개 씩 증가
		System.out.println();
		
		v.addElement(5+""); // 중복 허용, 순서
		System.out.println("벡터 크기: "+v.size()); // 11
		System.out.println("벡터 용량: "+v.capacity()); // 20
		
		for(int i = 0; i < v.size(); i++) {
			System.out.print(v.get(i)+" ");
		}
		System.out.println();
		v.remove(5);
		Iterator<String> it = v.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		
		Vector<String> v2 = new Vector<String>(5,2);
	}
}
