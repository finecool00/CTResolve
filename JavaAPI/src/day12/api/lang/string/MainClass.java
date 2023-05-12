package day12.api.lang.string;

import java.util.Arrays;

public class MainClass {
	public static void main(String[] args) {
		
		char[] arr = {'a','b','c'};
		String s = new String(arr);
		System.out.println(s);
		
		String str = "안녕하세요~";
		System.out.println(str);
		
		char c = str.charAt(2);//한글자씩 자르기
		System.out.println(c);
		
		 int a = str.indexOf("안녕"); //인덱스위치찾기
		 System.out.println(a);
		 
		 System.out.println(str.contains("안")); //true or false
		 
		 System.out.println(str.length()); //문자열 길이
		 
		 str = "자바의 기원은, 자바칩프라페치노 커피집에서 시작되었습니다.";
		 System.out.println(str.replace("안", "근")); //문자열 변경
		 System.out.println(str.replace("자바", "java"));
		 
		 System.out.println(str.replaceFirst("자", "ja")); //문자열 변경 중복으로되는단어가 있다면 첫번째 단어만
		 
		 System.out.println(str.substring(5)); //x미만 자르기
		 System.out.println(str.substring(9, 17)); //x이상y미만까지만 나오게 자르기
		 
		 System.out.println(Arrays.toString(str.split(" "))); //특정 문자에서마다 자르기
		 
		 System.out.println(Arrays.toString(str.split(" ", 3))); //최대배열의 길이는x,여유가없다면 자르지않음
		 
		 char[] arr1 = str.toCharArray(); //한글자식 자르기
		 System.out.println(Arrays.toString(arr1));
		 
		 str = "홍길동";
		 System.out.println(str.equals("홍길동"));
		 
		 System.out.println(str.compareTo("홍길동")); //0 = 같은문자
		 System.out.println(str.compareTo("홍길자"));// 음수 = str이 홍길자 보다 사전동재순 앞에 위치함
		 System.out.println(str.compareTo("홍길가"));// 양수- str이 홍길가 보다 사전등재순 뒤에 위치함
		 
		 //특정 ㅁ구분자로 문자열을 연결
		 System.out.println(String.join("-", "hello", "world", "안녕","하세요")); 
		 
		 //기본타입을 문자열로 변경
		 System.out.println(String.valueOf(1) + String.valueOf(2));
		 System.out.println("" +1+2);
	}

}
