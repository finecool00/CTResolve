package Quiz02;

public class Account {
	//한 사람의 은행 계좌
	/*
	 * accountNumber변수 - 식별아이디
	 * password변수 -비밀번호
	 * balance변수 -잔고
	 * 
	 * 생성자
	 * 3가지르 모두 받아서 초기화하는 생성자
	 * 
	 * 메서드
	 * deposit(입금) : void - 잔고에매개변수를 누적하는 기능
	 * withDraw(출금) : void - 잔고에서 매개변수를 차감하는 기능
	 * getBalance : int -잔고를 리턴하는 기능
	 * 
	 */
	String accountNumber;
	String password;
	int balance;
	
	Account() {
		System.out.println("사용자 정보를 확인합니다.");
		System.out.println("아이디:" + accountNumber);
		System.out.println("비밀번호:" + password);
		System.out.println("잔고:" +balance);
		
	}
	Account(String a,String b,int c) {
		accountNumber = a;
		password = b;
		balance = c;
	}
	void info() {
		System.out.println("====사용자 정보====");
		System.out.println("아이디:" + accountNumber);
		System.out.println("비밀번호:" + password);
		System.out.println("잔고" + balance);
	}
	 void deposit(int a) {
		//매개변수가 양수 일때만 가능하도록 변경
		 if(a>0) {			 
			 balance+=a;
		 }else {
			 System.out.println("입금이 0보다 작을수는 없습니다");
		 }
		   //잔고에누적시키기
	}
	 void withDraw(int b) {
		//잔고가 0보다 클때만 출금이 가능하도록 변경
		 if(balance - b >=0) {
			 balance -=b;
		 }else {
			 System.out.println("잔고가 부족합니다");
		 }
		  //잔고에서 빼기
	}
	 int getBalance() {	
		 
		return balance;
	}
}
