package day07;

import java.util.Scanner;

public class HomeWork {
//	배열로 만들기 
//	강남 건물주 
//	동석이는 강남 건물주다
//	강남빌딩 1동에 있는 1호 , 2호 , 3호 를 구매했다 
//	각 호별 월세를 입력받고 총 월세와 평균월세를 구해주는 프로그램을 만드세요
	//단 평균 월세는 백원단위까지 출력한다
	public static void main(String[] args) {
		int[] arIncome = new int[3];
		Scanner sc= new Scanner(System.in);
		int total =0;
		double avg=0.0;
		for (int i = 0; i < arIncome.length; i++) {
			System.out.println(i+1+"호 월세를 입력하세요");
			arIncome[i] = sc.nextInt();
			total +=arIncome[i];
		}
		
		avg= (double)total/arIncome.length;
		avg = Double.parseDouble(String.format("%.2f", avg));
		System.out.println("총월세 : "+total);
		System.out.println("평균월세 : "+ avg);
	}
}
