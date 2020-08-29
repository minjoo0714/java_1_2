package day11;

public class VariableTest1 {
	public int data = 10;
	public static int data_s = 10;
	
	public void increase() {
		System.out.println(++data);
	}
	
	public static void increase_s() {
		System.out.println(++data_s);
	}
	
}
