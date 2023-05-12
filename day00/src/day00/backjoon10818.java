package day00;

import java.util.Arrays;
import java.util.Scanner;

public class backjoon10818 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int[] arr = new int[a];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = scan.nextInt();			
		}Arrays.sort(arr);
		System.out.println(arr[0] + " " + 	arr[a-1]);			
		}				
	}

