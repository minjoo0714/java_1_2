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

	//1. 시동을 한 번 키거나 끈 후 다시 시도할 때 이미 꺼져있습니다 혹은 이미 켜져있습니다 출력하기
	//2. 시동을 켤 때 비밀번호를 입력받고 맞으면 시동 켜기 3번 연속 틀리면 "경찰 출동중" 출력하기
	//    자동차마다 비밀번호가 있어야 한다. 초기 비밀번호는 0000이며, 출고시 변경할 수 있다.

	//비밀번호 입력하는 메소드
	 String inputPw() {
		Scanner sc = new Scanner(System.in);
		System.out.print("비밀번호 : ");
		//사용자가 입력한 비밀번호 리턴
		return sc.next();
	}
	
	void engineStart() {
		//시동이 꺼져있으면 참
		if(!isOn) {
			//사용자가 입력한 비밀번호가 맞으면 참
			if(this.pw.equals(inputPw())) {
				//isOn을 true로 변경
				isOn = true;
				//오류 횟수 초기화
				cnt = 0;
				System.out.println(brand + "시동 킴");
			}else {
				//오류 횟수 1증가
				cnt++;
				System.out.println("비밀번호 오류");
			}
		}else {
			System.out.println("이미 시동이 켜져있습니다.");
		}
	}
	
	void engineStop() {
		if(isOn) {
			isOn = false;
			System.out.println(brand + "시동 끔");
		}else {
			System.out.println("이미 시동이 꺼져있습니다.");
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
			System.out.println("1.시동켜기\n2.시동끄기");
			choice = sc.nextInt();
			
			if(choice == 1) {
				momCar.engineStart();
				//시동을 켤 때 오류 횟수가 3이라면 경찰을 출동시키고 탈출
				if(momCar.cnt == 3) {
					System.out.println("경찰 출동중!");
					break;
				}
			}else if(choice == 2) {
				momCar.engineStop();
				break;
			}
		}
	}
}