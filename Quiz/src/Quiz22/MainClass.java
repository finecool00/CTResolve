package Quiz22;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {
	public static void main(String[] args) {
		//지역명, 규모구분, 연도, 월, 분양가격 -> 1행 x4800개
		/*
		 * 1.버퍼리더 이용해서 한줄씩 읽습니다.
		 * 2.split(",", 5) 를 사용해서 Data객체에 한줄 단위로 저장을하고
		 * 3.List<Data>에 하나씩 추가를 합니다.
		 * 
		 * 4.람다식 이용해서 지역:서울, 4분기중 9~12월, 분양가격이 2000이상인 객체만 뽑아서 새로운 리스트로 반환
		 * 
		 * 
		 */

		String path = "C:\\Users\\user\\Desktop\\course\\java\\work\\Quiz\\src\\Quiz22\\주택도시보증공사_전국 평균 분양가격.csv";
		List<Data> list = new ArrayList<>();
		try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path),"EUC-KR"));) {
			br.readLine();
			String str;
			while((str = br.readLine())!= null) {
				String[] arr = str.split(",",5);
				String region = arr[0];
				String size = arr[1];
				String year = arr[2];
				String month = arr[3];				
				String price = arr[4].replace(" ","").replace(",","").replace("\"","").replace("-", "");
				
				price = price.equals("") ? "0" : price;   //공백이라면 "0" 대입 : 아니면 그대로
												
				Data data = new Data(region,size,year,month,price);
				list.add(data);
				
				
			}
			list.stream()
			.filter(a->a.equals("서울"))
			.filter((a)->a.equals("9"))
//			.filter(a->a>=2000)
			.forEach(a->System.out.println(a+" "));
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
