package JDBC.DEMO.mvc;

import java.util.List;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		DeptsDAO deptDAO = new DeptsDAO();
			
		
		
		
		while(true) {
			System.out.println("[1.조회, 2.추가, 3.수정, 4.종료]");
			System.out.println("메뉴>");
			
			int menu = scan.nextInt();
			
			if(menu == 1) {
				//부서명으로 조회
				List<DeptsVO> list = deptDAO.getDepts("홍길자부서");
				
				System.out.println(list.toString());
			}else if(menu == 2) {
				//부서명 입력
				System.out.println("부서명>");
				String department_name = scan.next();
				System.out.println("매니저아이디");
				int manager_id = scan.nextInt();
				System.out.println("로케이션아이디");
				int location_id = scan.nextInt();
				
				
				DeptsVO vo = new DeptsVO(0,department_name,manager_id,location_id);
				
				int result = deptDAO.insertDepts(vo);
				System.out.println("성공실패:" + result);
			}else if(menu == 3) {
				
			}else if(menu == 4) {
				
			}
		}
	}

}
