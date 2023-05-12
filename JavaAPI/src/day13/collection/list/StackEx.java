package day13.collection.list;

import java.util.List;
import java.util.Stack;

public class StackEx {
	public static void main(String[] args) {
		/*
		 * stack
		 * Last in First Out(후입선출
		 * push(),pop()
		 */
		Stack<String> stack = new Stack<>();
		stack.push("홍길동");
		stack.push("이순신");
		stack.push("홍길자");
		String n=stack.pop();  //빠진값 출력
		
		//형태를 문자열로 확인
		System.out.println(stack.toString());
		System.out.println(n);
	}

}
