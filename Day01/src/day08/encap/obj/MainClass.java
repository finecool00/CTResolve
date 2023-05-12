package day08.encap.obj;

public class MainClass {
	public static void main(String[] args) {
		Hotel h = new Hotel();
//		Chef c = h.getChef(); //Hotel안에 있는 Chef를 꺼냄
//		c.cooking();
		
//		Chef chef = new Chef();
		h.setChef(new Chef());
		
		Chef c = h.getChef();
		c.cooking();
	}

}
