package army;

public class Privarte implements Soldier {

	@Override
	public void eat() {
		System.out.println("�㸮�� 90�� �ǰ� �����Ļ縦 �Ѵ�. �׷��� ��� ����.");
	}

	@Override
	public void sleep() {
		System.out.println("��������� ���� ���̷�ٰ� ��� ����.");
	}

	@Override
	public void work() {
		System.out.println("���� ������ ������ ������� �� �ȳ��´�. �׷��� ��� ����.");
	}

	@Override
	public void salute() {
		System.out.println("��!!!!!!!!!!!!!!!!!!!!!!!!!��!!!!!!!!!!!!!!!!!!!!!");
	}
}
