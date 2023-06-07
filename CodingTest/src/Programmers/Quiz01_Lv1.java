package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Quiz01_Lv1 {

	public static void main(String[] args) {
		//문제 : 두 개 뽑아서 더하기(Level 1)
		
		//int[] numbers = {2, 1, 3, 4, 1};
		int[] numbers = {5, 0, 2, 7};
		
		/*
		 * 문제설명
		 * 정수배열 numbers가 주어짐
		 * 서로다른 인덱스의 수 2개 뽑은 후 더함
		 * 만들 수 있는 모든 수를 오름차순 배열값으로 return
		 */
		
		Set<Integer> set = new HashSet<>();
		
		for(int i = 0; i < numbers.length - 1; i++) {
			
			for(int j = i+1; j < numbers.length; j++) {
				
				set.add(numbers[i] + numbers[j]);
			}
			
		}
		
		Integer[] arr = set.toArray(new Integer[0]);
		int[] answer = Arrays.stream(arr).mapToInt(i -> i).toArray();
		
		System.out.println(Arrays.toString(answer));
		
	}
	
	
}
