package day00;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();		
		int[] arr = new int[5];
		int i = 0;
		int max = arr[0];
		int min = arr[4];
		while(i < arr.length) {
			arr[i] =scan.nextInt();
			if(min > arr[i]) {
				 min = arr[0];
			} else if(max < arr[i]) {
				 max = arr[0];
			}i++;
		}System.out.println(min + " " + max);
		scan.close();
		
	}
}