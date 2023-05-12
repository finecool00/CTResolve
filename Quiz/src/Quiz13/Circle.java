package Quiz13;

public  class Circle extends Shape{
	private String name;
	private int radius; 
	
	public Circle(String name, int radius) {
		super(name);
		this.radius=radius;
	}		
	/*
	 * 원은 radius변수를 가집니다.
	 * 원은 생성될 때 이름과, side를 받을 수 있도록 생성
	 * getArea() = 원의 너비를 구하도록 오버라이딩
	 */
	
	@Override
	public double getArea() {
		double b = radius*radius*pi;
		return b;
	}
	
}
