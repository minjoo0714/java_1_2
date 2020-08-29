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
		System.out.println("¿­¼è·Î ½Ãµ¿ ÄÔ");
	}
	
	void engineStop() {
		System.out.println("¿­¼è·Î ½Ãµ¿ ²û");
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
		System.out.println("À½¼ºÀ¸·Î ½Ãµ¿ Å´");
		super.engineStart();
	}
	
	@Override
	void engineStop() {
		System.out.println("À½¼ºÀ¸·Î ½Ãµ¿ ²û");
		super.engineStop();
	}
	
	void openRoof() {
		System.out.println("ÁöºØ ¿­¸²");
	}

	void closeRoof() {
		System.out.println("ÁöºØ ´ÝÈû");
	}
}

//ÀÌ ±¸¿ªÀÇ Â¯Àº ³ª¾ß! : public : ¸ÞÀÎ Å¬·¡½º ¾Õ¿¡¸¸ ºÙ´Â´Ù!
public class Road2 {
	public static void main(String[] args) {
		NormalCar matiz = new NormalCar("matiz", "yellow", 150);
		SuperCar ferrari = new SuperCar("ferrai", "red", 35000, "Daily");
		
		matiz.engineStart();
		
		ferrari.openRoof();
		ferrari.engineStart();
		
	}
}









