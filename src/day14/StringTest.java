package day14;

import java.util.Random;

public class StringTest {
	public static void main(String[] args) {
		String data1 = "ABC";
		String data2 = "ABC";

		String d1 = new String("ABC");
		String d2 = new String("ABC");

		System.out.println(data1 == data2);
		System.out.println(d1 == d2); // 내가 메모리에 새로 할당한거기때문에 다름
		System.out.println(data1.equals(data2));

		System.out.println(d1.intern() == d2.intern());

		Random r1 = new Random();
		Random r2 = new Random();
		System.out.println("===================");
		System.out.println(r1 == r2);
		System.out.println(r1.equals(r2));
		r1=r2;
		System.out.println(r1 == r2);
		System.out.println(r1.equals(r2));
	}
}
