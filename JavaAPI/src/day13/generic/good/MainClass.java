package day13.generic.good;

import java.util.Arrays;

import day13.generic.bad.Person;

public class MainClass {
	public static void main(String[] args) {
//		ABC abc = new ABC();
		
		ABC<String> abc = new ABC<String>();
		abc.setT("홍길동");
		System.out.println(abc.getT());
		
		ABC<Person> abc1 = new ABC<>(); //생성자 꺽쇠는 생략가능
		abc1.setT(new Person());
		Person p = abc1.getT();
		
		ABC<Object> abc2 = new ABC<Object>();
		abc2.setT(new Object());
		Object o = abc2.getT();
		
		//제너릭타입은 원시타입x
		//ㅑinteger로 사용해야 합니다
//		ABC<int> abc4 = new ABC<int>();
		ABC<Integer> abc4 = new ABC<Integer>();
		
		//////////////////////////////////////////////
		DEF<Integer, String> def = new DEF<>();
		def.setKey(3);
	}

}
