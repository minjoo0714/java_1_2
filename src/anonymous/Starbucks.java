package anonymous;

public class Starbucks {
	
	public void regist_free(Cafe c) {
		String[] arMenu = c.getMenu();
		
		System.out.println("축 개업!");
		
		System.out.println("=======메뉴판=======");
		for (int i = 0; i < arMenu.length; i++) {
			System.out.println(arMenu[i]);
		}
		System.out.println("전 메뉴 무료 나눔중!");
	}
	
	public void regist(Cafe c) {
		String[] arMenu = c.getMenu();
		
		System.out.println("축 개업!");
		
		System.out.println("=======메뉴판=======");
		for (int i = 0; i < arMenu.length; i++) {
			System.out.println(arMenu[i]);
		}
		c.sell("아메리카노");
	}
}

