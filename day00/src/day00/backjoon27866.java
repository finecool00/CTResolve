package day00;

import java.util.Scanner;

public class backjoon27866 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		int b = scan.nextInt();	
		char idx = a.charAt(b-1);
		System.out.println(idx);				
	}

}
