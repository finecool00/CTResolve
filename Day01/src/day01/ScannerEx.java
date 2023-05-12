package day01;

import java.util.Scanner;

public class ScannerEx {
	
	public static void main(String[] args) {
		
		//자바의 입력
		//1. 스캐너 객체 필요
		Scanner scan = new Scanner(System.in);
		
		//2. 스캐너가 가지고 있는입력기능을 사용해서 데이터를 입력받음.
		System.out.print("이름을 입력하세요>");
		String name = scan.next(); //입력을 받을 수 있는 상태  문자열을 받음
		
		System.out.print("나이를 입력하세요>");
		int age = scan.nextInt(); //정수를 받음
		
		System.out.println("키를 입력하세요>"); // 실수를 받음
		double cm = scan.nextDouble();
		
		System.out.println("입력받은이름:" + name + ",입력받은나이:" + age + ",입력받은키:" + cm);
		
		//3. 스캐너 자원해제
		scan.close();
	}
	

}
