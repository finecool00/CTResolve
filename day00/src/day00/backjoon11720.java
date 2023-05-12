package day00;

import java.util.Scanner;

public class backjoon11720 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();	
		String b = scan.next(); 
		int sum = 0;
		for(int i =0; i<a; i++) {
			sum += b.charAt(i)-48;			
		}
		System.out.println(sum);
	}
}
