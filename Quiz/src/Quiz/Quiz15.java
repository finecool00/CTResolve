package Quiz;

import java.util.Scanner;

public class Quiz15 {
	
	public static void main(String[] args) {
		
		//1. 7~100까지의 정수 중에 7의 배수만 가로로 출력. (완료)
		//2. 1~200 까지 정수 중에 9의 배수의 개수를 출력. (완료)
		//3. 100~50사이의 두 수 사이의 합 (완료)
		//4. A~Z까지 카로로 붙여서 출력 'A'=65  'Z'=90 (완료)
		//5. 입력받은 정수까지 5팩토리얼 만들기 
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int count = 1;
		for(int a = 1; a<=num; a++  ) {
			count *= a;
			
			}
		System.out.println(num + "!=" + count);
			}
			
		}
	


