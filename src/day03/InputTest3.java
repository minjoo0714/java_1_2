package day03;

import java.util.Scanner;

public class InputTest3 {

	public static void main(String[] args) {
	
		String name = " ";
		int age = 0;
		
		String nameMsg = "�̸� :";
		String ageMsg = "���� : ";
		
		Scanner sc = new Scanner(System.in);
		System.out.println(ageMsg);
		age = sc.nextInt();
		sc.nextLine(); // ���͸� ���

		System.out.print(nameMsg);
		name = sc.nextLine();
		
		System.out.print(name+"��ȯ���մϴ�");
		System.out.println(age+"���Դϴ�");
		
	}
}
