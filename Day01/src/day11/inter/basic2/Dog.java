package day11.inter.basic2;

public class Dog extends Animal implements Pet{

	@Override
	public void eat() {
		System.out.println("개는 사료를 먹어요");
		
	}

	@Override
	public void play() {
		System.out.println("개는 나랑 놀아요");
		
	}

}
