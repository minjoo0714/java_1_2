package day16;

public class ThreadTest {
	public static void main(String[] args) {
	
	//Thread Ŭ����
	Thread1 th1= new Thread1("��");
	Thread1 th2= new Thread1("��");
	//Runnable �������̽�
	Thread2 t1 = new Thread2("!");
	Thread2 t2 = new Thread2("?");
	Thread thread1 = new Thread(t1);
	Thread thread2 = new Thread(t2);
	
	
//	th1.start();
//	th2.start();
	
	thread1.start();
	thread2.start();
	
	}
}
