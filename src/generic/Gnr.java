package generic;

public class Gnr {
	public static void main(String[] args) {
		GenericTest<String> g = new GenericTest<>();
		GenericTest<Integer> g2 = new GenericTest<>();
		g2.setdata(10);
		g2.setdata(new Integer(10)); //╧з╫л
		g.setdata("╬хЁГ");
		System.out.println(g.getdata());
		System.out.println(g2.getdata());
		System.out.println("--------------------");
		System.out.println(GTest2.function(3.9)); //Double
		System.out.println(GTest2.function(3.9F)); //Float 
		System.out.println(GTest2.function(10));
		System.out.println(GTest2.function("╧з╧наж"));
		System.out.println(GTest2.function('J'));
		
		System.out.println("---------");
		
	}
}
