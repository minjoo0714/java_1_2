package day12;

public abstract class Shape {
	public double area;
	
	public final void intro() { //final 은 재정의 안됨 
		System.out.println("난 도형이야");
	}
	
	public abstract double getArea(double width, double height);
}