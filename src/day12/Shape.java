package day12;

public abstract class Shape {
	public double area;
	
	public final void intro() { //final �� ������ �ȵ� 
		System.out.println("�� �����̾�");
	}
	
	public abstract double getArea(double width, double height);
}