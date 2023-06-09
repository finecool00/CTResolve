package Quiz23;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz03 {
	public static void main(String[] args) {
		/*
		 * 1.버퍼리더를 사용해서 건담.txt를 읽어들입니다.
		 * 2.정규표현식을 이용해서 날짜, 지점, 등급, 내용, 가격을 정규표현식으로 패턴분석
		 * Product객체에 저장하고, 리스트에 저장
		 * 
		 * 3.외부라이브러리(POI) - 자바에서 액셀파일 xlsx 형태로 파일을 쓸 수 있도록하는 기능
		 * 하나에 시트에 각 행데이터를 액셀파일로 출력 
		 */
//		public static void createExcel(List<Product> list) {
//			
//			XSSFWorkbook workbook = new XSSFWorkbook();
//			
//			XSSFSheet sheet = workbook.createSheet();
//			
//			XSSFRow row1 = sheet.createRow(0);
//			row1.createCell(0).setCellValue("날짜");
//			row1.createCell(0).setCellValue("지점");
//			row1.createCell(0).setCellValue("등급");
//			row1.createCell(0).setCellValue("상세");
//			row1.createCell(0).setCellValue("가격");
//		}
		
		
		List<Product> list = new ArrayList<>();
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\work\\Quiz\\src\\Quiz23\\건담.txt";
		String pattern = "[0-9]{8}-[0-9]{2}-[0-9]{12,13}";
		String pattern1 = "[가-힣 ]{6,12}";
		String pattern2 = "\\[[가-힣A-Z ]{2,4}\\]";
		String pattern3 = "";
		String pattern4 = "[0-9,]{4,7}원";
		int cnt = 0;
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			String result;
			while((result = br.readLine())!=null) {
				Pattern p = Pattern.compile(pattern);
				Matcher m = p.matcher(result);
				Pattern p1 = Pattern.compile(pattern1);
				Matcher m1 = p1.matcher(result);
				Pattern p2 = Pattern.compile(pattern2);
				Matcher m2 = p2.matcher(result);
				Pattern p3 = Pattern.compile(pattern3);
				Matcher m3 = p3.matcher(result);
				Pattern p4 = Pattern.compile(pattern4);
				Matcher m4 = p4.matcher(result);
				
				
				if(m.find()&&m1.find()&&m2.find()&&m4.find()) {
					String day = m.group();
					String store = m1.group();
					String grade = m2.group();
					String detail = result.substring(m2.end(), m4.start());
					String price = m4.group();
					
					System.out.println("====================");
					System.out.println(day);
					System.out.println(store.replaceFirst(" ", ""));
					System.out.println(grade);
					System.out.println(detail.replaceFirst(" ",""));
					System.out.println(price);
					cnt++;
					Product x = new Product(day,store,grade,detail,price);
					list.add(x);
					
				}
			}
			System.out.println(list.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
