package day04;

import java.util.Scanner;

public class BloodType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String blood1Msg ="����� ��������?\n";
		String blood2Msg ="1.A\n2.B\n3.O\n4.AB\n�Է� : ";
		int choice = 0;
		String aMsg = "A���Դϴ�";
		String bMsg = "B���Դϴ�";
		String oMsg = "O���Դϴ�";
		String abMsg = "AB���Դϴ�";
		String errMsg = "�߸��Է��߽��ϴ�";
		String resultMsg ="";
		Scanner sc = new Scanner(System.in);
		
		System.out.print(blood1Msg+blood2Msg);
		choice = sc.nextInt();
		
		switch (choice) {
		case 1:
			resultMsg = aMsg;
			break;
		case 2:
			resultMsg = bMsg;
			break;
		case 3:
			resultMsg = oMsg;
			break;
		case 4:
			resultMsg = abMsg;
			break;

		default:
			resultMsg = errMsg;
		}
		System.out.println(resultMsg);
	}

}

//		if (choice==1) {
//			resultMsg = aMsg;
//		}
//		else if (choice ==2 ) {
//			resultMsg = bMsg;
//		}		
//		else if (choice ==3 ) {
//			resultMsg = oMsg;
//		}		
//		else if (choice ==4 ) {
//			resultMsg = abMsg;
//		}		
//		else {
//			resultMsg = errMsg;
//		}