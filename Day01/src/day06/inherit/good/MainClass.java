package day06.inherit.good;

public class MainClass {
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "홍길동";
		s.age = 20;
		s.studentId = "123123";
		System.out.println(s.info());
		
		Teacher t = new Teacher();
		t.age =21;
		t.name ="길동홍";	
		
	}

}
