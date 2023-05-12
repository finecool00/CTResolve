package day09.poly.basic;

public class MainClass {
	public static void main(String[] args) {
		Child c = new Child();
		c.method01();//상속받음
		c.method02();//오버라이드 된
		c.method03();// 자기 꺼
		
		System.out.println("=========다형성 적용(형변환)=======");
		//Parent처럼 사용됩니다. 단, 자식의 오버라이드 된 메서드가 실행됩니다.
		Parent p = c;
		p.method01();
		p.method02(); //자식의 오버라이드  오버라이드된 것이 무조건 먼저 실행
//		p.method03(); 안댐 x
		
		System.out.println(p); //parent 타입
		System.out.println(c); // child 타입
		System.out.println(p == c); // child로 생성된 자식ㄷ은 원래의 객체를 유지함
		
		System.out.println("클래스 강제 형변환");
		//원본이 child로 생성되었다면, 강제 형변환이 가능합니다.
		
		Parent pp = new Child();
		System.out.println(pp); //child원본
		
		Child cc = (Child)pp;  //강제 형변환
		
		//주의 할점 >> 다형성이 적용되었던 객체만 강제형변환이 가능함
		Object obj = new Object();
//		Child ccc = (Child)obj; //runtime excemtion
		
		System.out.println("다형성의 또다른 예시");
		
		String str = "홍길동";
		Object o =str;
		String result = (String)o;
	
		
	}

}
