package day02;

import java.util.Scanner;

public class ForEx02 {
	
	public static void main(String[] args) {
		
		//입력받은 정수가 소수인지 for문으로 판별
		//소수의 특징은 약수의 개수가 2개다
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int count = 0; //합계변수 카운트
		for(int i = 1; i<=num; i++ ) {
			
			
			if(num % i ==0) { //약수
				count++;
			}
		}
		System.out.println( count == 2 ? num + "은 소수" : "은 소수가 아님");
	}

}
