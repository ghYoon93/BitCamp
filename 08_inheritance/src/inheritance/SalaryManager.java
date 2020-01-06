package inheritance;

import java.util.Scanner;

public class SalaryManager {
	private final int SIZE = 100;
	private EmployeeDTO[] employee = new EmployeeDTO[SIZE];
	
	public void showMenu() {
    	Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("=============================");
			System.out.println("\t월급 관리 프로그램");
			System.out.println("=============================");
			System.out.println("\t1. 등록");
			System.out.println("\t2. 출력");
			System.out.println("\t3. 수정");
			System.out.println("\t4. 검색");
			System.out.println("\t5. 종료");
			System.out.println("=============================");
			System.out.print("번호 입력: ");
			int choice = scan.nextInt();
			scan.nextLine();
			System.out.println();
			
			if(choice == 1) {
				registerEmployee();
			}else if(choice == 2) {
				showAll();
			}else if(choice == 3) {
				updateInfo();
			}else if(choice == 4) {
				searchInfo();
			}else if(choice == 5) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("잘못 입력했습니다.");
				System.out.println();
			}
		}
	} // 월급 관리 프로그램
	
	
    public void registerEmployee() {
    	System.out.println("직원 등록 메뉴");
    	System.out.println("=============================");
    	for(int id = 0; id < SIZE; id++) {
    		if(employee[id] == null) {
    			Scanner scan = new Scanner(System.in);
    			System.out.print("이름 입력: ");
    			employee[id] = new EmployeeDTO(id, scan.nextLine());
    	        System.out.print("직급 입력: ");
    	        employee[id].setPosition(scan.nextLine());
    	        System.out.print("기본급 입력: ");
    	        employee[id].setBasePay(scan.nextInt());
    	        scan.nextLine();
    	        System.out.print("수당 입력: ");
    	        employee[id].setBenefit(scan.nextInt());
    	        employee[id ].setTaxRate();
    	        employee[id].setSalary();
    	        break;
    		}
    	}
    }  // 1. 등록
    
    public void showAll() {
    	System.out.println("ID\t이름\t직급\t기본급\t\t수당\t\t세율\t월급");
    	System.out.println("-------------------------------------------------------------------------");
    	for(EmployeeDTO data : employee) {
    		if(data != null) {    			
    			System.out.println(data);
    		}
    	}
    	System.out.println();
    } // 2. 출력
    
    public void updateInfo() {
    	Scanner scan = new Scanner(System.in);
    	showAll();
    	System.out.print("번호 입력: ");
    	int id = scan.nextInt()-1;
    	scan.nextLine();
		
		System.out.print("수정할 직급: ");
		employee[id].setPosition(scan.nextLine());
		System.out.print("수정할 기본급: ");
		employee[id].setBasePay(scan.nextInt());
		scan.nextLine();
		System.out.print("수정할 수당: ");
		employee[id].setBenefit(scan.nextInt());
		scan.nextLine();
		employee[id].setTaxRate();
        employee[id].setSalary();
    } // 3. 수정
    
    public void searchInfo() {
    	Scanner scan = new Scanner(System.in);
    	System.out.print("이름 입력: ");
    	String name = scan.nextLine();
    	for(int i = 0; i < SIZE; i++) {
    		if(employee[i] == null) {
    			if(i == SIZE-1) System.out.println("해당 이름의 직원이 없습니다.");
    			continue;
    		}
    		if(employee[i].getName().equals(name)) {
    			System.out.println("ID\t이름\t직급\t기본급\t\t수당\t\t세율\t월급");
    			System.out.println("-------------------------------------------------------------------------");
    			System.out.println(employee[i]);
    			break;	
    		}
    	}
    } // 4. 검색
    
} // SalaryManaer

