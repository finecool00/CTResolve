package Quiz;

import java.util.Scanner;

public class Main2 {
		public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);			
			int a = 1;
				while(a<=6) {
					int x = scan.nextInt();
					int y = scan.nextInt();
					System.out.println(x+y);
					a++;
					if(a >5) {												
						System.out.println();
					}
				}scan.close();
		}
}
			
			
			
			
		
	
	


