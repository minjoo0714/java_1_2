package day12;

public class ClassArray {
	
	public ClassArray() {
		super();
	}
	
	public static void main(String[] args) {
		Object[] arData = {1, "�ڹ���", 10.89, 'v'};//�迭�� Ŭ������ ���� //��� Ŭ������ ������Ʈ ���
		
		for (int i = 0; i < arData.length; i++) {
			System.out.println(arData[i]);
		}
	}
}