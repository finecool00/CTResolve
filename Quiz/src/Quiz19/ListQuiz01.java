package Quiz19;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListQuiz01 {
	public static void main(String[] args) {
		/*
		 * 1.list에 1~20까지 값을 순서대로 저장
		 * 2.list에 값을 순서대로 출력
		 */
		List<Integer> list = new ArrayList<>();
		for(int i = 1; i<=20; i++) {
			list.add(i);
		}System.out.println(list.toString());
		/*
		 * List 2번
		 * 1.User 저장하는 list생성
		 * 2.3개의 각각 다른 User객체를 만들고 순서대로 저장
		 * 3.User객체 안에 홍길동 이 있으면 해당 객체의 name, age 출력
		 * 4.User객체 안에 홍길자 가 있으면 해당 객체를 삭제
		 */
		List<User> list2 = new ArrayList<>();

		User user = new User("홍길동",30);
		User user1 = new User("홍길자",20);
		User user2 = new User("신사임당",10);
		list2.add(user);
		list2.add(user1);
		list2.add(user2);
		
		for(int i = 0; i<list2.size(); i++) {
			User u = list2.get(i);
			String name = u.getName();
			if(name.equals("홍길동")) {
				System.out.println(u.getName());
				System.out.println(u.getAge());
			}
			

		}
		
		for(int i = 0; i<list2.size(); i++) {
			User u = list2.get(i);
			if(u.getName().equals("홍길자")) {
				list2.remove(i);
			}
		}System.out.println(list2.toString());
	}
}



