package Quiz;

import java.util.Scanner;

public class Quiz16 {
	
	public static void main(String[] args) {
		
		/*-> 문제의 출처: 
		 * /1. 가로, 세로길이를 입력을 받습니다.
		 * 2. 가로, 세로길이만큼 사각형을 출력합니다.
		 * 3.단 윤곽만 나오면 됩니다.
		 * 힌트: 1행, 마지막행, 1열, 마지막열 만 출력
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("가로입력>");
		int a = scan.nextInt();
		System.out.println("세로입력>");
		int b = scan.nextInt();
		for(int i = 0; i<b; i++) {//세로
			
			for(int j =0; j<a; j++) {
				if(i ==0 || i == b-1) {
					System.out.println("*");
				}else {
					if(j == 0 || j == a-1) {
						System.out.println("*");
					}else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}	
		scan.close();
		}
}			
			
		
		
	


