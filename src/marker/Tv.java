package marker;

public class Tv {
	//Animation�� ����غ���
	void checkAni(Video[] arVideo) {
		for (int i = 0; i < arVideo.length; i++) {
			if (arVideo[i] instanceof Animation) {
				System.out.println(arVideo[i].toString()+"�� �ִϸ��̼��Դϴ�.");
			}else {
				System.out.println(arVideo[i].toString()+"�� �ִϸ��̼��� �ƴմϴ�.");
			}
		}
	}
	public static void main(String[] args) {
		Video arVideo[] = {
				new Troll(), new Titanic(), new ZzangGu(), new Conan()
		}; 
		new Tv().checkAni(arVideo);
//		Tv tv = new Tv();
//		tv.checkAni(arVideo);  //���� �ڵ�� �̵����� ª�� �Ѱ�
	}
}
