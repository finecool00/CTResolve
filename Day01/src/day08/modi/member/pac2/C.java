package day08.modi.member.pac2;

import day08.modi.member.pac1.A;

public class C {
	A a = new A(); //public
//	A a2 = new A(1);//default X
//	A a3 = new A("홍길동");//private X
	public C() {
		a.var1 = 1;
//		a.var2 = 2; //default라 같은패키지가아니라 접근불가
//		a.var3 = 3; //private라 접근불가
		
		a.method1();
//		a.method2(); //default
//		a.method3(); //private
	}
}
