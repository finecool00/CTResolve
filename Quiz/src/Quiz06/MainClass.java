package Quiz06;

public class MainClass {
	public static void main(String[] args) {
		
		
		MyAccount b = new MyAccount();
		b.deposit(100000);
		b.withDraw(110000);
		System.out.println(b.getBalance());
	}

}
