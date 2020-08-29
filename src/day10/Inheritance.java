package day10;

class A{
	int data = 10;
	
	//사용자 정의 생성자가 있을 때에는
	//기본 생성자는 항상 오버로딩 해준다(만들어 준다).
	public A() {
		System.out.println("부모 생성자 호출됨");
	}
	
	public A(int data) {
		this.data = data;
	}

	void printData() {
		System.out.println(data);
	}
	
	void intro() {
		System.out.println("A 클래스 입니다.");
	}
}

class B extends A{
	
	public B() {
		super();
		System.out.println("자식 생성자 호출됨");
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
		System.out.println("B 클래스 입니다.");
	}
}

public class Inheritance {
	public static void main(String[] args) {
		B obj = new B(50);
		obj.increaseData();
		obj.intro();
	}
}






