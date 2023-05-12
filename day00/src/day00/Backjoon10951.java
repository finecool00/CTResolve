package day00;


import java.util.Scanner;

public class Backjoon10951 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int i = 1;
		while(scan.hasNextInt()) {
			int x , y;
			x = scan.nextInt();
			y = scan.nextInt();

			if(x==0 && y == 0) {
				System.out.println();
				break;
			}else {
				System.out.println(x + y);
			}

		}						
		scan.close();	

	}


}



