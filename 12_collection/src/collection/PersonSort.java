package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class PersonSort {
    public static void main(String[] args) {
		String[] ar = {"orange", "apple", "banana", "pear", "peach", "applemango"};
		
		System.out.print("���� ��: ");
		for(String data : ar) {
			System.out.print(data+" ");
		}
		System.out.println();
		
		Arrays.sort(ar);
		System.out.print("���� ��: ");
		for(String data : ar) {
			System.out.print(data+" ");
		}
		System.out.println();
		
		PersonDTO aa = new PersonDTO("ȫ�浿" ,25);
    	PersonDTO bb = new PersonDTO("��ġ ",40);
    	PersonDTO cc = new PersonDTO("�ڳ�" ,16);
    	
    	ArrayList<PersonDTO> list = new ArrayList<>();
    	list.add(aa);
    	list.add(bb);
    	list.add(cc);
    	
    	System.out.print("���� ��"+list);
    	Collections.sort(list);
    	System.out.print("���� ��"+list);
    	
    	//���� ������ �̸����� ���Ӱ� ����
    	Comparator <PersonDTO> com = new Comparator<PersonDTO>() {
    		// �������� return dto1.getName().compareTO(dto2.getName();
    		// �������� return dto2.getName().compareTo(dto1.getName() * -1;
    		@Override
    		public int compare(PersonDTO dto1, PersonDTO dto2) {
    			return dto1.getName().compareTo(dto2.getName()) * -1;
    		}
    	};
    	Collections.sort(list,com);
    	System.out.print("���� ��"+list);
	}

	
	
}
