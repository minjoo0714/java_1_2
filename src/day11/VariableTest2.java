package day11;

public class VariableTest2 {
	public static void main(String[] args) {
		VariableTest1 v1 = new VariableTest1();
		VariableTest1 v2 = new VariableTest1();
		
		v1.data_s = 100; //static�� ����?�ּҸ�? ������ 
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
		
		v1 = new VariableTest1(); //�ʱ�ȭO //static�� �ƴϴϱ�?
		
		v1.increase();
		v1.increase();
		v1.increase();
		v1.increase();
		System.out.println("-----------");
		v2.increase_s();
		v2.increase_s();
		v2.increase_s();
		v2 = new VariableTest1(); //�ʱ�ȭX //staric�̴ϱ� ?
		v2.increase_s();
		
	}
}
