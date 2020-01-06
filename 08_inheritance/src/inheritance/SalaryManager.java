package inheritance;

import java.util.Scanner;

public class SalaryManager {
	private final int SIZE = 100;
	private EmployeeDTO[] employee = new EmployeeDTO[SIZE];
	
	public void showMenu() {
    	Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("=============================");
			System.out.println("\t���� ���� ���α׷�");
			System.out.println("=============================");
			System.out.println("\t1. ���");
			System.out.println("\t2. ���");
			System.out.println("\t3. ����");
			System.out.println("\t4. �˻�");
			System.out.println("\t5. ����");
			System.out.println("=============================");
			System.out.print("��ȣ �Է�: ");
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
				System.out.println("���α׷� ����");
				break;
			}else {
				System.out.println("�߸� �Է��߽��ϴ�.");
				System.out.println();
			}
		}
	} // ���� ���� ���α׷�
	
	
    public void registerEmployee() {
    	System.out.println("���� ��� �޴�");
    	System.out.println("=============================");
    	for(int id = 0; id < SIZE; id++) {
    		if(employee[id] == null) {
    			Scanner scan = new Scanner(System.in);
    			System.out.print("�̸� �Է�: ");
    			employee[id] = new EmployeeDTO(id, scan.nextLine());
    	        System.out.print("���� �Է�: ");
    	        employee[id].setPosition(scan.nextLine());
    	        System.out.print("�⺻�� �Է�: ");
    	        employee[id].setBasePay(scan.nextInt());
    	        scan.nextLine();
    	        System.out.print("���� �Է�: ");
    	        employee[id].setBenefit(scan.nextInt());
    	        employee[id ].setTaxRate();
    	        employee[id].setSalary();
    	        break;
    		}
    	}
    }  // 1. ���
    
    public void showAll() {
    	System.out.println("ID\t�̸�\t����\t�⺻��\t\t����\t\t����\t����");
    	System.out.println("-------------------------------------------------------------------------");
    	for(EmployeeDTO data : employee) {
    		if(data != null) {    			
    			System.out.println(data);
    		}
    	}
    	System.out.println();
    } // 2. ���
    
    public void updateInfo() {
    	Scanner scan = new Scanner(System.in);
    	showAll();
    	System.out.print("��ȣ �Է�: ");
    	int id = scan.nextInt()-1;
    	scan.nextLine();
		
		System.out.print("������ ����: ");
		employee[id].setPosition(scan.nextLine());
		System.out.print("������ �⺻��: ");
		employee[id].setBasePay(scan.nextInt());
		scan.nextLine();
		System.out.print("������ ����: ");
		employee[id].setBenefit(scan.nextInt());
		scan.nextLine();
		employee[id].setTaxRate();
        employee[id].setSalary();
    } // 3. ����
    
    public void searchInfo() {
    	Scanner scan = new Scanner(System.in);
    	System.out.print("�̸� �Է�: ");
    	String name = scan.nextLine();
    	for(int i = 0; i < SIZE; i++) {
    		if(employee[i] == null) {
    			if(i == SIZE-1) System.out.println("�ش� �̸��� ������ �����ϴ�.");
    			continue;
    		}
    		if(employee[i].getName().equals(name)) {
    			System.out.println("ID\t�̸�\t����\t�⺻��\t\t����\t\t����\t����");
    			System.out.println("-------------------------------------------------------------------------");
    			System.out.println(employee[i]);
    			break;	
    		}
    	}
    } // 4. �˻�
    
} // SalaryManaer

