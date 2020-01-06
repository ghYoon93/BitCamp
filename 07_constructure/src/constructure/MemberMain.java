package constructure;

import java.util.Scanner;

public class MemberMain {
	private final int CAPACITY = 5;
	MemberDTO[] memberDTO = new MemberDTO[CAPACITY];
	
    public static void main(String[] args) {
    	MemberMain mm = new MemberMain();
    	mm.menu();
    }
    
    public void menu() {
    	Scanner scan = new Scanner(System.in);
    	int count = 0;
    	while(true) {
    		System.out.println("************************");
    		System.out.println("\t1. ����");
    		System.out.println("\t2. ���");
    		System.out.println("\t3. ����");
    		System.out.println("\t4. Ż��");
    		System.out.println("\t5. ������");
    		System.out.println("************************");
    		System.out.print("��ȣ: ");
    		int choice = scan.nextInt();
    		if(choice == 1) {
    			count = this.insert(count);
    		}else if(choice == 2) {
    			this.list();
    		}else if(choice == 3){
    			this.update();
    		}else if (choice == 4) {
    			count = this.delete(count);
    		}else if (choice == 5) {
    			break;    			
    		}
    	}
    }
    public int insert(int count) {
    	if(count == CAPACITY) {
    		System.out.println("5���� ������ �� á���ϴ�...");
    	}else {
    		for(int i = 0 ; i < memberDTO.length; i++) {
    			if(memberDTO[i] == null) {
        			Scanner scan = new Scanner(System.in);
        			memberDTO[i] = new MemberDTO();
        			System.out.print("�̸� �Է�: ");
        			memberDTO[i].setName(scan.nextLine());
        			System.out.print("���� �Է�: ");
        			memberDTO[i].setAge(scan.nextInt());
        			scan.nextLine();
        			System.out.print("�ڵ��� ��ȣ �Է�: ");
        			memberDTO[i].setPhoneNumber(scan.nextLine());
        			System.out.print("�ּ� �Է�: ");
        			memberDTO[i].setAddress(scan.nextLine());
        			System.out.println("1 row created");
        			count++;
        			System.out.println((CAPACITY-count)+"�ڸ� ���ҽ��ϴ�.");
        			break;
        		}
        	}
    	}
    	return count;
    	
    }  // insert - 1. ����
    
    public void list() {
    	System.out.println("�̸�\t����\t�ڵ���\t\t�ּ�");
    	for(int i = 0; i < memberDTO.length; i++) {
    		if(memberDTO[i] != null) {
    			System.out.println(  memberDTO[i].getName()+"\t"
						+memberDTO[i].getAge()+"\t"
						+memberDTO[i].getPhoneNumber()+"\t\t"
						+memberDTO[i].getAddress());
    		}
    	}
    }  // list - 2. ���
    
    public void update() {
    	Scanner scan = new Scanner(System.in);
    	boolean isUpdated = false;
    	System.out.print("�ڵ��� ��ȣ �Է�: ");
    	String phoneNumber = scan.nextLine();
    	for(int i = 0; i < memberDTO.length; i++) {
    		if(memberDTO[i] != null && memberDTO[i].getPhoneNumber().equals(phoneNumber)) {
    			System.out.println("�̸�\t����\t�ڵ���\t\t�ּ�");
    			System.out.println(  memberDTO[i].getName()+"\t"
    								+memberDTO[i].getAge()+"\t"
    								+memberDTO[i].getPhoneNumber()+"\t\t"
    								+memberDTO[i].getAddress());
    			
    			System.out.print("������ �̸� �Է�: ");
    			memberDTO[i].setName(scan.nextLine());
    			
    			System.out.print("������ �ڵ��� �Է�: ");
    			memberDTO[i].setPhoneNumber(scan.nextLine());
    			
    	    	System.out.print("������ �ּ� �Է�: ");
    	    	memberDTO[i].setAddress(scan.nextLine());
    	    	
    	    	System.out.println("1 row(s) updated");
    	    	isUpdated = true;
    	    	break;
    		}
    	}
    	if(!isUpdated) {
    		System.out.println("ã�� ȸ���� �����ϴ�.");
    	}
    }  //  updated - 3. ����
    
    public int delete(int count) {
    	boolean isDeleted = false;
    	Scanner scan = new Scanner(System.in);
    	System.out.print("�ڵ��� ��ȣ �Է�: ");
    	String phoneNumber = scan.nextLine();
    	
    	for(int i = 0; i < memberDTO.length; i++) {
    		if(memberDTO[i] != null && memberDTO[i].getPhoneNumber().equals(phoneNumber)) {
    			memberDTO[i] = null;
    	    	System.out.println("1 row deleted");
    	    	isDeleted = true;
    	    	count--;
    	    	break;
    		}
    	}
    	if(!isDeleted) {
    		System.out.println("ã�� ȸ���� �����ϴ�.");
    	}
    	return count;
    }  // delete - 4. Ż��
 
}
