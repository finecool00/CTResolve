package day13.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		set.add("java");
		set.add("database");
		set.add("spring");
		set.add("jsp");
		set.add("python");
		set.add("java");
		System.out.println(set.toString()); //이름이 같은것은 중복으로 입력되지않는다.
		//크기
		System.out.println(set.size());
		//삭제( 삭제하고 싶은 값을 입력해줘야함)
		set.remove("python");
		System.out.println(set.toString());
		//순회 =>내부적으로 반복자(iterator)의 개념을 사용해서 회전
		for(String s : set) {
			System.out.println(s);
		}
		System.out.println("=====================");
		//set => iterator 타입으로 변경
		Iterator<String> iter= set.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
