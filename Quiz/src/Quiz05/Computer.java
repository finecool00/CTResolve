package Quiz05;

public class Computer extends Calculator {//자식
	double PI;
	double rect(double a) {
		
		return a*a;
	}
	double rect(double a,double b) {
		
		return a*b;
	}
	double rect(double a, double b, double c) {
		
		return a*b*c;
	}
	double circle(int a) {
		
		return a*a*Math.PI;
	}
	
	
}
