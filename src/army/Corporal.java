package army;

public class Corporal implements Soldier {

	@Override
	public void eat() {
		System.out.println("경치를 보며 밥을 먹는다.");
	}

	@Override
	public void sleep() {
		System.out.println("잘 잔다. 그러다 어디 데리고 간다.");
	}

	@Override
	public void work() {
		System.out.println("후임들에게 일을 맡긴다.");
	}

	@Override
	public void salute() {
		System.out.println("ㅊㅅ");
	}
}