package day01;

public class Operator02 {
	
	public static void main(String[] args) {
		
		//2항 연산자
		int i = 7 / 3;  //2
		int j = 7 % 3;  //1
		int k = 7 * 3;  //21
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		
		//비교 연산자 <. <=, ==, >=, >, !=
		System.out.println(i == j);
		System.out.println(i >= j);
		System.out.println(i <= j);
		System.out.println(i != j);
		System.out.println(21 != k);
		System.out.println(k % 2 != 0);
		System.out.println(k % 2 == 1);
		
		//비트 연산자 - 참고용
		int a =5; // 0000 0101 =5
		int b = 3; // 0000 0011 =3
		
		System.out.println(a & b); // 0000 0001 = 1  둘다 1일때 1
		System.out.println(a | b); // 0000 0111 = 7  둘중에하나라도 1이면 1
		System.out.println(a ^ b); // 0000 0110 = 6  서로같으면0 다르면 1
		
		//비트쉬프트 - 참고용
		int h =100;  // 0110 0100 = 100
		System.out.println(h << 2); //0110 0100 -> 0001 1001 0000 = 400
		
		//
		
	}

}
