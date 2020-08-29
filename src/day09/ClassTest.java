package day09;
class A {
	int data; //null값이 들어있음
	
	void printData() {
		System.out.println("this의 값 :"+this);
		System.out.println(this.data);
	}
}
public class ClassTest {
	public static void main(String[] args) {
		
	A obj1 = new A(); 
	A obj2 = new A();
	
	System.out.println("obj1 : "+obj1);//this와obj1값이 같으면 값이 잘 전달된것 
	
	obj1.data = 100;
	obj1.printData();
	
	
	System.out.println("obj2 : "+obj2);
	obj2.data = 200;
	obj2.printData(); //값이 바뀌었고 주소가 바뀌었으면 값이 잘 전달된것임
	
	System.out.println("obj1 : "+obj1);//this와obj1값이 같으면 값이 잘 전달된것 
	System.out.println("obj2 : "+obj2);
	}
}
