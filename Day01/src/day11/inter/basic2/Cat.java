package day11.inter.basic2;

public class Cat extends Animal implements Pet{

	@Override
	public void eat() {
		System.out.println("고양이는 생선을 좋아해");
		
	}

	@Override
	public void play() {
		System.out.println("고양이는 쥐랑 놀아요");
		
	}

}
