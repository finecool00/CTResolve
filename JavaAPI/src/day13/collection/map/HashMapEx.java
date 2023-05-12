package day13.collection.map;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {
	public static void main(String[] args) {
		//Map인터페이스를 구현하는 클래스 hashmap		
		//key에대한 타입과 value에 대한 타입을 지정
		//탐색이 빠릅니다.
		Map<Integer, String> map = new HashMap<>();
		//map에 값을 저장하려면 put(키,값)
		map.put(1, "홍길동");
		map.put(2, "이순신");
		map.put(3, "홍길자");
		map.put(4, "홍길동");
		map.put(5, "신사임당");
		System.out.println(map.toString());
		//동일한 키를 저장하면?
		System.out.println(map.put(4, "강감찬")); //키값이 같으면 나중에 넣은값으로 덮어씌움
		System.out.println(map.toString());
		
		System.out.println(map.get(3));
		//key의 유무확인 containsKey
		if(map.containsKey(3)) {
			System.out.println("3번키가 존재함");
		}
		//map의 삭제 remove(키)
		map.remove(4);
		System.out.println(map.toString());
		
		//맵의 순회
		//방법 1
		Set<Entry<Integer, String>> set=map.entrySet();  //맵을 => set으로 변경
		for(Entry<Integer, String> set1:set) {
			System.out.println(set1.getKey());
			System.out.println(set1.getValue());
		}
		System.out.println("================================");
		//방법 2
		Set<Integer> set2 = map.keySet();
		System.out.println(set2.toString());
		
		for(int key:set2) {
			System.out.println(key);
			System.out.println(map.get(key));
		}
		System.out.println("=============================");
		//map에 객체를 담는 모형
//		Map<Integer, Object> map2 = new HashMap<>();
		Map<Integer, Object> map2 = new HashMap<>();
		
		
	}

}
