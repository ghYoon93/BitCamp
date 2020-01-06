package abstract_1;

import java.util.Date;
import java.util.GregorianCalendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Today {
	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		System.out.println("���� ��¥: "+date);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("y�� MM�� dd�� E���� H:m:s");
		System.out.println(simpleDateFormat.format(date));
		System.out.println();
		
		// �� ���� - 1991 07 16
		SimpleDateFormat input = new SimpleDateFormat("yyyyMMddHHmmss");
		Date birth = input.parse("19910716103515");
		System.out.println("�� ���� "+birth);
		System.out.println("�� ����: "+simpleDateFormat.format(birth));
		System.out.println();
		
//		Calendar cal = new Calendar();
		Calendar cal = Calendar.getInstance();
//		Calendar cal = new GregorianCalendar(); // Sub class �̿��� ����
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;  // 1�� - 0
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int week = cal.get(Calendar.DAY_OF_WEEK);  // �Ͽ��� - 1
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(week);
		
		String dayOfWeek = null;
		switch(week) {
		case 1: dayOfWeek = "�Ͽ���"; break;
		case 2: dayOfWeek = "������"; break;
		case 3: dayOfWeek = "ȭ����"; break;
		case 4: dayOfWeek = "������"; break;
		case 5: dayOfWeek = "�����"; break;
		case 6: dayOfWeek = "�ݿ���"; break;
		case 7: dayOfWeek = "�����"; break;
		}
		System.out.println(dayOfWeek);
	}
}
