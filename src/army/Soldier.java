package army;

public interface Soldier {
	final static int arm = 2;
	int leg = 2; //final static �� �����Ǿ����� 
	
	abstract void eat(); 	//�������̽��ȿ��� �߻�޼ҵ尡 ������ 
	void sleep(); 				//abstract �� ���������ϴ�.
	void work();					//����Ҷ� ������ �������ؼ� ����ϰ� �Ǿ����� 
	void salute();
	
}
