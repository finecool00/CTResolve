package day00;

import java.util.Arrays;
import java.util.Scanner;

public class backjoon1546 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		double[] arr = new double[a];
		double add = 0;
		for(int i =0; i<a; i++) {
			int b = scan.nextInt();
			arr[i] = b;			
		}Arrays.sort(arr);	
		for(int j =0; j<a; j++) {
			add  += ((arr[j]/arr[arr.length-1])*100); 
		}
		System.out.println(add/a);
		}		
	}

