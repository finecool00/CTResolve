package day14.api.ramda.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainClass03 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		Random ran = new Random();

		for(int i = 0; i<100; i++) {
			list.add(ran.nextInt(100)+1);
		}
		System.out.println(list.toString());
		
		//최종집계 함수
		//
		
		List<Integer> newList =list.stream().filter(a->a%3==0).collect(Collectors.toList());	
		
		System.out.println(newList.toString());
		
		Set<Integer> newList2 = list.stream().filter(a->a%3==0).collect(Collectors.toSet());
		System.out.println(newList2.toString());
		System.out.println("------------------------------------------------");
		//sum(), count(), avg(), max(), min() - 숫자를 다루는 스트림에서만 사용가능
		
		int r1 = list.stream().distinct().mapToInt(a->a).sum();
		System.out.println("합계:"+r1);
		
		long r2 = list.stream().distinct().mapToInt(a->a).count();
		System.out.println("개수:"+r2);
		
		OptionalDouble r3 = list.stream().distinct().mapToInt(a->a).average();
		System.out.println("평균:"+r3.getAsDouble()); //옵셔널 더블형에서 더블값 반환
		
		OptionalInt r4 = list.stream().distinct().mapToInt(a->a).max();
		System.out.println("최대값:"+r4.getAsInt());
		
		OptionalInt r5 = list.stream().distinct().mapToInt(a->a).min();
		System.out.println("최소값:"+r5.getAsInt());
		System.out.println("--------------------------------------------");
		//list에서 50보다 큰값만 중복없이 저장하는 새로운 리스트생성
		List<Integer> list1 =list.stream().distinct().filter(a->a>50).collect(Collectors.toList());
		System.out.println(list1.toString());
		System.out.println("===========================================");
		
		IntStream.range(1, 10).forEach(a->System.out.print(a));  //range(x이상y미만)
		System.out.println("\n===========================================");
		IntStream.rangeClosed(1,10).forEach(a->System.out.print(a));//rangeclosed(x이상y이하)
		System.out.println("\n===========================================");
		int result = IntStream.rangeClosed(1,100).sum();
		System.out.println("1~100까지의합:"+result);
		//정수스트링 ->일반스트림 형변환
		Stream<Integer> stream = IntStream.rangeClosed(1,100).boxed();
		System.out.println(stream.toString());
	}
}
