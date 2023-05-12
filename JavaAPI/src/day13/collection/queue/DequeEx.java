package day13.collection.queue;

import java.util.ArrayDeque;

public class DequeEx {
	public static void main(String[] args) {
		ArrayDeque<Integer> que = new ArrayDeque<>();
		que.offerLast(1);
		que.offerLast(2);
		que.offerLast(3);
		que.offerLast(4);
		int n = que.pollFirst(); //앞에서 꺼내기
		que.pollFirst();
		que.pollFirst();
		que.pollFirst();
		System.out.println("반환된 수:" + n);
		System.out.println(que.toString());
		
		System.out.println("-------------------------------------------");
		//앞에서 추가하기
		que.offerFirst(1);
		que.offerFirst(2);
		que.offerFirst(3);
		que.offerFirst(4);
		int m = que.pollLast(); //뒤에서 뺴기
		System.out.println("반환된 수:"+m);
		System.out.println(que.toString());
		
		//[4,3,2]
		//앞에서 또는 뒤에서 값을 확인함
		int x = que.peekFirst();
		System.out.println(x);
	}

}
