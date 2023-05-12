package day13.api.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
		
		//1970년1월1일 00시 00분 기준으로 밀리세컨으로 변경 ->날짜연산
		long millis =date.getTime();
		System.out.println(millis);
		
		//현재시간 +1초
		Date date2 = new Date(System.currentTimeMillis()+1000);
		System.out.println(date2);
		long millis2 = date2.getTime();
		System.out.println(millis2-millis); //밀리초 시간차이
		
		System.out.println("-----------------------------");
		//사람이 보기편한 날짜로 변환
		SimpleDateFormat a = new SimpleDateFormat("yyyy년 MM월 dd일 a hh시:mm분:ss초");
		String x = a.format(date);  //yyyy =년도,MM =월, dd=일, a=오전오후 hh,mm,ss= 시분초
		String y = a.format(date2);
		System.out.println(x);
		System.out.println(y);
	}

}
