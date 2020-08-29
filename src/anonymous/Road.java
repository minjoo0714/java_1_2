package anonymous;

public class Road {
	public static void main(String[] args) {
		Starbucks gangnam = new Starbucks();
		Starbucks jamsil = new Starbucks();

		//��������� ���ᳪ�����̱� ������ sell()�� ������ �ʿ� ����.
		//up casting�� �߻� Ŭ������ ���� �ذ��ϱ�!
		//1. �߻� Ŭ���� implements Cafe : �ٵ� �����(������ ����)
		//2. Starbucks�� regist_free(Cafe c){} ����(sell()�� ����ϸ� �ȵȴ�)
		//3. Road > main�޼ҵ忡�� new Cafe()�� �ƴ� new FreeCafe()�� ȣ���Ѵ�.
		//    up casting(FreeCafe : �ڽ� ��, Cafe c : �θ� Ÿ��)
		
		jamsil.regist_free(new FreeCafe() {
			@Override
			public String[] getMenu() {
				String[] arMenu = {"ī���", "�Ƹ޸�ī��", "���̽�Ƽ"};
				return arMenu;
			}
		});
		
		gangnam.regist(new Cafe() {
			
			@Override
			public void sell(String choice) {
				String[] arMenu = getMenu();
				for (int i = 0; i < arMenu.length; i++) {
					if(arMenu[i].equals(choice)) {
						System.out.println(choice + "�Ǹ� �Ϸ�");
					}
				}
			}
			
			@Override
			public String[] getMenu() {
				String[] arMenu = {"ī���", "�Ƹ޸�ī��", "��īġ��", "���̽�Ƽ"};
				return arMenu;
			}
		});
		
	}
}
