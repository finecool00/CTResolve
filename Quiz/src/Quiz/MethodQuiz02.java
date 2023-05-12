package Quiz;

import java.util.Scanner;

public class MethodQuiz02 {
	
	public static void main(String[] args) {
//		//정수 2개를 받아서 합을 출력하는 문장
//		//1.반환도 없고, 매개변수 없는 메서드 show()
//		System.out.println("[두 수의 합을 구합니다]");
//		//2.반환은 있고, 매개변수는 없는 메서드 input()
//		Scanner scan = new Scanner(System.in);
//		System.out.print("정수입력>");
//		int num1 = scan.nextInt();
//		
//		System.out.print("정수입력>");
//		int num2 = scan.nextInt();
//		//3.두 수의 합을 리턴하는 메서드 add()
//		int result = num1 + num2;
//		//4.매개변수로 result를 받아서 단순히 출력
//		System.out.println("두수의합:"+result);
		
		show();
		int num1 = input();
		int num2 = input();
		int result =add(num1,num2);
		System.out.println(result);
	}
	static void show() {
		System.out.println("[두 수의 합을 구합니다]");
	}
	static int input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수입력>");
		int num = scan.nextInt();
		return num;
	}
	static int add(int a,int b) {
		return a + b;
	}
}
