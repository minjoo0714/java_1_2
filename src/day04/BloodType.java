package day04;

import java.util.Scanner;

public class BloodType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String blood1Msg ="당신의 혈액형은?\n";
		String blood2Msg ="1.A\n2.B\n3.O\n4.AB\n입력 : ";
		int choice = 0;
		String aMsg = "A형입니다";
		String bMsg = "B형입니다";
		String oMsg = "O형입니다";
		String abMsg = "AB형입니다";
		String errMsg = "잘못입력했습니다";
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