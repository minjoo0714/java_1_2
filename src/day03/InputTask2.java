package day03;

import java.util.Scanner;

public class InputTask2 {

	public static void main(String[] args) {
		//�� �Ǽ��� ���� ����ϱ�
		Double num1 , num2, result = 0.0;
		String n1Msg ="ù��° �Ǽ��� �Է��ϼ���";
		String n2Msg ="�ι�° �Ǽ��� �Է��ϼ���";
		
		Scanner sc = new Scanner(System.in);

		System.out.println(n1Msg);
		num1 = sc.nextDouble();
		
		System.out.println(n2Msg);
		num2 = sc.nextDouble();
		
		result = num1 - num2;
		
		System.out.printf("ù��°�Ǽ�%.2f���ι�°�Ǽ�%.2f�� ���Ⱚ��%.2f�Դϴ�",num1,num2,result);
		
	}
}
