//package day09;
//
//import java.util.Scanner;
//
//class Car {
//	String brand;
//	String color;
//	int price;
//	boolean engine = false;
//
//	public Car(String brand, String color, int price) {
//		this.brand = brand;
//		this.color = color;
//		this.price = price;
//	}
//
//	void engineStart() {
//		if (engine) {
//			System.out.println("이미 시동이 켜져있습니다.");
//		} else {
//			System.out.println(brand + "시동킴");
//			engine = true;
//		}
//	}
//
//	void engineStop() {
//		if (!engine) {
//			System.out.println("이미 시동이 꺼져있습니다.");
//		} else {
//			System.out.println(brand + "시동끔");
//			engine = false;
//		}
//	}
//}
//
//public class Road {
//	public static void main(String[] args) {
//		Car momCar = new Car("benz", "black", 5000);
//		Car dadyCar = new Car("BMW", "white", 9000);
//		Car myCar = new Car("audi", "white", 5000);
//		Scanner sc = new Scanner(System.in);
//		int choice;
//
//		while (true) {
//			System.out.println("아빠차 조작:1, 엄마차 조작:2, 내차조작:3");
//			choice = sc.nextInt();
//			switch (choice) {
//			case 1: // 아빠차조작메뉴 시동켜기
//				System.out.println("아빠차메뉴를 선택하셨습니다");
//				System.out.println("1. 시동켜기, 2.시동끄기");
//				choice = sc.nextInt();
//				switch (choice) {
//				case 1:
//					dadyCar.engineStart();
//					break;
//				case 2:
//					dadyCar.engineStop();
//					break;
//				case 3:
//					continue;
//				default:
//					System.out.println("잘못 입력하셨습니다.");
//					break;
//				}
//				break;
//			case 2:
//				System.out.println("엄마차메뉴를 선택하셨습니다");
//				System.out.println("1. 시동켜기, 2.시동끄기");
//				choice = sc.nextInt();
//				switch (choice) {
//				case 1:
//					momCar.engineStart();
//					break;
//				case 2:
//					momCar.engineStop();
//					break;
//				case 3:
//					continue;
//				default:
//					System.out.println("잘못 입력하셨습니다.");
//					break;
//				}
//				break;
//			case 3:
//				System.out.println("내차메뉴를 선택하셨습니다");
//				System.out.println("1. 시동켜기, 2.시동끄기3.홈으로");
//				choice = sc.nextInt();
//				switch (choice) {
//				case 1:
//					myCar.engineStart();
//					break;
//				case 2:
//					myCar.engineStop();
//					break;
//				case 3:
//					continue;
//				default:
//					System.out.println("잘못 입력하셨습니다.");
//					continue;
//				}
//				break;
//			default:
//				System.out.println("잘못입력하셨습니다.");
//				break;
//			}
//		}
//	}
//}