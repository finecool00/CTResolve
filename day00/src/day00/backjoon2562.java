package day00;

import java.util.Arrays;
import java.util.Scanner;

public class backjoon2562 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = { scan.nextInt() , scan.nextInt() , scan.nextInt(),scan.nextInt(),scan.nextInt(),
				scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt()};
			int temp = 0;
			int aaa = 0;
		for(int i = 0; i<arr.length; i++) {
				if(temp<arr[i]) {
					temp = arr[i];
					aaa = i+1;
				}
			}System.out.println(temp);
			System.out.println(aaa);						
		}
	}

