package Programmers;

import java.util.*;

public class Quiz02_Lv0 {

	public static void main(String[] args) {
		//문제 : 등수매기기(Level 0)
		
		int[][] score = {{80,70},{90,50},{40,70},{50,80}};
		//int[][] score = {{80,70},{70,80},{30,50},{90,100},{100,90},{100,100},{10,30}};
		//int[][] score = {{0, 1}, {1, 0}, {0, 0}};
		
		int[] arr = new int[score.length];
		int[] answer = new int[score.length];
		
		
		for(int i = 0; i < score.length;i++) {
			int a = Math.round((score[i][0] + score[i][1]) / 2);
			//int a = (score[i][0] + score[i][1]) / 2;
			System.out.println(a);
		}
		System.out.println(Arrays.toString(arr));
		for(int i = 0; i < score.length; i++) {
			answer[i] = 1;
			for(int j = 0; j < score.length; j++) {
				if(arr[i] < arr[j]) {
					answer[i] += 1;
				}
			}
		}

		
		System.out.println(Arrays.toString(answer));
	}
	
}
