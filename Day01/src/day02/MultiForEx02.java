package day02;

public class MultiForEx02 {
	
	public static void main(String[] args) {
		
		//회전수가 변경되는 중첩반복문
		//i값에 따라서 j의 값을 변경
		//1 -1
		//2 -1
		//2-2
		
		for(int i = 1; i <= 10; i++) {
			
			for(int j = 1; j <= i; j++) {
				System.out.println(i + "-" + j);
			}
		}
		
		
		//별출력하기
		
		for(int i = 1; i <= 5; i++) {
			
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 1; i <= 5; i++ ) {
			
			for(int j = 1; j<= 5-i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <=2*i-1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
