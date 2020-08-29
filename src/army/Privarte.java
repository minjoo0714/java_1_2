package army;

public class Privarte implements Soldier {

	@Override
	public void eat() {
		System.out.println("허리를 90도 피고 직각식사를 한다. 그러다 어디 간다.");
	}

	@Override
	public void sleep() {
		System.out.println("고향생각에 잠을 못이루다가 어디 간다.");
	}

	@Override
	public void work() {
		System.out.println("정말 열심히 하지만 결과물은 잘 안나온다. 그래서 어디 간다.");
	}

	@Override
	public void salute() {
		System.out.println("충!!!!!!!!!!!!!!!!!!!!!!!!!성!!!!!!!!!!!!!!!!!!!!!");
	}
}
