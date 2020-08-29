package day04;

import java.util.Scanner;

public class Quiz {
public static void main(String[] args) {
	String q1Msg = "다음 중 민주가 안 좋아하는 것 은 ? \n";
	String q2Msg = "1. 육회\n 2.육사시미\n 3초밥\n 4김치\n";
	int answer = 4;
	int choice =0;
	Boolean check =false ; 
	String result = "";
	Scanner sc = new Scanner(System.in);
	System.out.println(q1Msg+q2Msg);
	choice = sc.nextInt();
	check =choice<4&&choice>0 ;
		if (answer == choice) {
			result = "정답입니다";
		}
		else if (check) {
			result = "오답입니다";
		}
		else {
			result = "다시 입력해주세요";
		}

		System.out.println(result);
		
//	//삼항연산자
//	result = answer==choice ?"정답입니다~정답 :"+answer :
//		choice<4&&choice>0? "틀렸습니다" : "다시 입력해주세요";
//		System.out.println(result);
		// 오답 범위 질문하기
		
}
}
