package day04;

import java.util.Arrays;

public class StringManipulation {
	
	public static void main(String[] args) {
		//문자열 다루기
		//문자열은 사실 배열입니다. 문자열은 인덱스가 있습니다.
		String str = "안녕하세요~영어로하면 하이!";
//		System.out.println(str[0]);   자바에선안됨
		//문자열을 다루는 다양한 메서드를 제공
		
		//문자열을 한글자 자르기  .charAt();
		char c = str.charAt(5);  //매개변수가 정수  :뒤에는 메서드의 반환
		System.out.println(c);
		
		//문자열의 위치확인 indexOf, lastIndexOf(뒤에서부터 찾아줌)
		int idx = str.indexOf("안");
		System.out.println("안 의 index위치:" +idx); //찾고자하는 문자가 없으면 -1출력
		int idx2 = str.lastIndexOf("하");
		System.out.println("안 의 index위치:" + idx2);
		
		//문자열 변환 toUperCase(대문자로 바꾸기), toLowerCase(소문자로바꾸기)   
		String s = "abcDEF";
		String result = s.toUpperCase();
		System.out.println(result); //대문자로 보이게 출력
		System.out.println(s); //****원본문자열은 그대로 유지****
		String result2 = s.toLowerCase();
		System.out.println(result2); //소문자로 보이게 출력
		
		System.out.println("===============================================");
		//문자열 변경 replace
		s = "abcdefaaa";
		String result3 = s.replace("a", "x");  
		System.out.println(result3);  //a 를 x로 전부다 변경
		;
		System.out.println(s); // 원본 문자열은 절대 변하지 않는다
		String result4= s.replaceFirst("a", "x");
		System.out.println(result4); //첫번째 a만 x로변경
		String result5 = s.replaceFirst("x", "i");
		System.out.println(result5);
		System.out.println("===========================");
		//공백제거 trim
		str = "  010-1111-2222  ";
		System.out.println(str);
		String result6 = str.trim(); //앞뒤 공백을 제거해서 반환
		System.out.println(result6);
		str = " 안녕 하세요? 오늘은 4월 19일 입니다";
		System.out.println(str);
		str = str.replace(" ",""); //공백을 전부 제거하고 원본문자열에 저장 
		System.out.println(str);
		System.out.println("=====================================");
		//문자열 자르기 //중요함
		//특정 위치에서 자르기 substring   - index 기준으로 자름
		str = "010-1111-2222";
		String result7 = str.substring(9); //인덱스 ?번째 미만삭제
		System.out.println(result7);
		
		String result8 = str.substring(4,8); //4<= x <8 인덱스 추출
		System.out.println(result8);
		System.out.println(str);
		
		//split() - 특정 문자를 기준으로 자름 (제대로 사용하려면 정규표현식을 알아야함)
		String[] arr = str.split("-");
		System.out.println(Arrays.toString(arr));
		String[] arr2 = str.split("");
		System.out.println(Arrays.toString(arr2));
		
		//toCharArray - 한글자씩 char형으로 자름
		char[] arr3 = str.toCharArray();
		System.out.println("1" +Arrays.toString(arr3));
		
		System.out.println("=============================");
		//문자열의 길이
		str = "안녕하세요";
		int len = str.length();
		System.out.println(len);
		
		//문자열의 비교 = equals()  무조건 외우기@@@@@@@@@@@@@
		if(str.equals("안녕하세요")) {
			System.out.println("두 문자가 같습니다");
		}else {
			System.out.println("두 문자가 같지 않습니다");
		}
		
		//문자열의 포함여부 contains()
		if(str.contains("녕")) {
			System.out.println("녕이 포함되어 있음");
		}else {
			System.out.println("녕이 포함되어 있지않음");
		}
		
		
		}

}
