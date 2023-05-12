package Quiz;

import java.util.Random;
import java.util.Scanner;

public class Quiz19 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String[] arr = {"-", "+"};		 
		Random rand = new Random(); 
		int count = 0;  //정답카운트
		int count1 = 0; //오답카운트
		
		
		while(true) {
			int a = (int)(Math.random()* 100)+1;
			int b = (int)(Math.random()* 100)+1;
//			int c = (int)(Math.random()* 2);
			
			System.out.println(a + " " +arr[rand.nextInt(2)]+" " + b +" = " + " ? ");
			System.out.println("문제를 그만 푸시려면 0을 입력하세요.");
			System.out.print(">");
			int x = scan.nextInt();
			if(x == 0) {
				break;
				
			}else if(x == a+b || x == a-b) {
				System.out.println("정답입니다");
				System.out.println("---------");				
				count++;
			}else {
				System.out.println("오답입니다");
				System.out.println("---------");
				count1++;
			}
			
						
		}System.out.println("프로그램 정상 종료");
		System.out.println("정답횟수:" +count);
		System.out.println("오답횟수:" +count1);
		
		scan.close();					
	}

	

}

