package Quiz;

import java.util.Scanner;

public class Quiz03 {
	
	public static void main(String[] args) {
		
		//키는 140이상, 나이는 8세 이상인 경우만 놀이기구 탑승 가능
		
		Scanner scan = new Scanner(System.in);
		System.out.println("키는 몇cm입니까?>");
		double cm = scan.nextDouble();
		System.out.println("나이는 몇살입니까?>");
		int age = scan.nextInt();
		
		System.out.println("키:" + cm +  ",나이:" + age  );
		
		if(cm >= 140 && age >= 8) {
			System.out.println("140이상입니다." +  ",8세이상입니다");
			System.out.println("탑승가능");
		} else {
			System.out.println("140미만입니다" + "8세미만입니다");
			System.out.println("탑승불가능");
			
			scan.close();
		}

	}

}
