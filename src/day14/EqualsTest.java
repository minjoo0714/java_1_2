package day14;

public class EqualsTest {
	public static void main(String[] args) {
		User han = new User(1, "¹Ú¹ÎÁÖ");
		System.out.println(han.equals(new User(1, "°øÁÖ´Ô")));
		
	}
}
