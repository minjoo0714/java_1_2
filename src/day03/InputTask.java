package day03;

import java.util.Scanner;

public class InputTask {

	public static void main(String[] args) {
		
				//sc.next()로 정수 2개 입력받고
				//두 정수의 덧셈 출력하기
		Scanner sc= new Scanner(System.in);
		int num1, num2, result = 0; 
		String n1Msg = "첫번째 정수를 입력하세요";
		String n2Msg = "두번째 정수를 입력하세요";
		
		System.out.println(n1Msg);
		num1 = sc.nextInt();
		System.out.println(n2Msg);
		num2 = sc.nextInt();
		result = num1+num2;
		
		System.out.printf("%d와 %d의 합은 %d입니다 ", num1,num2,result);
	}
}
