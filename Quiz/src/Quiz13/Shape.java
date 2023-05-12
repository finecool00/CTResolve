package Quiz13;

public abstract class Shape {
	
	public static final double pi=3.14;
	private String name;
	
	public Shape(String name) {
		this.name=name;
	}
	//오버라이딩이 필요함
	public abstract double getArea();
	
	//name의 게터
	public String getName() {
		return "도형이름:" + name;
	}
}
