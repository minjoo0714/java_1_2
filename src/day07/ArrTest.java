package day07;

public class ArrTest {
	public static void main(String[] args) {
		int[][] arrData = new int[2][3];
		int cnt =0;
		for (int i = 0; i < arrData.length; i++) {
			for (int j = 0; j < arrData[i].length; j++) {
				arrData[i][j] = ++cnt;
				System.out.print(arrData[i][j]);
			}
			System.out.print("\n");
		}
	}
}
/*int cnt = 0;
for (int i = 0; i < arrData.length; i++) {
	for (int j = 0; j < arrData[i].length; j++) {
		arrData[i][j] = ++ cnt; 
	}
}

for (int i = 0; i < arrData.length; i++) {
	for (int j = 0; j < arrData[i].length; j++) {
		System.out.print(arrData[i][j]);
	}
	System.out.println();
} �̰Ÿ� ���� ������ ������ ����� �����ؼ� �ݺ����� ����� ����? */