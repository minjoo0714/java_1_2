package day04;

public class ForTask {
	public static void main(String[] args) {
		// [초급]
		
		// 100~1까지 출력
		for(int i=0; i<100; i++) {
			System.out.println(100-i);
		}
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------------");
		
		// 1~100까지 중 짝수만 출력
		for(int i=0; i<50; i++) {
			System.out.println((i+1)*2);
		}
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------------");
		
		// 1~10까지의 합 출력
		int sum=0;
		for(int i=0; i<10; i++) {
			sum+=i+1;
		}
		System.out.println(sum);
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------------");
		
		// 000111222 출력
		for(int i=0; i<9; i++) {
			System.out.print(i/3);
		}
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------------");
		
		// 012 012 012 출력(숙제)
		for(int i=0; i<9; i++) {
			System.out.print(i%3);
		}
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------------");
		// [중급]
		
		// A~F까지 출력
		for(int i=0; i<6;i++) {
			System.out.print((char)(i+65)+"\t");
		}
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------------");

		// A~F까지 중 E 제외하고 출력(5번만 반복해서 해결한다)
		for(int i=0; i<5; i++) {
			if(i==4) {i++;}
			System.out.println((char)(i+65));
		}
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------------");
		
		// A~F까지 중 B제외하고 출력(5번만 반복해서 해결한다) 
		for(int i=0; i<5; i++) {
			if(i==1) {i++;}
			System.out.println((char)(i+65));
		}//이건 질문
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------------");
		
		// aBcDeFgH....Z 출력
//		String result ="";
		for(int i=0; i<26; i++) {
			System.out.print((char)(i%2==0? i+97 : i+65));
//			result =(char)(i%2==0? i+97 : i+65);
		}
	}
}
