package Quiz21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class FileQuiz01 {
	public static void main(String[] args) {
		/*
		 * 1.스캐너를 통해서 파일명을 입력을 받습니다.
		 * 2.입력받은 파일을 filecopy로 복사해서 옴겨주면 됩니다.
		 * 3.자원해제  주의
		 */
		Scanner scan = new Scanner(System.in);
		String file1 = scan.next();//"C:\\Users\\user\\Desktop\\course\\java\\file\\0001.png"
		String file2 = scan.next();//"C:\\Users\\user\\Desktop\\course\\java\\filecopy\\0001_copy.png"
		String readPath = file1;
		String writePath = file2;


		try(InputStream is = new FileInputStream(readPath);
				OutputStream out = new FileOutputStream(writePath)	) {
			byte[] arr = new byte[2048];
			int result;
			while((result=is.read(arr)) != -1) {
				out.write(arr, 0, result);
			}
		}catch (Exception e) {		
			e.printStackTrace();
		}
	}
}
