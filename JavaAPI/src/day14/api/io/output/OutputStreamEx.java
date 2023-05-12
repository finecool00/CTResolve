package day14.api.io.output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamEx {
	public static void main(String[] args) {
		/*
		 * 파일을 쓸 때 사용하는 클래스는 fileoutputstream입니다.
		 * 생성자 매개값으로 파일을 쓸 경로가 들어갑니다.
		 * io패키지 거의 모든 클래스들은 생성자에 throws가 있기 때문에
		 * 반드시 예외처리 문장안에서 사용합니다
		 */
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\example.txt";
		try {			
			OutputStream file = new FileOutputStream(path);
			//1st
//			file.write(65); //한글자씩 씀
//			file.write(66);
//			file.write(67);
			
			//2st
//			byte[] arr = {65,66,67,68,69}; //배열에 들어있는 데이터를 한번에 씀
//			file.write(arr);
			
			//3st
			String str = "안녕하세요"; //한글은 1byte기반으로 쓰기엔 적절하지 않음
			byte[] arr = str.getBytes();
			file.write(arr);
			file.close(); //자원 해제
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}

}
