package day03;

import java.util.Scanner;

public class InputTask {

	public static void main(String[] args) {
		
				//sc.next()�� ���� 2�� �Է¹ް�
				//�� ������ ���� ����ϱ�
		Scanner sc= new Scanner(System.in);
		int num1, num2, result = 0; 
		String n1Msg = "ù��° ������ �Է��ϼ���";
		String n2Msg = "�ι�° ������ �Է��ϼ���";
		
		System.out.println(n1Msg);
		num1 = sc.nextInt();
		System.out.println(n2Msg);
		num2 = sc.nextInt();
		result = num1+num2;
		
		System.out.printf("%d�� %d�� ���� %d�Դϴ� ", num1,num2,result);
	}
}
