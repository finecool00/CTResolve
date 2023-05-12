package day16.api.io.buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class BufferedWriterEx2 {
	public static void main(String[] args) {
		
		/*
		 * flush() - 중간중간 파일을 즉시 쓰고 싶으면 flush() 를 사용합니다
		 * 
		 * 버퍼라이드가 끝나면 자동으로 flush() 나감
		 */
		Scanner scan = new Scanner(System.in);
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\test2.txt";
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))){
			System.out.println(">");
			String word1 = scan.next();
			System.out.println(">");
			String word2 = scan.next();
			bw.write(word1);
			bw.flush(); //버퍼에 있는 내용을 내보낸다
			bw.write(word2);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
