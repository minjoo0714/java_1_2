package anonymous;

public class Starbucks {
	
	public void regist_free(Cafe c) {
		String[] arMenu = c.getMenu();
		
		System.out.println("�� ����!");
		
		System.out.println("=======�޴���=======");
		for (int i = 0; i < arMenu.length; i++) {
			System.out.println(arMenu[i]);
		}
		System.out.println("�� �޴� ���� ������!");
	}
	
	public void regist(Cafe c) {
		String[] arMenu = c.getMenu();
		
		System.out.println("�� ����!");
		
		System.out.println("=======�޴���=======");
		for (int i = 0; i < arMenu.length; i++) {
			System.out.println(arMenu[i]);
		}
		c.sell("�Ƹ޸�ī��");
	}
}

