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

		System.out.println("�Ѽ�" + set.size()); // 4���� ������ ���� : �ߺ��� �ȵǴϱ�
		System.out.println(set);

		// �ݺ��� : Iterator : �ݺ��ؼ� ���� ������� ������ ��� : Iterator�� ������ �ο�����
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		set.remove("AB");
		System.out.println("�Ѽ�" + set.size()); // 4���� ������ ���� : �ߺ��� �ȵǴϱ�
		iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}
}
