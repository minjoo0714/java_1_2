package day14;

public class ForEachTest {
	public static void main(String[] args) {
		Object[] arData = { '1', 9, "�ȳ�", 8.59 };

		for (Object obj : arData) {
			System.out.println(obj);
		}
	}
}
