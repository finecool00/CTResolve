package day12.api.lang.sb;

public class StringBuilderEx {
	public static void main(String[] args) {
//		StringBuffer -단일 스레드환경에서
		//StringBuffer-멀티스레드환경에서
		
		String str = new String("Java ");
		StringBuilder sb = new StringBuilder("Java ");
		
		//차이점
		str = str + "program";
		sb.append("program");				
		
		System.out.println(str);
		System.out.println(sb);
		
		//빌더의 메서드
		//append() - 문자열 끝에 추가
		sb.append("ming");
		System.out.println(sb);
		
		//insert - 중간에 추가
		sb.insert(4, " study");
		System.out.println(sb);
		
		//replace
		sb.replace(5, 10, "book"); //x이상y미만 변경
		System.out.println(sb);
		
		//delete - 삭제
		sb.delete(5,10);//x이상y미만 문자열 삭제
		System.out.println(sb);
		
		//reverse - 거꾸로
		sb.reverse();
		System.out.println(sb);
		
		//toString() - 문자열로 형변환
		String result=sb.toString();
		System.out.println(result);
		
		
 	}

}
