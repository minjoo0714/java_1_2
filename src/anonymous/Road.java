package anonymous;

public class Road {
	public static void main(String[] args) {
		Starbucks gangnam = new Starbucks();
		Starbucks jamsil = new Starbucks();

		//잠실지점은 무료나눔중이기 때문에 sell()을 구현할 필요 없다.
		//up casting과 추상 클래스로 문제 해결하기!
		//1. 추상 클래스 implements Cafe : 바디 만들기(강제성 제거)
		//2. Starbucks에 regist_free(Cafe c){} 선언(sell()은 사용하면 안된다)
		//3. Road > main메소드에서 new Cafe()가 아닌 new FreeCafe()를 호출한다.
		//    up casting(FreeCafe : 자식 값, Cafe c : 부모 타입)
		
		jamsil.regist_free(new FreeCafe() {
			@Override
			public String[] getMenu() {
				String[] arMenu = {"카페라떼", "아메리카노", "아이스티"};
				return arMenu;
			}
		});
		
		gangnam.regist(new Cafe() {
			
			@Override
			public void sell(String choice) {
				String[] arMenu = getMenu();
				for (int i = 0; i < arMenu.length; i++) {
					if(arMenu[i].equals(choice)) {
						System.out.println(choice + "판매 완료");
					}
				}
			}
			
			@Override
			public String[] getMenu() {
				String[] arMenu = {"카페라떼", "아메리카노", "모카치노", "아이스티"};
				return arMenu;
			}
		});
		
	}
}
