package day04;

import java.util.Scanner;

public class OperTask {
public static void main(String[] args) {
			//������ �Է¹ޱ�
			//Scanner����ϱ�
	int num1, num2= 0;
	String n1Msg = "ù��° ����\n";
	String n2Msg = "�ι�° ����\n";
	String result = "";
	Scanner sc = new Scanner(System.in);
	
	System.out.println(n1Msg);
	num1 = sc.nextInt();
	System.out.println(n2Msg);
	num2 = sc.nextInt();
	
	result = num1>num2? "ū�� : "+ num1: 
		num1==num2 ? "�μ��� ����" : "ū�� :"+ num2;
	
	System.out.println(result);

}
}
