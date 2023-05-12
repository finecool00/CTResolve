package day07.override01;

public class MainClass {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.method01(); 
		p.method02();
		
		Child c = new Child(); 
			c.method01();
			c.method02(); //오버라이드 된 메서드는 상속받은게 있더라도 먼저 실행됨
		
	}

}
