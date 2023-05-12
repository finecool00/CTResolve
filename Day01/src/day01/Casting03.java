package day01;

public class Casting03 {
	
	public static void main(String[] args) {
		
		char c = 'C';
		int i = 2;
		
		//1. 서로 다른 타입의 연산에서 큰 타입에 맞춰서 형변환이 됩니다.
		char cc = (char)(c + i);
		System.out.println(cc);
		int ii = c + i;
		System.out.println(ii);
		
		//2. int형보다 작은 타입의 연산의 결과는 무조건 int
		byte b1 = 100;
		byte b2 = 10;
		//byte b3 = b1 + b2;  byte + byte = int , byte + short = int
		byte b3 = (byte)(b1 + b2);
		System.out.println(b3);
		
		short s1 = 100;
		byte b = 10;
		//short s2 = s1 + b;
		short s2 = (short)(s1 + b);
		
		//byte(1) -> short(2) -> int(4) -> long(8) -> float(4) -> double(8) 
		//실수는 정수보다 표현할 수 있는 값이 많아서 더 크다.
		
		short s5 = 11;
		char c5 = 'd';
		char c6 = (char)(s5 + c5);
		
		char c10 = 'e';
		short s10 = 19;
		short s11 = (short)(s10 + c10);
	}

}
