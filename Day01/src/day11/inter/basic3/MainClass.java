package day11.inter.basic3;

public class MainClass {
	public static void main(String[] args) {
		Printed pt = new LG(); // new Sausung();
		pt.print("hello world");
		pt.colorPrint("hello world", "파란색");
		int result = pt.copy(5);
	}

}
