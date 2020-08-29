package day02;

public class CastingForString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int data1 = 10;
		float data2 = 10.59F;
		double data3 = 10.5;
		char data4 = 'A';
		String data5 = "ABC";
		
		System.out.println("data1 : " + data1);		
		System.out.println("1+1=" + (1 + 1));
		System.out.println("1+1=" + 1 + 1);
		
		//실습
		//3개의 값 중 한 개를 옮겨서 2로 출력하기
		System.out.println("" + 1 + 1);
		System.out.println(1 + 1 + "");
/*
		String data1 = "1";
		String data2 = "3";
	//	String data2 = 3 + "";
		
		int num1 = Integer.parseInt(data1);
		int num2 = Integer.parseInt(data2);
		int result = num1 + num2;
		//연결과 연산
		//문자열이 포함되어 있다면 연결!
		//문자열이 없다면 연산!
		System.out.println(result);
*/
		
	}

}
