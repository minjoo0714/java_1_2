package day11;

public class Student {
	private static int seq;
	private int num;
	private String name;

	public Student() {}
	
	public Student(String name) {
		super();
		this.num = ++seq;
		this.name = name;
	}
	
	public static int getSeq() {
		return seq;
	}

	public static void setSeq(int seq) {
		Student.seq = seq;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Student[] 학생들 = {
				new Student("한동석"),
				new Student("홍길동"),
				new Student("이순신"),
				new Student("강감찬")
		};
		
		for (int i = 0; i < 학생들.length; i++) {
			System.out.println(학생들[i].getNum()); //코드가 이해가 잘 안됨 
		}
		System.out.println("학생 총합 : " + Student.seq + "명");
	}
}