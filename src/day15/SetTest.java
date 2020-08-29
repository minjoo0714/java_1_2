package day15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();

		set.add("A");
		set.add("B");
		set.add("O");
		set.add("AB");
		set.add("A");
		set.add("A");
		set.add("B");
		set.add("O");

		System.out.println("총수" + set.size()); // 4개만 나오는 이유 : 중복이 안되니까
		System.out.println(set);

		// 반복자 : Iterator : 반복해서 값을 순서대로 뽑을떄 사용 : Iterator는 순서를 부여해줌
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		set.remove("AB");
		System.out.println("총수" + set.size()); // 4개만 나오는 이유 : 중복이 안되니까
		iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}
}
