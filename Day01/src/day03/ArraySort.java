package day03;

import java.util.Arrays;

public class ArraySort {
	
	public static void main(String[] args) {
		 
		//배열정렬 - 정렬은 대략 7개
		//선택정렬
		int[] arr = {5, 23, 1, 43,200,100,40};
		//바깥 반복문은 회전수
		//안쪽 반복문은
		for(int i =0; i<arr.length-1; i++) { // 0~5
			
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp = 0;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	}

