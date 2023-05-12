package Quiz02;

public class AccountMain {
	public static void main(String[] args) {
		Account a = new Account();
		a.info();
		
		Account b = new Account("yjy454","yjy4545",100000);
		b.deposit(-5000);
		b.withDraw(10000);
		int balance = b.getBalance();
		System.out.println(balance);
		
		
	}

}
