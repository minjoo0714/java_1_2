package day13;

public class ExceptionTest {
	public static void main(String[] args) {
		try {
			System.out.println(10 / 0);
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("0���� ���� �� �����ϴ�.");
		}
		System.out.println("�ݵ�� ����Ǿ�� �ϴ� ����");
	}
}