package day00;

import java.util.Scanner;

public class backjoon25304 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int sum = scan.nextInt();
		int num = scan.nextInt();
		int c = 0;
		for(int i =1; i<=num; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();			
			c +=(a*b);
			if(c==sum) {				
				System.out.println("Yes");				
			}
		}if(c != sum) {			
			System.out.println("No");
		}
		scan.close();
	}

}




