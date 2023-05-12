package Quiz19;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetQuiz01 {
	public static void main(String[] args) {
		/*
		 * 중복되지 않는 6자리 수 (로도번호)
		 * 
		 * 1.random객체를 이용해서 1~45까지 랜덤한 수를 생성
		 * 2.set에 6개의 랜덤한 로또 번호를 저장해주세요.
		 */
		Set<Integer> set = new HashSet<>();
		Random r = new Random();
		
		
		while(set.size()<6) {
			set.add((int)(Math.random()*45)+1);
			
		}System.out.println(set.toString());
		
		
		
	}

}
