package day11;

public class Student {
	private static int seq;
	private int num;
	private String name;

	public Student() {}
	
	public Student(String name) {
		super();
		this.num = ++seq;
		this.name = name;
	}
	
	public static int getSeq() {
		return seq;
	}

	public static void setSeq(int seq) {
		Student.seq = seq;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Student[] �л��� = {
				new Student("�ѵ���"),
				new Student("ȫ�浿"),
				new Student("�̼���"),
				new Student("������")
		};
		
		for (int i = 0; i < �л���.length; i++) {
			System.out.println(�л���[i].getNum()); //�ڵ尡 ���ذ� �� �ȵ� 
		}
		System.out.println("�л� ���� : " + Student.seq + "��");
	}
}