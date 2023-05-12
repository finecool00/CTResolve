package Quiz18;

import java.util.Scanner;

public class StringQuiz01 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		while(true) {			
			String id = scan.nextLine();
			id=id.replace(" ", "");
			if(id.length()<5) {
				System.out.println("아이디 글자수가 5미만입니다 다시 입력하세요");
				continue;
			}else {
				System.out.println("아이디가 등록되었습니다.");
				break;
			}
		}
	}
}
/*
 * 스캐너를 사용해서 id를 입력받습니다
 * id는 공백을 포함해서 받을 수 잇습니다 nextLine();
 * 
 * 단, 공백을 제거한 아이디가 5글자 미만이면 다시 입력받습니다.
 * 5글자 이상이라면 "아이디가 등록되엇습니다"출력후 종료
 */

