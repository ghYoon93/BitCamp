package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SungJukService {
	ArrayList<SungJukDTO> list = new ArrayList<SungJukDTO>();
	Scanner scan = new Scanner(System.in);
    public void menu() {
    	while(true) {
    		System.out.println("*****************");
    		System.out.println("   1. �Է�");
    		System.out.println("   2. ���");
    		System.out.println("   3. �˻�");
    		System.out.println("   4. ����");
    		System.out.println("   5. ����");
    		System.out.println("   6. ��");
    		System.out.println("*****************");
    		System.out.print("   ��ȣ : ");
    		int choice = scan.nextInt();
    		scan.nextLine();
    		if(choice == 1) {
    			insertArticle();    			
    		}else if(choice == 2) {
    			printArticle();
//    			break;
    		}else if(choice == 3) {
    			searchArticle();
//    			break;
    		}else if(choice == 4) {
    			deleteArticle();
//    			break;
    		}else if(choice == 5) {
    			sortArticle();
//    			break;
    		}else if(choice == 6) {
//    			break;
    		}else {
    			System.out.println("1~6 �߿� �����ϼ���.");
    		}
    	} // while
    } // menu()
    public void insertArticle() {
    	SungJukDTO data = new SungJukDTO();
    	System.out.print("��ȣ �Է�: ");
    	data.setNumber(scan.nextInt());
    	scan.nextLine();
    	System.out.print("�̸� �Է�: ");
    	data.setName(scan.nextLine());
    	System.out.print("���� �Է�: ");
    	data.setKor(scan.nextInt());
    	scan.nextLine();
    	System.out.print("���� �Է�: ");
    	data.setEng(scan.nextInt());
    	scan.nextLine();
    	System.out.print("���� �Է�: ");
    	data.setMath(scan.nextInt());
    	data.setTot();
    	data.setAvg();
    	scan.nextLine();
    	list.add(data);
    }
    
    public void printArticle() {
    	System.out.println("��ȣ\t�̸�\t����\t����\t����\t\t����\t���");
    	for(SungJukDTO data : list) {
    		System.out.println(data);
    	}
    }
    
    public void searchArticle() {
    	System.out.print("�˻��� �̸� �Է�: ");
    	String name = scan.nextLine();
    	boolean isValid = false;
    	for(int i = 0; i < list.size(); i++) {
    		if(list.get(i).getName().equals(name)){
    			isValid = true;
    			break;
    		}
    	}
    	if(isValid) {
    		System.out.println("��ȣ\t�̸�\t����\t����\t����\t\t����\t���");
    		for(SungJukDTO data : list) {
        		if(data.getName().equals(name)) {    			
        			System.out.println(data);
        		}
        	}
    	}else {
    		System.out.println("ã�����ϴ� �̸��� �����ϴ�.");
    	}
    }
    public void deleteArticle() {
    	System.out.print("������ �̸� �Է�: ");
    	String name = scan.nextLine();
    	boolean isValid = false;
    	for(int i = 0; i < list.size(); i++) {
    		if(list.get(i).getName().equals(name)){
    			isValid = true;
    			break;
    		}
    	}
    	if(isValid) {
    		System.out.println("��ȣ\t�̸�\t����\t����\t����\t\t����\t���");
    		for(int i = 0; i<list.size(); i++) {
    			if(list.get(i).getName().equals(name)){
        			list.remove(i);
        			i--;
        		}
    		}
    	}else {
    		System.out.println("�����ϰ����ϴ� �̸��� �����ϴ�.");
    	}
    }
    
    public void sortArticle() {
    	while(true) {
    		System.out.println("1. �̸����� ��������");
        	System.out.println("2. �������� ��������");
        	System.out.println("3. �����޴�");
        	int choice = scan.nextInt();	
        	scan.nextLine();
        	if(choice == 1) {
        		Collections.sort(list);
        		printArticle();
        	}else if(choice == 2) {
        		Comparator<SungJukDTO> totalComparator = new Comparator<SungJukDTO>() {	
        			@Override
					public int compare(SungJukDTO dto1, SungJukDTO dto2) {
						if(dto1.getTotal() < dto2.getTotal()) return 1;
						else if(dto1.getTotal() == dto2.getTotal()) return 0;
						else return -1;
					}
        		};
				Collections.sort(list,totalComparator);	
				printArticle();
        	}else if(choice == 3) {
        		break;
        	}
    
    	}
    }
     // while
     // sortArticle()
}
