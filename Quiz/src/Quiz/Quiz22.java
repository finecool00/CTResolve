package Quiz;

import java.util.Arrays;

public class Quiz22 {
	
	public static void main(String[] args) {
		
		/*
		 * 1.   1~9까지 절대 중복 되지 않는 숫자를 추출
		 * arr를 랜덤하게 10번 섞어줍니다.
		 * 0~2번째 값을 새로운 배열로 옴겨 담아보세요
		 */
		//0.1xx~0.9xxx  
		int[] arr = {1,2,3,4,5,6,7,8,9};		
		int temp = 0;
		
		for(int i = 1; i<=10; i++) {
			int x = (int)(Math.random()*9); // 1~9
			int y = (int)(Math.random()*9);
			
			temp = arr[x];
			arr[x] = arr[y];
			arr[y] = temp;
			
		}
		System.out.println(Arrays.toString(arr));
		
		temp = arr[0];
		arr[0] = arr[1];
		arr[1] = arr[2];
		arr[2] = temp;
		System.out.println(Arrays.toString(arr));
		
	}

}
