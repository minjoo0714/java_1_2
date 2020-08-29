package day05;

import java.util.Scanner;

public class WhileTest {
public static void main(String[] args) {
	
	String qMsg = "다음중 프로그래밍 언어가 아닌것은?\n";
	String choiceMsg = "1 java \n 2파이썬 \n 3C언어\n 4망둥어\n입력 :";
	String resultMsg ="";
	
	boolean check =false;
	
	int choice =0;
	int answer =4;
	Scanner sc=new Scanner(System.in);
	
	while (true) {
		System.out.println(qMsg+choiceMsg);
		choice = sc.nextInt();
		check = choice <4 && choice>0;
		if(choice==answer) {
			resultMsg="정답!";
		}
		else if(check) {
			resultMsg = "오답!";
		}
		else {
			resultMsg= "다시 입력해주세요";
		}
		System.out.println(resultMsg);
		if(resultMsg.equals("정답!")) {break;}
		}
	}
}

