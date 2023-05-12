package programous;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {		
	        Scanner scan = new Scanner(System.in);
	        String a = scan.next();
	        char[] arr ;
	        arr = a.toCharArray();
	        for(int i = 0; i<arr.length; i++ ) {
	        	if(arr[i]>=65 && arr[i]<=90 ) {
	        		arr[i] = (char)(arr[i]+32);
	        		continue;
	        	}else if(arr[i]>=97 && arr[i]<=122) {
	        		arr[i] = (char)(arr[i]-32);
	        		continue;
	        	}
	        }System.out.println(arr);
        }
	}


