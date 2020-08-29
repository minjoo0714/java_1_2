package day16;

public class Zoo {
public static void main(String[] args) {
	
	Cat cat = new Cat();
	Thread c_t = new Thread(cat);
	
	Pig pig = new Pig();
	Thread p_t = new Thread(pig);
	
	Duck duck = new Duck();
	Thread d_t = new Thread(duck);
	
	c_t.start();
	p_t.start();
	
	try {
		c_t.join();
		p_t.join();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}

	d_t.start();
}
}
