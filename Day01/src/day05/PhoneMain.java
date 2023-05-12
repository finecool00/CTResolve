package day05;

public class PhoneMain {
	public static void main(String[] args) {
		Phone a = new Phone(); 
		a.info();
		
		Phone b = new Phone("아이폰14");
		b.info();
		
		Phone c = new Phone("TTL","빨강색");
		c.info();
		
		Phone d = new Phone("가로본능",400000);
		d.info();
		//model, color,price를 매개변수로 받아서 초기화하는 생성자를 만들어보세요
		Phone e = new Phone("샤오미","퍼플색",500000);
		e.info();
	}
		
	
}
