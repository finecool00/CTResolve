package day04;

import java.util.Arrays;

public class MethodEx06 {
	
	public static void main(String[] args) {
		//Queue - first in first out (FIFO - 선입선출)
		System.out.println(Arrays.toString(arr));
		push(4);
		System.out.println(Arrays.toString(arr));
		pop();
		System.out.println(Arrays.toString(arr));
		
	}
	static int[] arr = {1,2,3};
	static void push(int data) {		
		int[] temp = new int[arr.length+1];		
		for(int i = 0; i<arr.length; i ++) {
			temp[i] = arr[i];
		}		
		temp[temp.length-1] = data;   		
		arr = temp;
		temp = null; 
	}
		
	
	//배열의 맨 앞 요소부터 삭제되도록 처리.
	static int pop() {
		if(arr.length>0) {
			int del = arr[arr.length-1];
			int[] temp = new int[arr.length-1];
			for(int i = 0; i <temp.length; i++) {
				temp[i] = arr[i+1];
			}
			arr = temp;
			temp = null;
			return del;
		}
		
		return 0;
	}
}
