package day12.api.lang.object;

import java.io.PrintStream;

public class MainClass {
	public static void main(String[] args) {
		Person p = new Person("홍길동");
		
		Person p2 = new Person("홍길동");
		//객체의 name 변수가 같다면 treu반환 하도록 오버라이딩
		boolean result = p.equals(p2);
		System.out.println(result);
		//toString -주소값을 문자열로 출력
		//toString메서드는 멤버변수 값을 출력하도록 오버라이딩 많이 사용됩니다.
		System.out.println(p.toString());
		//새로운 person객체를 복제해서 ㅅ반환
		try {
			Person clone = (Person)p.clone();
			System.out.println(clone.getName());
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		//객체의 주소를 해시알고르짐을 통해 변경한 값을 반환
		int x = p.hashCode();
		System.out.println(x);
		
		
//		PrintStream ps = System.out;
//		ps.println("출력..");
		
	}
	

}
