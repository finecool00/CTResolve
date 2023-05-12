package day16.api.io.buffered;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class speedwrite {
	public static void main(String[] args) {
		/*
		 * InputStreamReader은
		 * 
		 * 1바이트 데이터를 => 2바이트 기반으로 변경
		 */
		try {
			BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
			String name = bw.readLine();
			
			System.out.println(name); //입력받은 결과
			
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
