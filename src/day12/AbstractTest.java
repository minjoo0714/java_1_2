package day12;

public class AbstractTest {
	public static void main(String[] args) {
		
		Shape s = new Shape() {
			
			@Override
			public double getArea(double width, double height) {
				return 100;
			}
		};
		
		System.out.println(s.getArea(0, 0));
		
		
		
		Rect r = new Rect();
		System.out.println(r.getArea(5.8, 93.54));
		r.intro();
	}
}

