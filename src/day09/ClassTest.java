package day09;
class A {
	int data; //null���� �������
	
	void printData() {
		System.out.println("this�� �� :"+this);
		System.out.println(this.data);
	}
}
public class ClassTest {
	public static void main(String[] args) {
		
	A obj1 = new A(); 
	A obj2 = new A();
	
	System.out.println("obj1 : "+obj1);//this��obj1���� ������ ���� �� ���޵Ȱ� 
	
	obj1.data = 100;
	obj1.printData();
	
	
	System.out.println("obj2 : "+obj2);
	obj2.data = 200;
	obj2.printData(); //���� �ٲ���� �ּҰ� �ٲ������ ���� �� ���޵Ȱ���
	
	System.out.println("obj1 : "+obj1);//this��obj1���� ������ ���� �� ���޵Ȱ� 
	System.out.println("obj2 : "+obj2);
	}
}
