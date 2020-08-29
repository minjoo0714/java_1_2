package day12;

public class ClassArray {
	
	public ClassArray() {
		super();
	}
	
	public static void main(String[] args) {
		Object[] arData = {1, "박민주", 10.89, 'v'};//배열과 클래스의 차이 //모든 클래스는 오브젝트 상속
		
		for (int i = 0; i < arData.length; i++) {
			System.out.println(arData[i]);
		}
	}
}