package army;

public class Pfc implements Soldier {

	@Override
	public void eat() {
		System.out.println("���� ���ǰ� ���� ������ ���� �Ļ��Ѵ�.");
	}

	@Override
	public void sleep() {
		System.out.println("��� ����.");
	}

	@Override
	public void work() {
		System.out.println("������ �ϸ� ������� ����. ���ӵ� �˷��ָ鼭 ���Ѵ�.");
	}

	@Override
	public void salute() {
		System.out.println("��!��!");
	}

}
