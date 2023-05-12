package day12.api.util.arrays;

import java.util.Arrays;

public class ArraysEx {
	public static void main(String[] args) {
		int[] arr = {3,1,2,5,6,7};
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		//탐색 - 선행조건: 정렬
		int result = Arrays.binarySearch(arr, 5); //배열명 ,찾을값
		System.out.println(result);
		
		//배열복사
		int[] arr1 =Arrays.copyOf(arr, arr.length);
		System.out.println(Arrays.toString(arr1)); //깊은복사 (완전히 새로운 배열)
		
		int[] newArr = Arrays.copyOf(arr, arr.length*2);
		System.out.println(Arrays.toString(newArr));
		
		//배열크기지정복사
		int[] newArr3=Arrays.copyOfRange(arr, 1, 3);
		System.out.println(Arrays.toString(newArr3));
		
		//배열의 원소비교
		if(Arrays.equals(arr, newArr)) {
			System.out.println("배열의 원소가 같음");
		}else {
			System.out.println("다름");
		}
	}

}
