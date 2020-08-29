package day10;

class NormalCar{
	String brand;
	String color;
	int price;

	public NormalCar() {}
	
	public NormalCar(String brand, String color, int price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	void engineStart() {
		System.out.println("����� �õ� ��");
	}
	
	void engineStop() {
		System.out.println("����� �õ� ��");
	}
}

class SuperCar extends NormalCar{
	String mode;
	
	public SuperCar() {}
	
	public SuperCar(String brand, String color, int price, String mode) {
		super(brand, color, price);
		this.mode = mode;
	}

	@Override
	void engineStart() {
		System.out.println("�������� �õ� Ŵ");
		super.engineStart();
	}
	
	@Override
	void engineStop() {
		System.out.println("�������� �õ� ��");
		super.engineStop();
	}
	
	void openRoof() {
		System.out.println("���� ����");
	}

	void closeRoof() {
		System.out.println("���� ����");
	}
}

//�� ������ ¯�� ����! : public : ���� Ŭ���� �տ��� �ٴ´�!
public class Road2 {
	public static void main(String[] args) {
		NormalCar matiz = new NormalCar("matiz", "yellow", 150);
		SuperCar ferrari = new SuperCar("ferrai", "red", 35000, "Daily");
		
		matiz.engineStart();
		
		ferrari.openRoof();
		ferrari.engineStart();
		
	}
}









