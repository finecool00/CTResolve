package Quiz;

import java.util.Scanner;

public class Quiz07 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수1>");
		int a = scan.nextInt();
		System.out.println("연산을 선택하세요 [+, -, *, /]");
		String c = scan.next();
		System.out.println("정수2>");
		int b = scan.nextInt();
		
		
		
		switch (c) {
		case "+":
			System.out.println("두 수의 합은:" + (a + b));
			break;
		case "-":
			System.out.println("두 수의 빼기는:" +(a - b));
			break;
		case "*":
			System.out.println("두 수의 곱은:" + (a * b));
			break;
		case "/":
			System.out.println("두 수의 나눗셈은:" + (a / b));
			break;

		default:
			break;
		}
	}

}
