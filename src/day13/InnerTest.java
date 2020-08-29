package day13;

import javax.swing.JFrame;

class Out{
	private int outData = 100;
	
	public Out() {System.out.println("외부 클래스 생성자 호출");}
	
	public void printOutData() {
		System.out.println(outData);
	}
	
	class In{
		int inData = 777;
		
		public In() {System.out.println("내부 클래스 생성자 호출");}
		
		void printOutAndInData() {
			outData = 999;
			printOutData();
			System.out.println(inData);
		}
	}
}

public class InnerTest {
	public static void main(String[] args) {
		Out out = new Out();
		Out.In in = out.new In();
		
		in.printOutAndInData();
	}
}
