package day03;

import java.util.Scanner;

public class InputTest3 {

	public static void main(String[] args) {
	
		String name = " ";
		int age = 0;
		
		String nameMsg = "이름 :";
		String ageMsg = "나이 : ";
		
		Scanner sc = new Scanner(System.in);
		System.out.println(ageMsg);
		age = sc.nextInt();
		sc.nextLine(); // 엔터를 상쇄

		System.out.print(nameMsg);
		name = sc.nextLine();
		
		System.out.print(name+"님환영합니다");
		System.out.println(age+"살입니다");
		
	}
}
