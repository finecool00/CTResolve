package Quiz06;

import java.util.Scanner;

public class MyAccount extends Account{
	 /*
	   철수는 Account를 상속받는 나의계좌를 만드려고 한다.
	   기존에 가지고 있는 withDraw()기능이 마음에 들지 않았다.
	   
	   Account를 상속받고
	   withDraw()를 오버라이딩하여 사용자의 입력(Scanner)를 통해 비밀번호가 일치하면
	   금액을 감소시키려고 한다.
	   또한 balance보다 큰 금액을 출금하려는 경우에는 "잔액부족" 을 출력해주어야한다.
	   withDraw() 메서드를 오버라이딩 해주세요.
	   
	   */
	MyAccount(){
		
	}
	MyAccount(String a, int b, int c){
		String accountNumber =a;
		int password =b;
		int balance =c;
	}
	
	
	Scanner scan = new Scanner(System.in);
	void withDraw(int b) {
		//잔고가 0보다 클때만 출금이 가능하도록 변경
		int a = scan.nextInt();
		 if(password == a  ) {
			 if(balance-b>=0) {
				 balance -=b;
			 }else if(balance-a<0){
				
			 } System.out.println("잔액부족");
		 }if(password != a) {
			 System.out.println("비밀번호가 틀립니다");
		 }
		  //잔고에서 빼기
	}
}

