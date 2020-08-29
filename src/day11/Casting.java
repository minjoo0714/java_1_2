package day11;

class Car{

	String brand;
	String color;
	int price;

	public Car() {}

	public Car(String brand, String color, int price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	void engineStart() {
		System.out.println("����� �õ� Ŵ");
	}
	void engineStop() {
		System.out.println("����� �õ� ��");
	}
}

 

class SuperCar extends Car{ //��� SuperCar�ڽ� Car�θ�

	String mode; //�ڽĿ��� �ִ°� 
 
	public SuperCar() {}

	public SuperCar(String brand, String color, int price, String mode) {
		super(brand, color, price);
		this.mode = mode;
	}

	

	@Override
	void engineStart() {
		super.engineStart();
		System.out.println("�������� �õ� Ŵ");
	}
	@Override
	void engineStop() {
		super.engineStop();
		System.out.println("�������� �õ� ��");
	}

	
	void openRoof() {
		System.out.println("���� ����");
	}

	void closeRoof() {
		System.out.println("���� ����");
	}

}

 
public class Casting {

	public static void main(String[] args) {

		Car matiz = new Car(); // Ŭ������ ��ü�� = new ������();
		SuperCar ferrari = new SuperCar();


		Car noOptionFerrai = new SuperCar();
//		SuperCar brokenFerrari = (SuperCar) new Car();
		SuperCar fullOptionFerrai = (SuperCar) noOptionFerrai; //


		System.out.println(matiz instanceof Car); // ��
		System.out.println(matiz instanceof SuperCar); // ����
		System.out.println(ferrari instanceof Car); // ��
		System.out.println(ferrari instanceof SuperCar); // ��
		System.out.println(noOptionFerrai instanceof Car); // ��
		System.out.println(noOptionFerrai instanceof SuperCar); // ��
		System.out.println(fullOptionFerrai instanceof Car); // ��
		System.out.println(fullOptionFerrai instanceof SuperCar); // ��

		
	}

}

 