package day07;

import java.util.Random;
import java.util.Scanner;

public class Gucci {
	public static void main(String[] args) {
		//������(������, ȫ����, ������) ��
		//���ɺ�(�Ϲ���, Ű����)	��
		//���ɺ� �� �����, ��� �����
		//������ �� �����, ��� �����
		//���� �� �����, ��� �����
		
		//�μ�Ƽ�� ����(��պ��� ���� ����)
		String[][] arrBranch = {
				{"���� �Ϲ���", "���� Ű����"},
				{"ȫ�� �Ϲ���", "ȫ�� Ű����"},
				{"���� �Ϲ���", "���� Ű����"}
		};
		
		String[] arBranch = {"������", "ȫ����", "������"};
		String[] arAge = {"�Ϲ���", "Ű����"};
		
		int[][] arrIncome = new int[3][2];
		Scanner sc = new Scanner(System.in);
		
		//���ɺ� ��
		int[] arTotal_age = new int[2];
		//���ɺ� ���
		double[] arAvg_age = new double[2];
		
		//������ ��
		int[] arTotal_branch = new int[3];
		//������ ���
		double[] arAvg_branch = new double[3];
		
		//��ü ��
		int total = 0;
		//��ü ���
		double avg = 0.0;
		
		//�� ����
		int length = 0;
		//FLAG
		boolean check = false;
		for (int i = 0; i < arrIncome.length; i++) {
			length += arrIncome[i].length;
			for (int j = 0; j < arrIncome[i].length; j++) {
				System.out.println(arrBranch[i][j] + " ����� �Է�(���� : ����)");
				arrIncome[i][j] = sc.nextInt();
				arTotal_branch[i] += arrIncome[i][j];
				arTotal_age[j] += arrIncome[i][j];
				total += arrIncome[i][j];
			}
			arAvg_branch[i] = 
					Double.parseDouble(String.format("%.2f", 
							(double)arTotal_branch[i] / arrIncome[i].length));
		}
		
		for (int i = 0; i < arTotal_age.length; i++) {
			arAvg_age[i] = Double.parseDouble(String.format("%.2f",  
					(double)arTotal_age[i] / arrIncome.length));
		}
		
		avg = Double.parseDouble(String.format("%.2f", 
				(double)total / length));
		
		System.out.println("======������ �����======");
		for (int i = 0; i < arAvg_branch.length; i++) {
			System.out.println(arBranch[i] + " �� ����� : "
					+ arTotal_branch[i] + "����");
			System.out.println(arBranch[i] + "��� ����� : "
					+ arAvg_branch[i] + "����");
			System.out.println("----------------------------");
		}
		
		System.out.println("======���ɺ� �����======");
		for (int i = 0; i < arAvg_age.length; i++) {
			System.out.println(arAge[i] + " �� ����� : "
					+ arTotal_age[i] + "����");
			System.out.println(arAge[i] + "��� ����� : "
					+ arAvg_age[i] + "����");
			System.out.println("----------------------------");
		}
		System.out.println("======���� �����======");
		System.out.println("���� �� ����� : " + total + "����");
		System.out.println("���� ��� ����� : " + avg + "����");

		//����
		//��� ����� ���� ������� ���� ������ �μ�Ƽ�� �������� ����Ѵ�.
		//��� ��)
		//���μ�Ƽ�� �����
		//���� �Ϲ���
		//���� Ű����
		
		//���� �μ�Ƽ�� ������ ���ٸ� "�����ϴ�. �й��ϼ���." ����ϱ�
		
		System.out.println("���μ�Ƽ�� �����");
		for (int i = 0; i < arrIncome.length; i++) {
			for (int j = 0; j < arrIncome[i].length; j++) {
				if(arrIncome[i][j]>avg);{
					System.out.println(arrBranch[i][j]);
					check = true;
				}
			}
		}
		if(!check) {
			System.out.println("�����ϴ� �й��ϼ���");
		}
		
	}//main
}//class



		

 
 

 