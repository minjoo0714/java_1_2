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
//			System.out.println("�̹� �õ��� �����ֽ��ϴ�.");
//		} else {
//			System.out.println(brand + "�õ�Ŵ");
//			engine = true;
//		}
//	}
//
//	void engineStop() {
//		if (!engine) {
//			System.out.println("�̹� �õ��� �����ֽ��ϴ�.");
//		} else {
//			System.out.println(brand + "�õ���");
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
//			System.out.println("�ƺ��� ����:1, ������ ����:2, ��������:3");
//			choice = sc.nextInt();
//			switch (choice) {
//			case 1: // �ƺ������۸޴� �õ��ѱ�
//				System.out.println("�ƺ����޴��� �����ϼ̽��ϴ�");
//				System.out.println("1. �õ��ѱ�, 2.�õ�����");
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
//					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
//					break;
//				}
//				break;
//			case 2:
//				System.out.println("�������޴��� �����ϼ̽��ϴ�");
//				System.out.println("1. �õ��ѱ�, 2.�õ�����");
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
//					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
//					break;
//				}
//				break;
//			case 3:
//				System.out.println("�����޴��� �����ϼ̽��ϴ�");
//				System.out.println("1. �õ��ѱ�, 2.�õ�����3.Ȩ����");
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
//					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
//					continue;
//				}
//				break;
//			default:
//				System.out.println("�߸��Է��ϼ̽��ϴ�.");
//				break;
//			}
//		}
//	}
//}