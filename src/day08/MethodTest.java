package day08;

public class MethodTest {
	// f(x) = 2x+1; �����
	//static int f(int x){ // Ŭ���� �ȿ� �־���� //static�� ���� �޸� ���� ���� �ִ� 
	int plus(int x) {
		int result = 2*x+1;
		return result ;
	}
	
	int add(int num1, int num2) {
		System.out.println("add �޼ҵ� �Դϴ�.");
		return num1+num2;
	}
	public static void main(String[] args) {
		// main�޼ҵ�� �������α׷��� ������ش�
		//static: �����Ͻ� �������  �޸𸮿� �ö󰡰� ���ִ� Ű���� // ���ڰ� �����ִ� ���� : ����ƽ�̶�
		MethodTest m = new MethodTest();// �Ҽ��� �˷������	
		int plusResult = m.plus(5);
		System.out.println(plusResult);
		
		System.out.println(m.add(5, 7));
	}
}
