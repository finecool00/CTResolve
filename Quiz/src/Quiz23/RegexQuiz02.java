package Quiz23;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz02 {
	public static void main(String[] args) {
		String str = "123123-1231231 GS25(치킨마요) 4,400원";
		String str2 = "123123-1231232 GS25(주부18단) 5,000원";
		
		
		String pattern = "[0-9]{6}-[0-9]{7}";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(str);
		Pattern p4 = Pattern.compile(pattern);
		Matcher m4 = p4.matcher(str2);
		
		String pattern1 = "GS25";
		Pattern p1 = Pattern.compile(pattern1);
		Matcher m1 = p1.matcher(str);
		Pattern p5 = Pattern.compile(pattern1);
		Matcher m5 = p5.matcher(str2);
		
		String pattern2 = "\\([가-힣0-9]+\\)";
		Pattern p2 = Pattern.compile(pattern2);
		Matcher m2 = p2.matcher(str);
		Pattern p6 = Pattern.compile(pattern2);
		Matcher m6 = p6.matcher(str2);
		
		String pattern3 = "[0-9,]{5}원";
		Pattern p3 = Pattern.compile(pattern3);
		Matcher m3 = p3.matcher(str);
		Pattern p7 = Pattern.compile(pattern3);
		Matcher m7 = p7.matcher(str2);
		
		while(m.find()&&m1.find()&&m2.find()&&m3.find()) {
			System.out.println(m.group());
			System.out.println(m1.group());
			System.out.println(m2.group());
			System.out.println(m3.group());
		}
		System.out.println("=============================");
		while(m4.find()&&m5.find()&&m6.find()&&m7.find()) {
			System.out.println(m4.group());
			System.out.println(m5.group());
			System.out.println(m6.group());
			System.out.println(m7.group());
		}
	}

}
