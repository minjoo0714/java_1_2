package day14;

public class User {
	int num;
	String name;

	public User() {}

	public User(int num, String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return this.num + this.name;
	}

	@Override
	public boolean equals(Object obj)  {
		if (obj instanceof User) {
			//User타입이면 down casting을 통해서 num을 가져온다.
			User user = (User)obj;
			//외부에서 전달된 객체의 num과 equals()에 접근한 객체의  num이 같다면 true리턴
			if (user.num == this.num ) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		// 해당 객체의 num을 해시값으로 재정의
		return this.num;
	}
}
