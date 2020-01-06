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
    		System.out.println("\t1. 가입");
    		System.out.println("\t2. 출력");
    		System.out.println("\t3. 수정");
    		System.out.println("\t4. 탈퇴");
    		System.out.println("\t5. 끝내기");
    		System.out.println("************************");
    		System.out.print("번호: ");
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
    		System.out.println("5명의 정원이 꽉 찼습니다...");
    	}else {
    		for(int i = 0 ; i < memberDTO.length; i++) {
    			if(memberDTO[i] == null) {
        			Scanner scan = new Scanner(System.in);
        			memberDTO[i] = new MemberDTO();
        			System.out.print("이름 입력: ");
        			memberDTO[i].setName(scan.nextLine());
        			System.out.print("나이 입력: ");
        			memberDTO[i].setAge(scan.nextInt());
        			scan.nextLine();
        			System.out.print("핸드폰 번호 입력: ");
        			memberDTO[i].setPhoneNumber(scan.nextLine());
        			System.out.print("주소 입력: ");
        			memberDTO[i].setAddress(scan.nextLine());
        			System.out.println("1 row created");
        			count++;
        			System.out.println((CAPACITY-count)+"자리 남았습니다.");
        			break;
        		}
        	}
    	}
    	return count;
    	
    }  // insert - 1. 가입
    
    public void list() {
    	System.out.println("이름\t나이\t핸드폰\t\t주소");
    	for(int i = 0; i < memberDTO.length; i++) {
    		if(memberDTO[i] != null) {
    			System.out.println(  memberDTO[i].getName()+"\t"
						+memberDTO[i].getAge()+"\t"
						+memberDTO[i].getPhoneNumber()+"\t\t"
						+memberDTO[i].getAddress());
    		}
    	}
    }  // list - 2. 출력
    
    public void update() {
    	Scanner scan = new Scanner(System.in);
    	boolean isUpdated = false;
    	System.out.print("핸드폰 번호 입력: ");
    	String phoneNumber = scan.nextLine();
    	for(int i = 0; i < memberDTO.length; i++) {
    		if(memberDTO[i] != null && memberDTO[i].getPhoneNumber().equals(phoneNumber)) {
    			System.out.println("이름\t나이\t핸드폰\t\t주소");
    			System.out.println(  memberDTO[i].getName()+"\t"
    								+memberDTO[i].getAge()+"\t"
    								+memberDTO[i].getPhoneNumber()+"\t\t"
    								+memberDTO[i].getAddress());
    			
    			System.out.print("수정할 이름 입력: ");
    			memberDTO[i].setName(scan.nextLine());
    			
    			System.out.print("수정할 핸드폰 입력: ");
    			memberDTO[i].setPhoneNumber(scan.nextLine());
    			
    	    	System.out.print("수정할 주소 입력: ");
    	    	memberDTO[i].setAddress(scan.nextLine());
    	    	
    	    	System.out.println("1 row(s) updated");
    	    	isUpdated = true;
    	    	break;
    		}
    	}
    	if(!isUpdated) {
    		System.out.println("찾는 회원이 없습니다.");
    	}
    }  //  updated - 3. 수정
    
    public int delete(int count) {
    	boolean isDeleted = false;
    	Scanner scan = new Scanner(System.in);
    	System.out.print("핸드폰 번호 입력: ");
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
    		System.out.println("찾는 회원이 없습니다.");
    	}
    	return count;
    }  // delete - 4. 탈퇴
 
}
