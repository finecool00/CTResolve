package Quiz09;

public class MainClass {
	public static void main(String[] args) {
		SuperSonicAp s = new SuperSonicAp("홍길동");
		
		s.takeOff();
		s.fly();
		s.flyMode =1;
		s.fly();
		s.land();
	}

}
