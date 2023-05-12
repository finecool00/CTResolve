package Quiz12;

import java.util.Arrays;

public class MainClass {
	public static void main(String[] args) {
		Radio r = new Radio(300,"라디오");
		Tv t = new Tv(400,"티비");
		Computer com = new Computer(500,"컴퓨터");
		MyCart c = new MyCart(10000);
		c.buy(r);
		c.buy(t);
		c.buy(com);
		
	}

}
