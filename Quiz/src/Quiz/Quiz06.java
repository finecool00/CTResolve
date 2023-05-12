package Quiz;

import java.util.Scanner;

public class Quiz06 {
	
	public static void main(String[] args) {
		
		/*
		 * if구문 밖에 선언된 변수를 잘 활용합니다.
		 * 
		 * 정수 3개를 입력을 받습니다.
		 * 순서는 상관없음
		 * 가장 큰값, 중간값, 작은값을 구분해서 출력. ( 조건 - 같은 수는 없다)
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int max = 0;
		int a = scan.nextInt();
		int mid = 0;
		int b = scan.nextInt();
		int min = 0;
		int c = scan.nextInt();
		
		
		if(a > b && a > c && b > c) {
			max = a;
			mid = b;
			min = c;
			
			System.out.println("가장큰값:" + a + "중간값:" + b + "작은값:" + c);
		}else if(a > b && a> c && c > b) {
				System.out.println("가장큰값:" + a + "중간값:" + c + "작은값:" + b);
			
			
			}if(b > c && b > a && a > c) {
				System.out.println("가장큰값:" + b + "중간값:" + a + "작은값:" + c);
			}else if(b > c && b > a && a < c) {
				System.out.println("가장큰값:" + b + "중간값:" + c + "작은값:" + a);
			}if(c > a && c > b && b > a) {
				System.out.println("가장큰값:" + c + "중간값:" + b + "작은값:" + a);
			}else if(c > a && c > b && b < a) {
				System.out.println("가장큰값:" + c + "중간값:" + a + "작은값:" + b);
			}else if (a != b && b != c && a != c);
				System.out.println("a,b,c가 같으면 안됩니다.");
				
				scan.close();
		}
	
		}
		
	


