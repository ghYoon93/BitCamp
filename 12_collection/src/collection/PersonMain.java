package collection;

import java.util.ArrayList;

import java.util.Iterator;

public class PersonMain {
    public ArrayList<PersonDTO> init() {
    	PersonDTO aa = new PersonDTO("홍킬동" ,25);
    	PersonDTO bb = new PersonDTO("또치 ",40);
    	PersonDTO cc = new PersonDTO("코난" ,16);
    	
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
