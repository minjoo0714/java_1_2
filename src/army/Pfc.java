package army;

public class Pfc implements Soldier {

	@Override
	public void eat() {
		System.out.println("후임 식판과 선임 식판을 보며 식사한다.");
	}

	@Override
	public void sleep() {
		System.out.println("어디 간다.");
	}

	@Override
	public void work() {
		System.out.println("열심히 하며 결과물도 좋다. 후임도 알려주면서 일한다.");
	}

	@Override
	public void salute() {
		System.out.println("충!성!");
	}

}
