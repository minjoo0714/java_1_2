package day06;

import java.util.Scanner;

public class ArTask {
	public static void main(String[] args) {
		//[�ʱ�]
		//1~100���� �迭�� �ֱ�
		int[] arData1= new int [100];
		for (int i = 0; i < arData1.length; i++) {
			arData1[i]= i+1;
			System.out.printf("arData1[%d] :"+arData1[i]+"\n" ,i);
		}
		System.out.println("------------------------------------------------------------------");
		//100~1���� �迭�� �ֱ�
		int[] arData2 = new int[100];
		for (int i = 0; i < arData2.length; i++) {
			arData2[i]= 100-i;
			System.out.printf("arData2[%d] :"+arData2[i]+"\n" ,i);
		}
		System.out.println("------------------------------------------------------------------");
		//1~10���� �迭�� �ְ� �� �� ���ϱ�
		int[] arData3 = new int[10];
		int sum=0;
		for (int i = 0; i < arData3.length; i++) {
			arData3[i] = i+1;
			sum= sum+(i+1);
			System.out.printf("arData3[%d] :"+arData3[i]+"\n" ,i);
		}
		System.out.println(sum);
		System.out.println("------------------------------------------------------------------");
		//1~100���� �� ¦���� �迭�� �ֱ�
		int[] arData4 = new int[50];
		for (int i = 0; i < arData4.length; i++) {
			arData4[i]=(i+1)*2;
			System.out.printf("arData4[%d] :"+arData4[i]+"\n" ,i);
		}
		System.out.println("------------------------------------------------------------------");
		//[�߱�]
		//A~F���� �� B �����ϰ� �迭�� �ֱ�
		char[] arData5= new char[5];
		int temp =0;
		for (int i = 0; i < arData5.length; i++) {
			temp=i;
			if(temp >0) {temp++;} // i==1 temp++�ϸ� �ȵǴ���?
			arData5[i] =(char)(temp+65);
			System.out.println(arData5[i]);
		}
		System.out.println("------------------------------------------------------------------");
		//0 1 2 0 1 2 0 1 2 �迭�� �ֱ�
		int[] arData6 = new int[9];
		for (int i = 0; i < arData6.length; i++) {
			arData6[i]= i%3;
			System.out.printf("arData6[%d] :"+arData6[i]+"\n" ,i);
		}
		//5���� ������ �Է¹ް� �迭�� ���� �� ����ϱ�
		/*int[] arData7 = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < arData7.length; i++) {
			System.out.println(i+1+"��° ������ �Է��ϼ���");
		arData7[i] = sc.nextInt();	
		}
		for (int i = 0; i < arData7.length; i++) {
			System.out.printf("arData7[%d] :"+arData7[i]+"\n" ,i);
		}*/
		System.out.println("------------------------------------------------------------------");
		//[���]
		//5���� ������ �Է¹ް� �ִ밪�� �ּҰ� ����ϱ�
		/*int[] arData8 = new int[5];
		int max = arData8[0];
		int min = arData8[0];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arData8.length; i++) {
			System.out.println(i+1+"��° ������ �Է��ϼ���");
			arData8[i] = sc.nextInt();
		}
		for (int i = 1; i < arData8.length; i++) {
			if(arData8[i]>max) {max=arData8[i];}
			if(arData8[i]<min) {min=arData8[i];}
		}
		System.out.println("�ִ밪 : "+max);
		System.out.println("�ּҰ� : "+min);*/
		System.out.println("------------------------------------------------------------------");
		
		//�ҹ��ڸ� �빮�ڷ� �����ϱ�
		//�Է� ��)abCdEF1234!@#$
		//��� ��)ABCDEF1234!@#$
/*		Scanner sc = new Scanner(System.in);
		String str = "";
		
		String result = "";
		
		System.out.print("���ڿ� �Է� : ");
		str = sc.next();
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c >= 97 && c <= 122) {
				result += (char)(c - 32);
			}else {
				result += c;
			}
		}
		System.out.println(result);*/
		//[�ְ��]
		//������ �ѱ۷� �ٲ㼭 ����ϱ�
		//�Է� ��)1024
		//��� ��)�ϰ��̻�
		Scanner sc = new Scanner(System.in);
		String data = "";
		System.out.print("���� : ");
		data = sc.next();
		
		String hangle = "�����̻�����ĥ�ȱ�";
		String result = "";
		for (int i = 0; i < data.length(); i++) {
			result += hangle.charAt(data.charAt(i) - 48);
		}
		System.out.println(result);
		
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		
//		System.out.print("���� : ");
//		num = sc.nextInt();
//		
//		String hangle = "�����̻�����ĥ�ȱ�";
//		String result = "";
//		
//		while(num != 0) {
//			result = hangle.charAt(num % 10) + result;
//			num /= 10;
//		}
//		
//		System.out.println(result);
	}
}
