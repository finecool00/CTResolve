package day01;

public class DataType {
	
	public static void main(String[] args) {
		
		//정수형타입 
		byte a = 127;
		byte a1 = -128;
		
		short b = 32767;
		short b1 = -32768;
		
		int c = 2147483647;
		int c1 = -2147483648;
		
		long d = 123123123123123123L; //숫자뒤에 L붙이기 롱타입표시
		long d1 = -123123123123123123L;
		
		//2진수, 8진수, 16진수
		int bin = 010; //8진수는 앞에 0을붙임
		System.out.println("8진수 010은:" + bin +"입니당!헤헿");
		
		int bin2 = 0b111; //2진수는 앞에 0b를 붙임
		System.out.println("2진수 111은:" + bin2);
		
		int hexa = 0xA9; //16진수는 앞에 0x를 붙임
		System.out.println("16진수 A9:" + hexa);
		
		System.out.println("--------------------------------");
		
		//실수형타입
		float f1 = 3.14F;
		double n1 = 3.14;
		
		System.out.println(f1);
		System.out.println(n1);
		
		float f2 = 3.141592777777F; //7자리까지 유효함
		double n2 = 3.141592777777; //15자리까지 유효함
		
		System.out.println(f2);
		System.out.println(n2);
		
		System.out.println("------------------------------");
		
		//true, false 만 저장 가능함
		boolean bool1 = true;
		boolean bool2 = false;
		
		System.out.println(bool1);
		System.out.println(bool2);
		
		
		
	}

}
