package Quiz;

import java.util.Scanner;

public class Quiz17 {
	
	public static void main(String[] args) {
		
		/*
		 * 1.입력받은 수까지의 소수들의 합
		 */
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int sum = 0;
		 //약수의 개수를 셀 변수
		
		for(int i = 1; i<=num; i++) {
			int count = 0;
			for(int j = 1; j <= i; j++) {
				if(i % j == 0) {
					count++;
				}
			}
			if(count ==2) {
				sum += i;
				
			}System.out.println("소수의 합:" + sum);
			
			
		}scan.close();
	}
}