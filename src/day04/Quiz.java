package day04;

import java.util.Scanner;

public class Quiz {
public static void main(String[] args) {
	String q1Msg = "���� �� ���ְ� �� �����ϴ� �� �� ? \n";
	String q2Msg = "1. ��ȸ\n 2.����ù�\n 3�ʹ�\n 4��ġ\n";
	int answer = 4;
	int choice =0;
	Boolean check =false ; 
	String result = "";
	Scanner sc = new Scanner(System.in);
	System.out.println(q1Msg+q2Msg);
	choice = sc.nextInt();
	check =choice<4&&choice>0 ;
		if (answer == choice) {
			result = "�����Դϴ�";
		}
		else if (check) {
			result = "�����Դϴ�";
		}
		else {
			result = "�ٽ� �Է����ּ���";
		}

		System.out.println(result);
		
//	//���׿�����
//	result = answer==choice ?"�����Դϴ�~���� :"+answer :
//		choice<4&&choice>0? "Ʋ�Ƚ��ϴ�" : "�ٽ� �Է����ּ���";
//		System.out.println(result);
		// ���� ���� �����ϱ�
		
}
}
