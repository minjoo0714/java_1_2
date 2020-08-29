package day06;

import java.util.Scanner;

public class ArTask {
	public static void main(String[] args) {
		//[초급]
		//1~100까지 배열에 넣기
		int[] arData1= new int [100];
		for (int i = 0; i < arData1.length; i++) {
			arData1[i]= i+1;
			System.out.printf("arData1[%d] :"+arData1[i]+"\n" ,i);
		}
		System.out.println("------------------------------------------------------------------");
		//100~1까지 배열에 넣기
		int[] arData2 = new int[100];
		for (int i = 0; i < arData2.length; i++) {
			arData2[i]= 100-i;
			System.out.printf("arData2[%d] :"+arData2[i]+"\n" ,i);
		}
		System.out.println("------------------------------------------------------------------");
		//1~10까지 배열에 넣고 총 합 구하기
		int[] arData3 = new int[10];
		int sum=0;
		for (int i = 0; i < arData3.length; i++) {
			arData3[i] = i+1;
			sum= sum+(i+1);
			System.out.printf("arData3[%d] :"+arData3[i]+"\n" ,i);
		}
		System.out.println(sum);
		System.out.println("------------------------------------------------------------------");
		//1~100까지 중 짝수만 배열에 넣기
		int[] arData4 = new int[50];
		for (int i = 0; i < arData4.length; i++) {
			arData4[i]=(i+1)*2;
			System.out.printf("arData4[%d] :"+arData4[i]+"\n" ,i);
		}
		System.out.println("------------------------------------------------------------------");
		//[중급]
		//A~F까지 중 B 제외하고 배열에 넣기
		char[] arData5= new char[5];
		int temp =0;
		for (int i = 0; i < arData5.length; i++) {
			temp=i;
			if(temp >0) {temp++;} // i==1 temp++하면 안되는지?
			arData5[i] =(char)(temp+65);
			System.out.println(arData5[i]);
		}
		System.out.println("------------------------------------------------------------------");
		//0 1 2 0 1 2 0 1 2 배열에 넣기
		int[] arData6 = new int[9];
		for (int i = 0; i < arData6.length; i++) {
			arData6[i]= i%3;
			System.out.printf("arData6[%d] :"+arData6[i]+"\n" ,i);
		}
		//5개의 정수를 입력받고 배열에 넣은 후 출력하기
		/*int[] arData7 = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < arData7.length; i++) {
			System.out.println(i+1+"번째 정수를 입력하세요");
		arData7[i] = sc.nextInt();	
		}
		for (int i = 0; i < arData7.length; i++) {
			System.out.printf("arData7[%d] :"+arData7[i]+"\n" ,i);
		}*/
		System.out.println("------------------------------------------------------------------");
		//[고급]
		//5개의 정수를 입력받고 최대값과 최소값 출력하기
		/*int[] arData8 = new int[5];
		int max = arData8[0];
		int min = arData8[0];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arData8.length; i++) {
			System.out.println(i+1+"번째 정수를 입력하세요");
			arData8[i] = sc.nextInt();
		}
		for (int i = 1; i < arData8.length; i++) {
			if(arData8[i]>max) {max=arData8[i];}
			if(arData8[i]<min) {min=arData8[i];}
		}
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);*/
		System.out.println("------------------------------------------------------------------");
		
		//소문자를 대문자로 변경하기
		//입력 예)abCdEF1234!@#$
		//출력 예)ABCDEF1234!@#$
/*		Scanner sc = new Scanner(System.in);
		String str = "";
		
		String result = "";
		
		System.out.print("문자열 입력 : ");
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
		//[최고급]
		//정수를 한글로 바꿔서 출력하기
		//입력 예)1024
		//출력 예)일공이사
		Scanner sc = new Scanner(System.in);
		String data = "";
		System.out.print("정수 : ");
		data = sc.next();
		
		String hangle = "공일이삼사오육칠팔구";
		String result = "";
		for (int i = 0; i < data.length(); i++) {
			result += hangle.charAt(data.charAt(i) - 48);
		}
		System.out.println(result);
		
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		
//		System.out.print("정수 : ");
//		num = sc.nextInt();
//		
//		String hangle = "공일이삼사오육칠팔구";
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
