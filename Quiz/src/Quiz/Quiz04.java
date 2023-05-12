package Quiz;

import java.util.Scanner;

public class Quiz04 {
	
	public static void main(String[] args) {
		
		//1. 두 정수를 입력을 받고, 큰 수를 출력하면 됩니다.
		//단, 같은수라면 "같은 수 입니다" 출력
		
		Scanner scan = new Scanner(System.in);
		int point = scan.nextInt();
		int point1 = scan.nextInt();
		
		if(point > point1 ) {
			System.out.println(point);
		} else if(point < point1) {
			System.out.println(point1);
		} else if(point == point1) {
			System.out.println("같은수 입니다");
		}
	}

}
