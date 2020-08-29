package day14;

public class User {
	int num;
	String name;

	public User() {}

	public User(int num, String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return this.num + this.name;
	}

	@Override
	public boolean equals(Object obj)  {
		if (obj instanceof User) {
			//UserŸ���̸� down casting�� ���ؼ� num�� �����´�.
			User user = (User)obj;
			//�ܺο��� ���޵� ��ü�� num�� equals()�� ������ ��ü��  num�� ���ٸ� true����
			if (user.num == this.num ) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		// �ش� ��ü�� num�� �ؽð����� ������
		return this.num;
	}
}
