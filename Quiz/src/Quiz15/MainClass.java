package Quiz15;

public class MainClass {
	public static void main(String[] args) {
		Class c = new Class();
		c.insert("휴대폰");
		c.insert("자전거");
		c.insert("컴퓨터");
		c.delete("자전거");
		
		c.print();
		
	}

}
