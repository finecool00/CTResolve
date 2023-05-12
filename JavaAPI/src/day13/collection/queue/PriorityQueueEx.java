package day13.collection.queue;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {
	public static void main(String[] args) {
		PriorityQueue<Integer> que = new PriorityQueue<>();
		que.offer(4);
		que.offer(3);
		que.offer(1);
		que.offer(5);
		que.offer(6);
		System.out.println(que.toString());
		
		System.out.println(que.poll()); //가장 낮은 값을 먼저 꺼내기
		System.out.println(que.poll());
		System.out.println(que.poll());
		System.out.println(que.poll());
		System.out.println(que.poll());
		
		System.out.println(que.toString());
		
		System.out.println("=======================================");
		
		//User객체를 담을 수 있는 큐
		//que가 순서를 확인할 때 compareTo메서드를 확인합니다
		//compareTo에 정의된 순서에 의해서 우선순위를 정합니다
		//객체가 우선순위를 가지게 하려면
		//compareable인터페이스를 상속받아서 compareTo메서드를 오버라이딩 해서 가지면 됩니다
		
		//우선순위 지정
		System.out.println("홍길동".compareTo("홍길자"));  //홍길동이 사전적으로 앞에 위치하면 음수출력
		System.out.println("홍길자".compareTo("홍길동"));  //홍길동이 사전적으로 앞에 위치하면 양수출력
		PriorityQueue<User> que1 = new PriorityQueue<>();
		que1.offer(new User("홍길동",10));
		que1.offer(new User("홍길자",20));
		que1.offer(new User("홍길순",30));
		que1.offer(new User("신사임당",40));
		que1.comparator();
		
		System.out.println(que1.toString());
		System.out.println(que1.poll().getName());
		System.out.println(que1.poll().getName());
		System.out.println(que1.poll().getName());
		System.out.println(que1.poll().getName());
		
	}

}
