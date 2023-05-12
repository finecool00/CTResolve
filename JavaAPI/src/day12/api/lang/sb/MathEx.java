package day12.api.lang.sb;

public class MathEx {
	public static void main(String[] args) {
		int r =(int)(Math.random()*10)+1;
		System.out.println(r);
		
		double d = Math.abs(-3.14); //절댓값
		System.out.println(d);
		
		double d1 = Math.ceil(3.14); //올림 math.ceil
		System.out.println(d1);
		
		double d2 = Math.floor(3.14); //내림  math.floor
		System.out.println(d2);
		
		double d3 = Math.round(3.5); //반올림 math.round
		System.out.println(d3);
		
		double d4 = Math.max(3.14, 3.16); //비교해서 큰수반환 math.max
		System.out.println(d4);
		
		
	}

}
