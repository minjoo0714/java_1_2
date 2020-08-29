package day08;

public class MethodTest {
	// f(x) = 2x+1; 만들기
	//static int f(int x){ // 클래스 안에 있어야함 //static을 쓰면 메모리 제일 위에 있다 
	int plus(int x) {
		int result = 2*x+1;
		return result ;
	}
	
	int add(int num1, int num2) {
		System.out.println("add 메소드 입니다.");
		return num1+num2;
	}
	public static void main(String[] args) {
		// main메소드는 실행프로그램을 만들어준다
		//static: 컴파일시 가장먼저  메모리에 올라가게 해주는 키워드 // 글자가 누워있는 이유 : 스태틱이라서
		MethodTest m = new MethodTest();// 소속을 알려줘야함	
		int plusResult = m.plus(5);
		System.out.println(plusResult);
		
		System.out.println(m.add(5, 7));
	}
}
