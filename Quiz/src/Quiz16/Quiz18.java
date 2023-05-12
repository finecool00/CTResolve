package Quiz16;

import java.util.Scanner;

public class Quiz18 {
	
	public static void main(String[] args) {
		/*
		 * updown게임
		 * 
		 * 1~100까지 랜덤한 수를 1번 생성합니다. (반복문 밖에서)
		 * 
		 * 스캐너를 통해서 값을 입력받습니다.
		 * 랜덤 수가 입력받은 값보다 작으면 "더 작은수를 입력하세요"
		 * 랜덤 수가 입력받은 값보다 크면 "더 큰수를 입력하세요"
		 * 정답을 맞추면 "시도횟수: x회 를 출력하고 종료
		 */
		
		Scanner scan = new Scanner(System.in);
		int num = (int)(Math.random() * 100) + 1;
		int anser = 78;
		int count = 0;
		while(true) {
			try {
				System.out.println("정답 입력>");
				int a = scan.nextInt();
				
				if(a < 78) {
					count++;
					System.out.println("더 큰수를 입력하세요");
				}else if(a >78) {
					count++;
					System.out.println("더 작은수를 입력하세요");
				}else {
					count++;
					System.out.println("정답입니다\n"+"시도횟수:" +count);
					break;								
				}System.out.println(count);
			} catch (Exception e) {
				System.out.println("숫자를 입력하세요");
				scan.nextLine();
			}
			
			
		}scan.close();
	}

}
