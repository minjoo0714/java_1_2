package day13;

import java.util.Scanner;

public class ExceptionTask {

	public static void main(String[] args) {
		int[] arData = new int[5];
		Scanner sc = new Scanner(System.in);
		int data =0;
		String temp="";
		while(true) {
			System.out.println(++data+"째 정수값을 입력해주세요[q : 종료]  ");
			temp = sc.next();
			if (temp.equals("q")) {
				System.out.println("추가를 종료합니다. ");
				break; 
			}
			try {
				arData[--data]= Integer.parseInt(temp);
				System.out.println("추가성공");
				data++;
			} catch (NumberFormatException e) {
//				System.out.println(e);
				System.out.println("정수 또는 'q'만 입력가능합니다.");
			}catch(ArrayIndexOutOfBoundsException e) {
//				System.out.println(e);
				System.out.println("정수는 5개까지만 입력가능합니다.");
				System.out.println("종료합니다");
				break;
			}
		}
	}
}
