package Quiz02;

public class TvMain {
	public static void main(String[] args) {
		Tv a = new Tv();
		
		int ch = a.changeChannel(10);
		System.out.println("현재 채널:" +ch);
		a.power();
		System.out.println("==============");
		
		Tv b = new Tv("삼성",17,true);
		int c= b.changeChannel(10);
		b.power();
		b.power();
		System.out.println(c);
	}

}
