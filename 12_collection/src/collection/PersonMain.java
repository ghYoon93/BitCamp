package collection;

import java.util.ArrayList;

import java.util.Iterator;

public class PersonMain {
    public ArrayList<PersonDTO> init() {
    	PersonDTO aa = new PersonDTO("ȫų��" ,25);
    	PersonDTO bb = new PersonDTO("��ġ ",40);
    	PersonDTO cc = new PersonDTO("�ڳ�" ,16);
    	
    	ArrayList<PersonDTO> list = new ArrayList<>();
    	list.add(aa);
    	list.add(bb);
    	list.add(cc);
    	return list;
    	
    }
    
	public static void main(String[] args) {
		ArrayList<PersonDTO> list = new PersonMain().init();
		for(PersonDTO data : list) {
			System.out.println(data);
		}
		Iterator<PersonDTO> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}
}
