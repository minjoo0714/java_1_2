package day05;

public class ForTask {
	public static void main(String[] args) {
		// 100~1������ 70���� ��� break
		for (int i = 0; i < 100; i++) {
			System.out.println(100 - i);
			if (i == 30) {
				break;
			}
		}
		// A~F���� C�����ϰ� ��� continue
		for (int i = 0; i < 6; i++) {
			if (i == 2) {
				continue;
			}
			System.out.println((char) (i + 65));
		}
		// 1~100������ 3�� 5�� ����� ����ϱ� break
		for (int i = 0; i < 100; i++) {
			int temp = i+1;
			if (!(temp % 3 == 0 && temp % 5 == 0)) {
				continue;
			}
			System.out.println(temp);
		}
		for(int i=0; i<100; i++) {
			int temp = i+1;
			if(temp%3!=0||temp%5!=0) {
				continue;
			}
			System.out.println(temp);
		}
	}
}
