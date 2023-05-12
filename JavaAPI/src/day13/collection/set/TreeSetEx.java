package day13.collection.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>();
		set.add(1);
		set.add(3);
		set.add(2);
		set.add(4);
		set.add(5);		
				
		System.out.println(set.toString());
		
		for(int a:set) {
			System.out.println(a);
		}
	}

}
