package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<Integer> arList = new ArrayList<>();

		int temp = 0;

		for (int i = 0; i < 6; i++) {
			temp = i;
			if (i > 3) {
				temp += 3;
			}
			arList.add((temp + 1) * 10);
		}

//		arList.add(10);
//		arList.add(80);
//		arList.add(90);
//		arList.add(30);
//		arList.add(20);
//		arList.add(40);

		System.out.println(arList.size());

		System.out.println(arList);
		for (int data : arList) {
			System.out.println(data);
		}

		System.out.print("���� �� : ");
		System.out.println(arList);

		Collections.sort(arList);// ��������

		System.out.print("���� �� : ");
		System.out.println(arList);

		Collections.reverse(arList);
		System.out.println("�¿��Ī : " + arList);
		// ���� ���������� �߱⶧���� ���������� �� ���� �̰� ���� ���������� �ƴ�

		Collections.shuffle(arList);
		System.out.println("�������� : " + arList);

	}
}
