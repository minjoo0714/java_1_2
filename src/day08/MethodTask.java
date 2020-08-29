package day08;

import java.util.Scanner;

public class MethodTask {
	//초급
	//1~10까지 출력하는 메소드
/*	void print1to10() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i+1);
		}
	}*/
	//1~10까지의 합을 출력하는 메소드
/*	void printSum1to10() {
		int sum=0;
		for (int i = 0; i < 10; i++) {
			sum += i+1;
		}
		System.out.println(sum);
	}*/
	//두정수의 나눗셈 메소드 // 선생님꺼 다시보기
/*	String div(int num1,  int num2) {
		String result = "";
		if (num2!=0) {
			 result = String.format("%.2f", (double)num1/num2);
		}else {
			result = "나눌수 없습니다.";
		}
		return result; 
	}*/
	//중급
	//홀수면 짝수로 짝수면 홀수로 바꿔주는 메소드
/*	int changeNum(int num) {
		return ++num;
	}*/
	
	// 5개의 값 중 최대값을 구해주는 메소드
/*	int getMax(int[] arData) {
		int max= arData[0];
		for(int i=1; i<arData.length; i++) {
			if(max<arData[i]) {
				max= arData[i];
			}
		}
		return max;
	}*/
	//고급
	//대문자를 소문자로 바꿔주는 메소드
String upAndDown(String inputstr) {
		String resultmsg="";
		for(int i=0; i<inputstr.length(); i++) {
			char c = inputstr.charAt(i);
		if(c>=65 && c<=90) {
			resultmsg +=(char)(c+32);
		}else if (c >= 97 && c <= 122) {
			resultmsg+= (char)(c-32);
		}
		}
		return resultmsg;
	}
	//한글을 정수로 바꿔주는 메소드(문자열.indexOf(문자열값))
/*	String hangle() {
		String resultmsg="";
		for(int i=0; i<inputstr.length();i++) {
			
		}
	}*/
	
	public static void main(String[] args) {
		MethodTask m= new MethodTask(); //메소드의 위치를 알려주기 위해서 선언
		
		//m.print1to10(); //1~10까지 출력하는 메소드 
		
		//m.printSum1to10(); //1~10까지의 합을 출력하는 메소드
		
		//Scanner sc = new Scanner(System.in);
		//System.out.println("두 정수를  차례대로 입력하세요");
		//int num1 = sc.nextInt();
		//int num2 = sc.nextInt();
		//String resultMsg = m.div(num1, num2);
		//System.out.println(resultMsg);
		
/*		System.out.println("정수를 입력하세요 : ");
		int result = 0;
		result = m.changeNum(new Scanner(System.in).nextInt());
		if (result % 2 == 0) {
			System.out.println(result + "짝수로 바뀌었습니다");
		} else {
			System.out.println("홀수로 바뀌었습니다");
		}*/
		
/*		System.out.println("5개의 정수를 차례대로 입력해주세요");
		Scanner sc = new Scanner(System.in);
		int[] arData = new int[5];
		for(int i= 0; i<arData.length; i++) {
			arData[i] = sc.nextInt();
		}
		System.out.println("가장큰 값은 : "+m.getMax(arData));*/
		
		System.out.println("알파벳을 입력하세요");
		Scanner sc = new Scanner(System.in);
		String inputmsg="";
		inputmsg=sc.nextLine();
		System.out.println(m.upAndDown(inputmsg));
		
	}//main
}//class
