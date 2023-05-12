package day03;

import java.util.Arrays;

public class ArraySort02 {
	
	public static void main(String[] args) {
		
		
		//버블정렬 - 가장 느린 정렬 (큰 값을 뒤로 보냄)
//		//
		int[] arr = {1, 5, 23, 40, 43, 100, 200};
//		for(int i = 0; i<arr.length-1; i++) {
//			
//			for(int j =0; j<arr.length-i-1; j++) {				
//				System.out.println(i + "-" + j);
//				if(arr[j] > arr[j+1]) {
//					int temp =arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//				}
//			}
//		}System.out.println(Arrays.toString(arr));
		
		// 아주 유용한 기능
		Arrays.toString(arr);
		Arrays.sort(arr);//가장 빠른 정렬  퀵정렬
		System.out.println(Arrays.toString(arr));
	}

}
