package day00;

import java.util.Scanner;

public class backjoon10810 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		int m = scan.nextInt();
		for(int i = 0; i<m; i++ ) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			int z = scan.nextInt();
			for(int j=x-1; j<y; j++ ) {
				arr[j] = z;
			}
		}for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
	}		
	}
}
