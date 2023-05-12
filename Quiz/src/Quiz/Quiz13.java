package Quiz;

public class Quiz13 {
	
	public static void main(String[] args) {
		
		//1000까지 정수 중에서 4의 배수이면서, 8의 배수가 아닌 수의 count(갯수)
		
		int a = 1;
		int count = 0;
		while(a<=1000) {
			if(a % 4 ==0 && a % 8 != 0) {
				count++;
				
			}a++;
		}System.out.println(count);
	}

}
