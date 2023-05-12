package Quiz11;

public class MainClass {
	public static void main(String[] args) {
		
		KeyBoard key = new KeyBoard();
		Mouse mouse = new Mouse();
		Monitor monitor = new Monitor();
		
		
		Computer c = new Computer();
		c.computerInfo();
		
		System.out.println(c.getMonitor());
		
	}

}
