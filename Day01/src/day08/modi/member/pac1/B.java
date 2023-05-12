package day08.modi.member.pac1;

public class B {
	A a = new A(); //public
	A a2 = new A(1);//default
//	A a3 = new A("홍길동");//private x
	
	public B() {
		a.var1 = 1;
		a.var2 = 2;
//		a.var3 = 3; //private라 접근불가
		
		a.method1();
		a.method2();
//		a.method3(); //private
	}
}
