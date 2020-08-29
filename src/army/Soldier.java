package army;

public interface Soldier {
	final static int arm = 2;
	int leg = 2; //final static 이 생략되어있음 
	
	abstract void eat(); 	//인터페이스안에는 추상메소드가 있으며 
	void sleep(); 				//abstract 는 생략가능하다.
	void work();					//사용할때 무조건 재정의해서 사용하게 되어있음 
	void salute();
	
}
