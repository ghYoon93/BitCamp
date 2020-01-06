package inheritance;

import java.util.Scanner;

public class ExamMain {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("인원 수 입력: ");
		Exam[] ex = new Exam[scan.nextInt()];
		scan.nextLine();
		for(int i = 0; i < ex.length; i++) {
			ex[i] = new Exam();
		}
		
		
		System.out.println("이름\t1\t2\t3\t4\t5\t점수");
		for(Exam data : ex) {
			data.compare();
			System.out.print(data.getName()+"\t");
			for(char ans : data.getOx()) {
			System.out.print(ans+"\t");
			}
			System.out.println(data.getScore());
		}
	}
}
