package day07;

import java.util.Random;
import java.util.Scanner;

public class Gucci {
	public static void main(String[] args) {
		//지점별(강남점, 홍대점, 신촌점) 행
		//연령별(일반점, 키즈점)	열
		//연령별 총 매출액, 평균 매출액
		//지점별 총 매출액, 평균 매출액
		//구찌 총 매출액, 평균 매출액
		
		//인센티브 매장(평균보다 높은 매장)
		String[][] arrBranch = {
				{"강남 일반점", "강남 키즈점"},
				{"홍대 일반점", "홍대 키즈점"},
				{"신촌 일반점", "신촌 키즈점"}
		};
		
		String[] arBranch = {"강남점", "홍대점", "신촌점"};
		String[] arAge = {"일반점", "키즈점"};
		
		int[][] arrIncome = new int[3][2];
		Scanner sc = new Scanner(System.in);
		
		//연령별 총
		int[] arTotal_age = new int[2];
		//연령별 평균
		double[] arAvg_age = new double[2];
		
		//지점별 총
		int[] arTotal_branch = new int[3];
		//지점별 평균
		double[] arAvg_branch = new double[3];
		
		//전체 총
		int total = 0;
		//전체 평균
		double avg = 0.0;
		
		//총 길이
		int length = 0;
		//FLAG
		boolean check = false;
		for (int i = 0; i < arrIncome.length; i++) {
			length += arrIncome[i].length;
			for (int j = 0; j < arrIncome[i].length; j++) {
				System.out.println(arrBranch[i][j] + " 매출액 입력(단위 : 만원)");
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
		
		System.out.println("======지점별 매출액======");
		for (int i = 0; i < arAvg_branch.length; i++) {
			System.out.println(arBranch[i] + " 총 매출액 : "
					+ arTotal_branch[i] + "만원");
			System.out.println(arBranch[i] + "평균 매출액 : "
					+ arAvg_branch[i] + "만원");
			System.out.println("----------------------------");
		}
		
		System.out.println("======연령별 매출액======");
		for (int i = 0; i < arAvg_age.length; i++) {
			System.out.println(arAge[i] + " 총 매출액 : "
					+ arTotal_age[i] + "만원");
			System.out.println(arAge[i] + "평균 매출액 : "
					+ arAvg_age[i] + "만원");
			System.out.println("----------------------------");
		}
		System.out.println("======통합 매출액======");
		System.out.println("구찌 총 매출액 : " + total + "만원");
		System.out.println("구찌 평균 매출액 : " + avg + "만원");

		//과제
		//평균 매출액 보다 매출액이 높은 매장은 인센티브 매장으로 출력한다.
		//출력 예)
		//★인센티브 매장★
		//강남 일반점
		//신촌 키즈점
		
		//만약 인센티브 매장이 없다면 "없습니다. 분발하세요." 출력하기
		
		System.out.println("★인센티브 매장★");
		for (int i = 0; i < arrIncome.length; i++) {
			for (int j = 0; j < arrIncome[i].length; j++) {
				if(arrIncome[i][j]>avg);{
					System.out.println(arrBranch[i][j]);
					check = true;
				}
			}
		}
		if(!check) {
			System.out.println("없습니다 분발하세요");
		}
		
	}//main
}//class



		

 
 

 