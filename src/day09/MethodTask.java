package day09;

import java.util.Scanner;

public class MethodTask {
	//고급 //
		//대문자를 소문자로 바꿔주는 메소드
/*	String ChangeUp(String msg) {
		String resultMsg="";
		for (int i = 0; i < msg.length(); i++) {
			char c=msg.charAt(i);
		if(c>=97&&c<=122) {
			c= (char)(c-32);
		}
		else if(c>=65&&c<=90) {
			c=(char)(c+32);
		}
		resultMsg+=c;
		}
		return resultMsg;
	}*/
	//한글을 정수로 바꿔주는 메소드(문자열.indexOf(문자열값))
	String changeToInteger(String hangle) {
		String hangle_org="공일이삼사오육칠팔구";
		String result = "";
		for (int i = 0; i < hangle.length(); i++) {
		result += hangle_org.indexOf(hangle.charAt(i));	
		}
		return result;
	}

	
	public static void main(String[] args) {
		MethodTask m= new MethodTask();
/*		System.out.println("알파벳을 입력하세요");
		Scanner sc= new Scanner(System.in);
		String msg= sc.nextLine();
		System.out.printf(m.ChangeUp(msg));*/
		System.out.println("\"공일이삼사오육칠팔구\"를입력하세요");
		Scanner sc = new Scanner(System.in);
		String hangle =sc.nextLine();
		System.out.println(m.changeToInteger(hangle));
		//공을 먼저치면 0은나오지 않음(메소드반환타입이인트라서, 스트링으로 바꿔주면다시나옴)
	}
}
