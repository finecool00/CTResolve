package day02;

public class WhileEx01 {
	
	public static void main(String[] args) {
		
		int a = 1;  //제어변수: 반복문의 조건을 제어할 변수
		int sum = 0;
		
		while(a <= 10) { //제어변수로 조건을 생성
			
			sum = sum + a; // sum += a;
			
//			System.out.println("헛!");
			System.out.println(a);
			a++; //제어 변수를 증가해서 언젠가는 조건이 false되도록 처리
		}
		
		System.out.println(sum);
	}

}
