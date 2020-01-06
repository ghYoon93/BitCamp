package abstract_1;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {
	private int year;
	private int month;
	private int[][] calendarMap;
	
	public CalendarTest() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�⵵ �Է�: ");
		this.year = scanner.nextInt();
		
		System.out.print("�� �Է�: ");
		this.month = scanner.nextInt() - 1;
	}
	
	public void calculator() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(calendar.YEAR, this.year);
		calendar.set(calendar.MONTH, this.month);
		calendar.set(calendar.DAY_OF_MONTH, 1);

		int startDay = calendar.get(calendar.DAY_OF_WEEK); // ù ����
		int lastDate = calendar.getActualMaximum(calendar.DATE); // ������ ��
		int row = calendar.getActualMaximum(calendar.WEEK_OF_MONTH);
		
		this.calendarMap = new int[row][7];
		for(int i = 0; i < row; i++) {
			for(int j = 1; j <= 7; j++) {
				if(i*7+j < startDay || i*7+j >= lastDate + startDay) {
					this.calendarMap[i][j-1] = 0;
				}
				else {
					this.calendarMap[i][j-1] = i*7+j - (startDay - 1);
				}
			}
		}
	}  // calculator
	
	public void display() {
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		for(int i = 0; i < this.calendarMap.length; i++) {
			for(int j = 0; j < this.calendarMap[i].length; j++) {
				if(this.calendarMap[i][j] == 0) {
					System.out.print(" \t");
				}else{
					System.out.print(calendarMap[i][j]+"\t");
				}
			}
			System.out.println();
		}
	}  // display
}
