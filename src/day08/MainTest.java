package day08;

public class MainTest {
	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("NONE");
		}else {
			for (int i = 0; i < args.length; i++) {
				System.out.println(args[i]);
			}
		}
	}
}
