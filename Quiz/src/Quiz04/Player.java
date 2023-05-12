package Quiz04;

public class Player {
	String name;
	int hp;
	int mp;
	
	Player(){	
		
	}
	void info() {
		System.out.println("케릭명:" + name);
		System.out.println("hp:" + hp);
		System.out.println("mp:" + mp);
	}
	void Warrior() {
		name = "★";
		hp = 100;
		mp = 50;
		System.out.println("이름:" + name);
		System.out.println("hp: " + hp);
		System.out.println("mp:" + mp);
	}
	void bash() {
		if(mp-10>=0 ) {
			mp -=10;
			System.out.println("bash를 사용합니다");
			System.out.println("현재mp:"+mp);			
		}else {
			System.out.println("mp가 부족합니다");
		}
	}
	void Wizzard() {
		name = "★";
		hp = 50;
		mp = 100;
		System.out.println("이름:" + name);
		System.out.println("hp:" + hp);
		System.out.println("mp:" + mp);
	}
	void iceArrow() {
		if(mp-20>=0) {
			mp -=20;
			System.out.println("iceArrow를 사용합니다");
			System.out.println("현재mp:" + mp);
		}else {
			System.out.println("mp가 부족합니다");
		}
	}
}
