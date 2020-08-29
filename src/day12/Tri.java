package day12;

public class Tri extends Shape {
	@Override
	public double getArea(double width, double height) {
		area = width * height / 2;
		return area;
	}
}
