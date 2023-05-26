package JDBC.DEMO;

import java.security.Timestamp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;




public class DemoSelect01 {
	public static void main(String[] args) {
		//데이터베이스 연결정보
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid = "HR";
		String upw = "HR";
		String sql = "SELECT * FROM EMPLOYEES WHERE SALARY > ?";
		//모든 데이터베이스 연결은 try~catch문장 안에서 작성이 되야합니다.
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			//1.드라이버클래스 준비
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2.커넥션 객체 생성
			conn = DriverManager.getConnection(url,uid,upw);
			//3.커넥션 객체에서 state객체 생성
			pstmt = conn.prepareStatement(sql);
			//3-2. sql문에 전달할 값이 있다면 ?로 처리하고 순서대로 1번부터 시작합니다
			//?에 전달될 값은 set 메서드를 이용해서 채웁니다
			//setString, setInt, setDouble, setDate, setTimestamt
			pstmt.setInt(1,5000); //첫번쨰 물음표,5000원
			
			//4.sql문의 실행
			//select는 executeQuery()
			//update,insert,delete문장은 executeUpdate()
			
			 rs = pstmt.executeQuery();
			
			//5. rs.next() - 다음행이 있으면, 다음행으로 접근합니다.
			while(rs.next()) { //한 행에서 처리할 작업을 while문 안에 넣으면 됩니다.
				String first_name =  rs.getString("FIRST_NAME"); //rs.getString , rs.getInt, getDouble, getDate, 
				int salary = rs.getInt("SALARY");
				double cpt = rs.getDouble("COMMISSION_PCT");
				Date date = rs.getDate("hire_date");
				
				
				System.out.println(first_name);
				System.out.println(salary);
				System.out.println(cpt);
				System.out.println(date);
				
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			
			try {
				conn.close();
				rs.close();
				pstmt.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
	}
}
