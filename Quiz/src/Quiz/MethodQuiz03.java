package Quiz;

import java.util.Arrays;

//import java.util.Arrays;

public class MethodQuiz03 {
	
	public static void main(String[] args) {
		
		char[] arr = {'a','b','c'};
		 String result = method6(arr);
		 System.out.println("1"+result);
		int[] arr2 = {1,2,3,4,5};
		int result2 = method7(arr2);
		System.out.println(result2);
		//method8
		String[] arr3 = method8("가","나");
		System.out.println(Arrays.toString(arr3));
	}
	static String method6(char[] arr) {
		String sum = "";
		for(int i = 0; i<arr.length; i++) {
			sum = sum + arr[i];
		
		}
			return sum;
	}
	static int method7(int[] arr) {
		int sum = 0;		
		for(int a : arr) {
			sum += a;
			
		}
		return sum;
	}
	static String[] method8(String a, String b) {
		String[] arr = {a,b};
		return arr;
	}
}
