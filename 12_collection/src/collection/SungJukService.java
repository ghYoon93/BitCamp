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
    		System.out.println("   1. 입력");
    		System.out.println("   2. 출력");
    		System.out.println("   3. 검색");
    		System.out.println("   4. 삭제");
    		System.out.println("   5. 정렬");
    		System.out.println("   6. 끝");
    		System.out.println("*****************");
    		System.out.print("   번호 : ");
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
    			System.out.println("1~6 중에 선택하세요.");
    		}
    	} // while
    } // menu()
    public void insertArticle() {
    	SungJukDTO data = new SungJukDTO();
    	System.out.print("번호 입력: ");
    	data.setNumber(scan.nextInt());
    	scan.nextLine();
    	System.out.print("이름 입력: ");
    	data.setName(scan.nextLine());
    	System.out.print("국어 입력: ");
    	data.setKor(scan.nextInt());
    	scan.nextLine();
    	System.out.print("영어 입력: ");
    	data.setEng(scan.nextInt());
    	scan.nextLine();
    	System.out.print("수학 입력: ");
    	data.setMath(scan.nextInt());
    	data.setTot();
    	data.setAvg();
    	scan.nextLine();
    	list.add(data);
    }
    
    public void printArticle() {
    	System.out.println("번호\t이름\t국어\t영어\t수학\t\t총점\t평균");
    	for(SungJukDTO data : list) {
    		System.out.println(data);
    	}
    }
    
    public void searchArticle() {
    	System.out.print("검색할 이름 입력: ");
    	String name = scan.nextLine();
    	boolean isValid = false;
    	for(int i = 0; i < list.size(); i++) {
    		if(list.get(i).getName().equals(name)){
    			isValid = true;
    			break;
    		}
    	}
    	if(isValid) {
    		System.out.println("번호\t이름\t국어\t영어\t수학\t\t총점\t평균");
    		for(SungJukDTO data : list) {
        		if(data.getName().equals(name)) {    			
        			System.out.println(data);
        		}
        	}
    	}else {
    		System.out.println("찾고자하는 이름이 없습니다.");
    	}
    }
    public void deleteArticle() {
    	System.out.print("삭제할 이름 입력: ");
    	String name = scan.nextLine();
    	boolean isValid = false;
    	for(int i = 0; i < list.size(); i++) {
    		if(list.get(i).getName().equals(name)){
    			isValid = true;
    			break;
    		}
    	}
    	if(isValid) {
    		System.out.println("번호\t이름\t국어\t영어\t수학\t\t총점\t평균");
    		for(int i = 0; i<list.size(); i++) {
    			if(list.get(i).getName().equals(name)){
        			list.remove(i);
        			i--;
        		}
    		}
    	}else {
    		System.out.println("삭제하고자하는 이름이 없습니다.");
    	}
    }
    
    public void sortArticle() {
    	while(true) {
    		System.out.println("1. 이름으로 오름차순");
        	System.out.println("2. 총점으로 내림차순");
        	System.out.println("3. 이전메뉴");
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
