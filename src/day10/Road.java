package day10;

import java.util.Scanner;

class Car{
	String brand;
	String color;
	int price;
	String pw = "0000";
	boolean isOn;
	int cnt;
	
	public Car() {
	}

	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	public Car(String color, int price) {
		this.color = color;
		this.price = price;
	}
	
	public Car(String brand, String color, int price, String pw) {
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.pw = pw;
	}

	//1. �õ��� �� �� Ű�ų� �� �� �ٽ� �õ��� �� �̹� �����ֽ��ϴ� Ȥ�� �̹� �����ֽ��ϴ� ����ϱ�
	//2. �õ��� �� �� ��й�ȣ�� �Է¹ް� ������ �õ� �ѱ� 3�� ���� Ʋ���� "���� �⵿��" ����ϱ�
	//    �ڵ������� ��й�ȣ�� �־�� �Ѵ�. �ʱ� ��й�ȣ�� 0000�̸�, ���� ������ �� �ִ�.

	//��й�ȣ �Է��ϴ� �޼ҵ�
	 String inputPw() {
		Scanner sc = new Scanner(System.in);
		System.out.print("��й�ȣ : ");
		//����ڰ� �Է��� ��й�ȣ ����
		return sc.next();
	}
	
	void engineStart() {
		//�õ��� ���������� ��
		if(!isOn) {
			//����ڰ� �Է��� ��й�ȣ�� ������ ��
			if(this.pw.equals(inputPw())) {
				//isOn�� true�� ����
				isOn = true;
				//���� Ƚ�� �ʱ�ȭ
				cnt = 0;
				System.out.println(brand + "�õ� Ŵ");
			}else {
				//���� Ƚ�� 1����
				cnt++;
				System.out.println("��й�ȣ ����");
			}
		}else {
			System.out.println("�̹� �õ��� �����ֽ��ϴ�.");
		}
	}
	
	void engineStop() {
		if(isOn) {
			isOn = false;
			System.out.println(brand + "�õ� ��");
		}else {
			System.out.println("�̹� �õ��� �����ֽ��ϴ�.");
		}
	}
}

public class Road {
	public static void main(String[] args) {
//		momCar = new Car("Benz", "Black", 8000, "1234");
//		System.out.println(momCar.pw);

		Car momCar = new Car("Benz", "Black", 8000);
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		while(true) {
			System.out.println("1.�õ��ѱ�\n2.�õ�����");
			choice = sc.nextInt();
			
			if(choice == 1) {
				momCar.engineStart();
				//�õ��� �� �� ���� Ƚ���� 3�̶�� ������ �⵿��Ű�� Ż��
				if(momCar.cnt == 3) {
					System.out.println("���� �⵿��!");
					break;
				}
			}else if(choice == 2) {
				momCar.engineStop();
				break;
			}
		}
	}
}