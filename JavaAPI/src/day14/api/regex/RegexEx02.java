package day14.api.regex;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx02 {
	public static void main(String[] args) {
		/*
		 * [0-9]{2,4} 숫자중 2개이상4개이하가 연속된 형태
		 * [0-9]{3}  0~9의숫자가 3개가연속으로 나오는형태
		 * [A-Z]+ 대문자A~Z중에 한개이상인형태
		 * [a-zA-Z]? 알파벳이 0~1개나오는형태
		 * [가-힣]*  한글이 0회이상인 형태
		 * 정규표현식에 속하지 않는 문자는 그냥 사용할 수 있습니다.
		 * [0-9]{3}-[0-9]{4}  숫자3개-숫자4개 나오는형태
		 * 정규표현식에 포함되는 문자를 쓰고 싶다면
		 * \\+    \가 한개이상 나오는 경우
		 * \?+    ?가 한개 이상
		 * 정확히 일치하는 문자
		 * \?.  정확히 ?에 일치하는
		 * [0-9]{3}원   000원 형식을 찾음
		 * 
		 * \\d [0-9]와 같은 의미
		 * \\w [a-zA-Z_]와 같은 의미
		 * \\s 공백을 나타냄
		 */
		
		String info = "홍길동/주소/02-123-4567/aaa@naver.com";
		String info2 = "이순신/주소/010-1234-5678/bbb@naver.com";
		//전화번호 형식
		String pattern = "[0-9]{2,3}-[0-9]{3,4}-[0-9]{4}";
		
		//이메일 형식
		String pattern2 = "[a-zA-Z0-9]+@[a-z]+.com";
		//패턴컴파일
		Pattern p = Pattern.compile(pattern);
		Pattern p2 = Pattern.compile(pattern2);
		//찾는 작업
		Matcher m = p.matcher(info);
		Matcher m2 = p2.matcher(info2);
		//find() - 일치하는 부분이 있다면 true
		//start() - 일치하는 부분의 첫번째 인덱스
		//end() - 일치하는 부분의 마지막 인덱스
		//group() - 일치하는 부분의 추출
		while(m.find()) { //패턴이 여러번 나오면 순서대로 찾습니다.
			System.out.println("첫번째 인덱스:" + m.start());
			System.out.println("마지막 인덱스:" + m.end());
			System.out.println(m.group());
		}
		
		if(m2.find()) { //패턴을 가장처음 발견되는 1번 찾습니다.
			System.out.println("첫번째 인덱스:" + m2.start());
			System.out.println("마지막 인덱스:" + m2.end());
			System.out.println(m2.group());
		}
		System.out.println("==============================================================================");
		//리스트 안에 요소들에서 순서대로 값을 찾는 형태
		List<String> list = Arrays.asList(info,info2);
		System.out.println(list.toString());
		
		
		for(int i = 0; i<list.size(); i++) {
			String str = list.get(i);
			//패턴생성
//			Pattern x = Pattern.compile(pattern);
//			Matcher y = x.matcher(str);
			Matcher x =Pattern.compile(pattern).matcher(str);
			Matcher y =Pattern.compile(pattern2).matcher(str);
			if(x.find()&&y.find()) {
				System.out.println(x.group());
				System.out.println(y.group());
			}
		}
	}

}