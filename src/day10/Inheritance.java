package day10;

class A{
	int data = 10;
	
	//����� ���� �����ڰ� ���� ������
	//�⺻ �����ڴ� �׻� �����ε� ���ش�(����� �ش�).
	public A() {
		System.out.println("�θ� ������ ȣ���");
	}
	
	public A(int data) {
		this.data = data;
	}

	void printData() {
		System.out.println(data);
	}
	
	void intro() {
		System.out.println("A Ŭ���� �Դϴ�.");
	}
}

class B extends A{
	
	public B() {
		super();
		System.out.println("�ڽ� ������ ȣ���");
	}
	
	public B(int data) {
		super(data);
	}
	
	void increaseData() {
		data++;
		printData();
	}
	
	@Override
	void intro() {
		super.intro();
		System.out.println("B Ŭ���� �Դϴ�.");
	}
}

public class Inheritance {
	public static void main(String[] args) {
		B obj = new B(50);
		obj.increaseData();
		obj.intro();
	}
}






