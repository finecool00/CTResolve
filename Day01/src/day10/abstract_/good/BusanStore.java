package day10.abstract_.good;

public class BusanStore extends Store {

	@Override
	public void apple() {		
		System.out.println("부산 지점 사과 400원");
	}
	@Override
	public void grape() {		
		System.out.println("부산지점 포도 100원");
	}
	@Override
	public void melon() {		
		System.out.println("부산 지점 멜론 200원");
	}
	@Override
	public void orange() {	
		System.out.println("부산 지점 오렌지 300원");
	}
}
