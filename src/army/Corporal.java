package army;

public class Corporal implements Soldier {

	@Override
	public void eat() {
		System.out.println("��ġ�� ���� ���� �Դ´�.");
	}

	@Override
	public void sleep() {
		System.out.println("�� �ܴ�. �׷��� ��� ������ ����.");
	}

	@Override
	public void work() {
		System.out.println("���ӵ鿡�� ���� �ñ��.");
	}

	@Override
	public void salute() {
		System.out.println("����");
	}
}