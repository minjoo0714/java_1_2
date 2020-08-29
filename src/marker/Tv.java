package marker;

public class Tv {
	//Animation만 출력해보기
	void checkAni(Video[] arVideo) {
		for (int i = 0; i < arVideo.length; i++) {
			if (arVideo[i] instanceof Animation) {
				System.out.println(arVideo[i].toString()+"은 애니메이션입니다.");
			}else {
				System.out.println(arVideo[i].toString()+"은 애니메이션이 아닙니다.");
			}
		}
	}
	public static void main(String[] args) {
		Video arVideo[] = {
				new Troll(), new Titanic(), new ZzangGu(), new Conan()
		}; 
		new Tv().checkAni(arVideo);
//		Tv tv = new Tv();
//		tv.checkAni(arVideo);  //위의 코드는 이두줄을 짧게 한거
	}
}
