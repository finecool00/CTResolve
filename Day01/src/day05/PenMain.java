package day05;

public class PenMain {
	public static void main(String[] args) {
		//펜사용 하려면 객체로 생성 해야 합니다.
		Pen a = new Pen();
		a.ink = "빨강색";
		a.price = 2000;
		a.company = "빨간펜";
		
		a.write();
		
		Pen b = new Pen();
		b.ink = "검정색";
		b.price = 2000;
		b.company = "모나미";
		
		b.write();
		
		a.info();
		b.info();
	}

}
