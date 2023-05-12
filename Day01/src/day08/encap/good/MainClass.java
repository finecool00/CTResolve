package day08.encap.good;

public class MainClass {
	public static void main(String[] args) {
		MyDate me = new MyDate();
//		me.year = 2022;
		
		me.setYear(2022);
		
		int year = me.getYear();
		System.out.println(year);
		
		me.setMonth(1);
		int month = me.getMonth();
		System.out.println(month);
		
		me.setDay(1);
		int day = me.getDay();
		System.out.println(day);
		
		me.setSsn("123456-7891234");
		String ssn = me.getSsn();
		System.out.println(ssn);
	}

}
