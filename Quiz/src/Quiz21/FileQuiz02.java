package Quiz21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileQuiz02 {
	public static void main(String[] args) {
		/*
	       * 1. Date클래스를 이용해서 File경로에 하위폴더로 20200421file 폴더를 생성합니다
	       * 2. 스캐너로 파일명을 입력받고 BufferedWriter를 이용해서 .txt파일을 생성합니다.
	       * 3. 그만을 입력받을 떄 까지 엔터를 포함해서 입력 받습니다.
	       *    \r\n을 적절하게 이용해서 파일 출력을 완료 
	       *    
	       * 4. 파일을 다 썻다면 아무방법으로 읽어들여서 이클립스창에 출력.
	       */
		Scanner scan = new Scanner(System.in);
		Date date = new Date();
		SimpleDateFormat a = new SimpleDateFormat("20200421");
		String x = a.format(date);
		String path = (scan.next()+x);		
		try {
			File file = new File(path);
			if(file.exists() == false ) {
				file.mkdir();								
			}else {
				System.out.println("이미 폴더가 존재합니다");
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}	
		String path1 = scan.next();
		try {
			File file1 = new File(path1);
			if(file1.exists()==false) {
				file1.createNewFile();				
			}else {
				System.out.println("이미 파일이 존재합니다");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		String path2 = scan.next();
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path2,true))) {
			while(true) {
				String word = scan.next();			
				if(word.equals("그만") ) {
					System.out.println("파일 입력 종료");
					break;
				}
				bw.write(word+"\n");
				bw.flush();
				System.out.println("파일 입력 완료");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		String path3 = scan.next();
		try(BufferedReader br = new BufferedReader(new FileReader(path3))) {
			String result;
			while((result = br.readLine())!= null){
				System.out.println(result);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
