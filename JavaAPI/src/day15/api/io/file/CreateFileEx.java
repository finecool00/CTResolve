package day15.api.io.file;

import java.io.File;

public class CreateFileEx {
	public static void main(String[] args) {
		/*
		 * File 클래스
		 * 외부경로에 폴더 or 단순한파일 생성이나 삭제를 할 수 있습니다.
		 * 
		 */
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\20230504";
		try {
			File file = new File(path);
			//생성
			if(file.exists()== false) { //존재하면 트루, 존재하지않으면 펄스
				file.mkdir();  				
			}else {
				System.out.println("이미 폴더가 존재합니다");
			}
			
			//삭제
			if(file.exists()==true) {
				file.delete();				
			}
			
		} catch (Exception e) {
			
		}
		
	}

}
