package day02;

import java.util.Scanner;

public class WhileEx03 {
	
	public static void main(String[] args) {
		
		//어떤 수를 입력받아서 입력받은 수가 (소수)인지 판별.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자 입력>");
		int a = scan.nextInt();
		
		int i = 2;
		while(a % i != 0) { // 소수 나오는 조건식
			
			i++;
		}
		System.out.println(a == i ? a+"는 소수" : a + "는 소수가아님" );
	}

}
