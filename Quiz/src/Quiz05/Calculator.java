package Quiz05;

public class Calculator  { //부모
	int result;
	double pi =3.14;
	
	void add(int a) {		
		
		result+=a;
		System.out.println(result);
	}
	void sub(int a) {
		
		result-=a;
		System.out.println(result);
	}
	double circle(int a) {
		
		pi= a*a*pi;
		
		return pi;
	}
}
