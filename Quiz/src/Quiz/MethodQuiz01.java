package Quiz;

import java.util.Arrays;
import java.util.Scanner;

public class MethodQuiz01 {
	public static void main(String[] args) {
		// 
		String result=java(5);		
		System.out.println(result);
	}
	static void method1() {
		System.out.println("안녕");
	}
	static String method2(String s) {
		
		return s;
	}
	static double method3(int a, int b, double c) {
		System.out.println(a + b +c);
		return (a+b+c);
	}
	static String method4(int a) {
		String str = "";
		if(a%2 ==0) {
			str ="짝수";
		}else {
			str ="홀수";
		}
		return str;
		
	}
	static void method5(String a, int b) {
		String sum = "";
		for(int i = 1; i<=b; i++) {
			sum +=a;
			
		}System.out.println(sum);
	}
	static int maxNum(int a, int b) {
		if(a<b) {
			return b;
		}else  {
			return a;
		}
		
	}
	static int abs(int a) {
		if(a<0) {
			System.out.println(-a);
		}else if(a>0) {
			System.out.println(a);
		}
		return a;
	}
	static String method6(char[] c ) {
		String sum = "";
		for(char i ='A'; i<='Z'; i++) {
			sum +=i;
		}
		return sum;
	}
	static int method7(int a,int b) {
		return a+b;
	}
	static String method8(String a, String b) {
		String[] arr = new String[] {a,b};
						
		return Arrays.toString(arr);
	}
	
	
	static String java(int a) {
		String str ="";
		for(int i =1; i<=a; i++) {
			if(i%2==1) {
				str +="자";
			}else {
				str +="바" ;
			}
		}
		return str;
		}
	}




