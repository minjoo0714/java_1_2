package day09;

import java.util.Scanner;

public class MethodTask {
	//��� //
		//�빮�ڸ� �ҹ��ڷ� �ٲ��ִ� �޼ҵ�
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
	//�ѱ��� ������ �ٲ��ִ� �޼ҵ�(���ڿ�.indexOf(���ڿ���))
	String changeToInteger(String hangle) {
		String hangle_org="�����̻�����ĥ�ȱ�";
		String result = "";
		for (int i = 0; i < hangle.length(); i++) {
		result += hangle_org.indexOf(hangle.charAt(i));	
		}
		return result;
	}

	
	public static void main(String[] args) {
		MethodTask m= new MethodTask();
/*		System.out.println("���ĺ��� �Է��ϼ���");
		Scanner sc= new Scanner(System.in);
		String msg= sc.nextLine();
		System.out.printf(m.ChangeUp(msg));*/
		System.out.println("\"�����̻�����ĥ�ȱ�\"���Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		String hangle =sc.nextLine();
		System.out.println(m.changeToInteger(hangle));
		//���� ����ġ�� 0�������� ����(�޼ҵ��ȯŸ������Ʈ��, ��Ʈ������ �ٲ��ָ�ٽó���)
	}
}
