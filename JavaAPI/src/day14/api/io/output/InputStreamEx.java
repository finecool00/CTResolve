package day14.api.io.output;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;

public class InputStreamEx {
	public static void main(String[] args) {
		/*
		 * 파일을 읽는데 사용하는 클래스 FileInputStream
		 * 
		 */
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\example.txt";
		try {
			InputStream in = new FileInputStream(path);
//			int result = in.read();   
//			System.out.println((char)result);
//			in.close();
			
			//1st
			//read()은 하나씩 데이터를 읽고, 더 읽을값이 없으면 -1반환함
//			while(true) {
//				int result = in.read();
//				System.out.println((char)result);
//				if(result == -1) {
//					break;
//				}
//				
//			}
			//2st
			//read(배열)  해당배열의 크기만큼
			byte[] arr = new byte[100];
			int result = in.read(arr);
			System.out.println(result); //읽어들인 크기 반환
			int i = 0;
			while(true) {
				System.out.println((char)arr[i]);
				if(arr[i] == 0) {
					break;
				}
				i++;
				
			}
			int result2 = in.read(arr); //더 읽을 값이 없다면 -1 반환
			System.out.println(result2);
			in.close();
			} catch (Exception e) {			
			e.printStackTrace();
		}
	}

}
