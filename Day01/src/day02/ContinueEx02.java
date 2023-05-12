package day02;

import java.util.Scanner;

public class ContinueEx02 {
	
	public static void main(String[] args) {
		
		//continue의 활용
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int sum = 0;
		int count = 0;
		 //약수의 개수를 셀 변수
		
		x:for(int i = 1; i<=num; i++) {
			count = 0;
			for(int j = 1; j <= i; j++) {
				if(i % j == 0) {
					count++;
				}
				if(count >2) continue x; 
			
			if(count ==2) {
				sum += i;
				
			}System.out.println("소수의 합:" + sum);
			
			
		}scan.close();
	}

	}
}


