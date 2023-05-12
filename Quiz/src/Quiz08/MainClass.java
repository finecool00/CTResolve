package Quiz08;

public class MainClass {
	public static void main(String[] args) {
		Cart c = new Cart(1000);
		c.buy("tv");
		c.info();
		c.buy("com");
		c.info();
		c.buy("radio");
		c.info();
		c.buy("label");
		c.info();
	}
}
