package Quiz19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListQuiz02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<User> list = new ArrayList<>();  //배열 대체
		
		x:while(true) {
			System.out.println("[1.등록 | 2.회원정보 | 3.회원정보검색 | 4.회원정보삭제 | 5.프로그램종료");
			System.out.println("메뉴(번호)>");
			int menu = scan.nextInt();
						
			switch (menu) {
			case 1:
				//이름, 나이를 입력받아서 user객체에 저장, 리스트에 순서대로 추가
				String name = scan.next();
				int age = scan.nextInt();
				User u = new User(name, age);
				list.add(u);
				break;
			case 2:
				//리스트에 담긴 모든 회원 이름,나이를 출력
				System.out.println(list.toString());
				break;
			case 3:
				//찾을 이름을 새롭게 입력받아서, 이름이 있다면 이름과 나이출력
				//찾는 이름이 없다면 "~~~는 목록에 없습니다" 출력
				String name1 = scan.next();
				int count = 0;
				for(int i =0; i<list.size(); i++) {
					User u1 = list.get(i);
					String name2 = u1.getName();
					if(name2.equals(name1)) {
						count++;
						System.out.println(u1.getName());
						System.out.println(u1.getAge());							
					}else if(count ==0) {
						System.out.println(name1+"은 목록에없습니다");
						continue x;
					}					
				}
				break;
			case 4:
				//삭제할 이름을 입력받아서, 이름과 동일한 User객체 첫번째 1개만 삭제
				String name5 = scan.next();
				int count1 =0;
				for(int i = 0; i<list.size(); i++) {
					User u2 = list.get(i);
					String name3 = u2.getName();
					if(name3.equals(name5)) {
						count1++;
						list.remove(i);
					}else if(count1 ==0){
						System.out.println(name5+"은 목록에 없는 사람이라 삭제불가");
						continue x;
					}
				}
				break;
			case 5:
				System.out.println("프로그램종료");
				System.exit(0);
				break;

			default:
				break;
			}
		}
	}

}
