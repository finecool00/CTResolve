package day07.overload;

public class MainClass {
	public static void main(String[] args) {
		Basic b = new Basic();
		b.input(1);
		b.input("s");
		b.input(10.0,10);
		b.input(10, 10.0);
		b.input(10,'z', 10.0);				
	}

}
