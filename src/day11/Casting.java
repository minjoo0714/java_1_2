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
		System.out.println("열쇠로 시동 킴");
	}
	void engineStop() {
		System.out.println("열쇠로 시동 끔");
	}
}

 

class SuperCar extends Car{ //상속 SuperCar자식 Car부모

	String mode; //자식에만 있는거 
 
	public SuperCar() {}

	public SuperCar(String brand, String color, int price, String mode) {
		super(brand, color, price);
		this.mode = mode;
	}

	

	@Override
	void engineStart() {
		super.engineStart();
		System.out.println("음성으로 시동 킴");
	}
	@Override
	void engineStop() {
		super.engineStop();
		System.out.println("음성으로 시동 끔");
	}

	
	void openRoof() {
		System.out.println("지붕 열림");
	}

	void closeRoof() {
		System.out.println("지붕 닫힘");
	}

}

 
public class Casting {

	public static void main(String[] args) {

		Car matiz = new Car(); // 클래스명 객체명 = new 생성자();
		SuperCar ferrari = new SuperCar();


		Car noOptionFerrai = new SuperCar();
//		SuperCar brokenFerrari = (SuperCar) new Car();
		SuperCar fullOptionFerrai = (SuperCar) noOptionFerrai; //


		System.out.println(matiz instanceof Car); // 참
		System.out.println(matiz instanceof SuperCar); // 거짓
		System.out.println(ferrari instanceof Car); // 참
		System.out.println(ferrari instanceof SuperCar); // 참
		System.out.println(noOptionFerrai instanceof Car); // 참
		System.out.println(noOptionFerrai instanceof SuperCar); // 참
		System.out.println(fullOptionFerrai instanceof Car); // 참
		System.out.println(fullOptionFerrai instanceof SuperCar); // 참

		
	}

}

 