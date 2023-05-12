package Quiz13;

public class MainClass {
	public static void main(String[] args) {
		
		Circle c = new Circle("원", 3);
		System.out.println(c.getArea());
		System.out.println(c.getName());
		
		Rect r = new Rect("정사각형",4);
		System.out.println(r.getArea());
		System.out.println(r.getName());
	}

}
