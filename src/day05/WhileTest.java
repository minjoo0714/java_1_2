package day05;

import java.util.Scanner;

public class WhileTest {
public static void main(String[] args) {
	
	String qMsg = "������ ���α׷��� �� �ƴѰ���?\n";
	String choiceMsg = "1 java \n 2���̽� \n 3C���\n 4���վ�\n�Է� :";
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
			resultMsg="����!";
		}
		else if(check) {
			resultMsg = "����!";
		}
		else {
			resultMsg= "�ٽ� �Է����ּ���";
		}
		System.out.println(resultMsg);
		if(resultMsg.equals("����!")) {break;}
		}
	}
}

