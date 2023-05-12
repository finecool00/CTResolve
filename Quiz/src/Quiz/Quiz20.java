package Quiz;

public class Quiz20 {
	
	public static void main(String[] args) {
		
		//배열 요소들 중에서 짝수인 값들의 합
		int[] arr = {54, 32, 3, 5, 7, 14, 20};
		int a = 0;
		int sum = 0;
		while(a < arr.length) {
			if(arr[a]%2==0) {
				sum +=arr[a]; 
			}
			a++;
				
		} 
		System.out.println(sum);
			
		
	}

}
