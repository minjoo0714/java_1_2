package day14;

import java.util.Random;

public class ObjectTest {
	public static void main(String[] args) {
		Random r1 = new Random();
		Random r2 = new Random();

		System.out.println(r1.hashCode());
		System.out.println(r2.hashCode()); // ����Բ� �� �ּҰ��� �ٸ��� ���Դ��� �����

		System.out.println("===================");

		String data1 = new String("ABC");
		String data2 = new String("ABC");

		System.out.println(data1.hashCode());
		System.out.println(data2.hashCode());

	}
}
