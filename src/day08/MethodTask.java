package day08;

import java.util.Scanner;

public class MethodTask {
	//�ʱ�
	//1~10���� ����ϴ� �޼ҵ�
/*	void print1to10() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i+1);
		}
	}*/
	//1~10������ ���� ����ϴ� �޼ҵ�
/*	void printSum1to10() {
		int sum=0;
		for (int i = 0; i < 10; i++) {
			sum += i+1;
		}
		System.out.println(sum);
	}*/
	//�������� ������ �޼ҵ� // �����Բ� �ٽú���
/*	String div(int num1,  int num2) {
		String result = "";
		if (num2!=0) {
			 result = String.format("%.2f", (double)num1/num2);
		}else {
			result = "������ �����ϴ�.";
		}
		return result; 
	}*/
	//�߱�
	//Ȧ���� ¦���� ¦���� Ȧ���� �ٲ��ִ� �޼ҵ�
/*	int changeNum(int num) {
		return ++num;
	}*/
	
	// 5���� �� �� �ִ밪�� �����ִ� �޼ҵ�
/*	int getMax(int[] arData) {
		int max= arData[0];
		for(int i=1; i<arData.length; i++) {
			if(max<arData[i]) {
				max= arData[i];
			}
		}
		return max;
	}*/
	//���
	//�빮�ڸ� �ҹ��ڷ� �ٲ��ִ� �޼ҵ�
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
	//�ѱ��� ������ �ٲ��ִ� �޼ҵ�(���ڿ�.indexOf(���ڿ���))
/*	String hangle() {
		String resultmsg="";
		for(int i=0; i<inputstr.length();i++) {
			
		}
	}*/
	
	public static void main(String[] args) {
		MethodTask m= new MethodTask(); //�޼ҵ��� ��ġ�� �˷��ֱ� ���ؼ� ����
		
		//m.print1to10(); //1~10���� ����ϴ� �޼ҵ� 
		
		//m.printSum1to10(); //1~10������ ���� ����ϴ� �޼ҵ�
		
		//Scanner sc = new Scanner(System.in);
		//System.out.println("�� ������  ���ʴ�� �Է��ϼ���");
		//int num1 = sc.nextInt();
		//int num2 = sc.nextInt();
		//String resultMsg = m.div(num1, num2);
		//System.out.println(resultMsg);
		
/*		System.out.println("������ �Է��ϼ��� : ");
		int result = 0;
		result = m.changeNum(new Scanner(System.in).nextInt());
		if (result % 2 == 0) {
			System.out.println(result + "¦���� �ٲ�����ϴ�");
		} else {
			System.out.println("Ȧ���� �ٲ�����ϴ�");
		}*/
		
/*		System.out.println("5���� ������ ���ʴ�� �Է����ּ���");
		Scanner sc = new Scanner(System.in);
		int[] arData = new int[5];
		for(int i= 0; i<arData.length; i++) {
			arData[i] = sc.nextInt();
		}
		System.out.println("����ū ���� : "+m.getMax(arData));*/
		
		System.out.println("���ĺ��� �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		String inputmsg="";
		inputmsg=sc.nextLine();
		System.out.println(m.upAndDown(inputmsg));
		
	}//main
}//class
