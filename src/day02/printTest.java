package day02;

public class printTest {
	public static void main(String[] args) {
		int data1 = 10;
		float data2 = 10.49f;
		double data3 = 10.49;
		char data4 = 'a';
		String data5 = "abc";
		
		System.out.printf("data1 (10����)\t:%d\n",data1);
		System.out.printf("data2 (8����)\t:%.2f\n",data2);
		System.out.printf("data2 (8����)\t:%.1f\n",data2);
		
		System.out.printf("data1 (8����)\t:%o\n",data1);
		System.out.printf("data1 (16����)\t:%x\n",data1);
		System.out.printf("data1 (10����)\t:%X\n",data1);//X �빮�ڷ� ���� �빮�ڷ� ���� 
		System.out.println(data4);
		System.out.println(data5);
	}
}
