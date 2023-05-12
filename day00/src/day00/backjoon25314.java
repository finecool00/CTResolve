package day00;

import java.util.Scanner;

public class backjoon25314 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		String sum = "long";
		for(int i = 1; i<=a; i++) {
			if(i % 4 == 0) {
				System.out.print(sum + " "  );
				
			}
		}System.out.println("int");
		scan.close();
	}

}


