package day11;

public class VariableTest2 {
	public static void main(String[] args) {
		VariableTest1 v1 = new VariableTest1();
		VariableTest1 v2 = new VariableTest1();
		
		v1.data_s = 100; //static은 값을?주소를? 공유함 
		v1.data = 100;
		
		System.out.println(v2.data_s);//100
		System.out.println(v1.data_s);//100
		System.out.println(v1.data);//100
		System.out.println(v2.data);//10 
		
		System.out.println("-----------");
		
	//	VariableTest1 v1 = new VariableTest1();
		
		v1.increase();
		v1.increase();
		v1.increase();
		v1.increase();
		
		v1 = new VariableTest1(); //초기화O //static이 아니니까?
		
		v1.increase();
		v1.increase();
		v1.increase();
		v1.increase();
		System.out.println("-----------");
		v2.increase_s();
		v2.increase_s();
		v2.increase_s();
		v2 = new VariableTest1(); //초기화X //staric이니까 ?
		v2.increase_s();
		
	}
}
