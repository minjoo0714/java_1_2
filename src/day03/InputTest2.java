package day03;

import java.util.Scanner;

public class InputTest2 {

	
	public static void main(String[] args) {
		
		String name = "";
		Scanner sc = new Scanner(System.in);
		String nameMsg ="ÀÌ¸§ ÇÑÄ­¶ç°í ÀÔ·Â:";
		System.out.println(nameMsg);
		name = sc.next();
		System.out.println(name+sc.next()+"´Ô È¯¿µÇÕ´Ï´Ù");
		
		
	}	
	
}
