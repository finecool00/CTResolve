package day10.static_.basic;

public class MainClass {
	public static void main(String[] args) {
		//클래스가 여러번 로드 되더라도 static은 단 1번만 실행됨
		System.out.println(Init.price);
		System.out.println(Init.price);
		System.out.println(Init.price);
		System.out.println(Init.price);
	}

}
