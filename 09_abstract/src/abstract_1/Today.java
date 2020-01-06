package abstract_1;

import java.util.Date;
import java.util.GregorianCalendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Today {
	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		System.out.println("오늘 날짜: "+date);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("y년 MM월 dd일 E요일 H:m:s");
		System.out.println(simpleDateFormat.format(date));
		System.out.println();
		
		// 내 생일 - 1991 07 16
		SimpleDateFormat input = new SimpleDateFormat("yyyyMMddHHmmss");
		Date birth = input.parse("19910716103515");
		System.out.println("내 생일 "+birth);
		System.out.println("내 생일: "+simpleDateFormat.format(birth));
		System.out.println();
		
//		Calendar cal = new Calendar();
		Calendar cal = Calendar.getInstance();
//		Calendar cal = new GregorianCalendar(); // Sub class 이용한 생성
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;  // 1월 - 0
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int week = cal.get(Calendar.DAY_OF_WEEK);  // 일요일 - 1
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(week);
		
		String dayOfWeek = null;
		switch(week) {
		case 1: dayOfWeek = "일요일"; break;
		case 2: dayOfWeek = "월요일"; break;
		case 3: dayOfWeek = "화요일"; break;
		case 4: dayOfWeek = "수요일"; break;
		case 5: dayOfWeek = "목요일"; break;
		case 6: dayOfWeek = "금요일"; break;
		case 7: dayOfWeek = "토요일"; break;
		}
		System.out.println(dayOfWeek);
	}
}
