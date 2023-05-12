package day02;

import java.util.Scanner;

public class SwitchEx02 {
	
	public static void main(String[] args) {
		
		//switch문장의 else if문과 상당히 유사함
		Scanner scan = new Scanner(System.in);
		System.out.println("점수입력>");
		
		int point = scan.nextInt();
		
		//연산식도 들어갈 수 있음 , 단 실수는 안됨
		switch (point / 10) {
		case 9:
			if(   point >= 90) {
				System.out.println("A학점");
				
			} else if(point >= 95) {
				System.out.println("A+학점");
			}
			break;
		case 8:
			System.out.println("B학점");
			break;
		case 7:
			System.out.println("C학점");
			break;
		case 6:
			System.out.println("D학점");
			break;

		default:
			System.out.println("재수강입니다");
			break;
		}
		scan.close();
		
		}
	}


