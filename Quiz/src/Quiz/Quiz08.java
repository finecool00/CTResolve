package Quiz;

import java.util.Arrays;

public class Quiz08 {
	
	public static void main(String[] args) {
		
		String[] arr = {"안녕", "hello", "니하오", "오하", "!@#$"};
		System.out.println(Arrays.toString(arr));
		/*
		 *1. 랜덤수를 생성하고, 이 랜덤수를 이용해서 배열의 랜덤한 값이 출력되게 처리합니다.
		 *2. 출력된 문자열이, 어느 나라언어 인지 판별해서 출력해주면 됩니다. 
		 * 
		 */
		
		int a = (int)(Math.random()*5);
		System.out.println("선택된단어:" +a);
		
		if(a == 0) {
			System.out.println("안녕은:" + "한국어입니다");
		}else if(a == 1) {
			System.out.println("hello는" + "영어입니다");
		}else if(a == 2) {
			System.out.println("니하오는:" + "중국어입니다");
		}else if(a == 3) {
			System.out.println("오하는" + "일본어입니다");
		}else {
			System.out.println("!@#$는" + "알수없는정보입니다");
		}
		
	}
		
		

}
