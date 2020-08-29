package day03;

import java.util.Scanner;

public class InputTask2 {

	public static void main(String[] args) {
		//두 실수의 뺄셈 출력하기
		Double num1 , num2, result = 0.0;
		String n1Msg ="첫번째 실수를 입력하세요";
		String n2Msg ="두번째 실수를 입력하세요";
		
		Scanner sc = new Scanner(System.in);

		System.out.println(n1Msg);
		num1 = sc.nextDouble();
		
		System.out.println(n2Msg);
		num2 = sc.nextDouble();
		
		result = num1 - num2;
		
		System.out.printf("첫번째실수%.2f과두번째실수%.2f의 빼기값은%.2f입니다",num1,num2,result);
		
	}
}
