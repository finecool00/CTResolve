package Quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz21 {
	
	public static void main(String[] args) {
		
		//금액의 동전-
		//어떤금액 x가 주어졌을 때, 큰금액부터 거슬러서 몇개가 나와야 하는지 출력
		Scanner scan = new Scanner(System.in);
		int[] arr = {1000,500,100,50,10};		
		System.out.print("금액>");
		int a = scan.nextInt();		
		int i = 0;
		while(i < arr.length) {
			System.out.println(arr[i] + "원:" + a/arr[i]);
			a = a % arr[i]; //나머지저장  
			i++;
		}
		
		
		
		
			
		}
		
	}


