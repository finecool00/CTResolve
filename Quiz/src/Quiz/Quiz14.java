package Quiz;

public class Quiz14 {
	
	public static void main(String[] args) {
		
		//50~100까지의 합
		
		int a =1;
		int sum = 0;
		while(a<=100) {
			if(a>=50) {
				sum +=a;
			}a++;
		}System.out.println("50~100까지의합:" +sum);
	}

}
