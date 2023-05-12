package day13.api.util.date;

import java.util.Arrays;
import java.util.Calendar;

public class CalendarEx {
	public static void main(String[] args) {
//		Calendar cal = new Calendar();
		//static 메서드를 사용해서 객체를 반환하는 모형
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);//1
		int year=cal.get(1);
		int a = Calendar.YEAR;
		System.out.println(year);
		System.out.println(Calendar.MONTH);//2
		System.out.println(Calendar.DATE);//5
		
		int month = cal.get(2);
		int date = cal.get(5);
		System.out.println(month+1); //month는 1이작게나와서 플러스1해줘야합니다
		System.out.println(date);
		
		int hour = cal.get(Calendar.HOUR);
		System.out.println(hour);
		int min = cal.get(Calendar.MINUTE);
		System.out.println(min);
		int sec = cal.get(Calendar.SECOND);
		System.out.println(sec);
	}

}
