package day07;

import java.util.Scanner;

public class HomeWork {
//	�迭�� ����� 
//	���� �ǹ��� 
//	�����̴� ���� �ǹ��ִ�
//	�������� 1���� �ִ� 1ȣ , 2ȣ , 3ȣ �� �����ߴ� 
//	�� ȣ�� ������ �Է¹ް� �� ������ ��տ����� �����ִ� ���α׷��� ���弼��
	//�� ��� ������ ����������� ����Ѵ�
	public static void main(String[] args) {
		int[] arIncome = new int[3];
		Scanner sc= new Scanner(System.in);
		int total =0;
		double avg=0.0;
		for (int i = 0; i < arIncome.length; i++) {
			System.out.println(i+1+"ȣ ������ �Է��ϼ���");
			arIncome[i] = sc.nextInt();
			total +=arIncome[i];
		}
		
		avg= (double)total/arIncome.length;
		avg = Double.parseDouble(String.format("%.2f", avg));
		System.out.println("�ѿ��� : "+total);
		System.out.println("��տ��� : "+ avg);
	}
}
