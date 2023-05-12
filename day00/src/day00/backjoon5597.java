package day00;

import java.util.Arrays;
import java.util.Scanner;

public class backjoon5597 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = {scan.nextInt() ,scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt()
				,scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt()
				,scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt()
				,scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt()
				,scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt()
				,scan.nextInt(),scan.nextInt(),scan.nextInt()};	
		System.out.println(Arrays.toString(arr));
		int temp = 0;
		for(int i =0; i<arr.length; i ++) {
			if(arr[i] != i+1) {
				temp = i;
				
			}System.out.println(temp);
		}
	}

}
