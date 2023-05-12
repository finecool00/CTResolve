package day00;

import java.util.Arrays;
import java.util.Scanner;

public class backjoon10871 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int[] arr = new int[a]; 
		int b = scan.nextInt();
		for(int i = 0; i<a; i++) {
			arr[i] = scan.nextInt();
		}
		int count = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]<b) {
				System.out.print(arr[i] + " ");				
			}
		}
	}
}
