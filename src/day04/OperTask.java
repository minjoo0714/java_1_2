package day04;

import java.util.Scanner;

public class OperTask {
public static void main(String[] args) {
			//두정수 입력받기
			//Scanner사용하기
	int num1, num2= 0;
	String n1Msg = "첫번째 정수\n";
	String n2Msg = "두번째 정수\n";
	String result = "";
	Scanner sc = new Scanner(System.in);
	
	System.out.println(n1Msg);
	num1 = sc.nextInt();
	System.out.println(n2Msg);
	num2 = sc.nextInt();
	
	result = num1>num2? "큰값 : "+ num1: 
		num1==num2 ? "두수는 같다" : "큰값 :"+ num2;
	
	System.out.println(result);

}
}
