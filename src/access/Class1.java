package access;

class Class2{
	void getData() {
		Class1 c1 = new Class1();
	}
}

public class Class1 {
	int data1 = 10;
	public int data2 = 20;
	protected int data3 = 30;
	private int data4 = 40;
	//alt + shift + s + r
	//변수 선택 후 엔터
	public int getData4() {
		return data4;
	}

	public void setData4(int data4) {
		this.data4 = data4;
	}



	void getData() {
		System.out.println(data1);
	}
}







