package day00;

import java.util.Arrays;
import java.util.Scanner;

public class backjoon9086 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		for(int i = 0; i<a; i++) {
			String b = scan.next();
			char c = b.charAt(0);
			char d = b.charAt(b.length()-1);
			System.out.print(c);
			System.out.println(d);
		}
		
	}

}
