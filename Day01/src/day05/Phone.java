package day05;

public class Phone {
	String model;
	String color;
	int price;
	//생성자를 직접 생성하게되면 , JVM이 생성자를 자동생성하지 않습니다 //직접만들어주는게 좋음
	//생성자는 반환유형이 없습니다.
	//역활 - 멤버변수를 초기화하는 용도로 보통 사용됨 
	Phone() {
		System.out.println("생성자 호출!");
		model = "갤럭시";
		color = "검정색";
		price = 100000;
	}
	//생성자는 여러개 선언할 수 있습니다
	//단, 매개변수의 종류 or 개수가 달라야 합니다
	Phone(String a) {
		model = a;
		color = "핑크색";
		price = 200000;
	}
	Phone(String a, String b) {
		model = a;
		color = b;
		price = 300000;
	}
	Phone(String a, int b) {
		model = a;
		color = "화이트색";
		price = b;
	}
	Phone(String a, String b,int c) {
		model = a;
		color = b;
		price = c;
	}
	
	void info() {
		System.out.println("====폰의 정보====");
		System.out.println("모델:" + model);
		System.out.println("색상:" + color);
		System.out.println("가격:" + price);
	}
}
