package day13;

import java.util.Scanner;

public class ExceptionTask {

	public static void main(String[] args) {
		int[] arData = new int[5];
		Scanner sc = new Scanner(System.in);
		int data =0;
		String temp="";
		while(true) {
			System.out.println(++data+"° �������� �Է����ּ���[q : ����]  ");
			temp = sc.next();
			if (temp.equals("q")) {
				System.out.println("�߰��� �����մϴ�. ");
				break; 
			}
			try {
				arData[--data]= Integer.parseInt(temp);
				System.out.println("�߰�����");
				data++;
			} catch (NumberFormatException e) {
//				System.out.println(e);
				System.out.println("���� �Ǵ� 'q'�� �Է°����մϴ�.");
			}catch(ArrayIndexOutOfBoundsException e) {
//				System.out.println(e);
				System.out.println("������ 5�������� �Է°����մϴ�.");
				System.out.println("�����մϴ�");
				break;
			}
		}
	}
}
