package day14;

public class ForTask {
	public static void main(String[] args) {
		int[][] arrScore = { 
				{ 10, 20, 30 }, 
				{ 11, 25, 39 }, 
				{ 12, 26, 38 },
				{ 13, 27, 37 }, 
				{ 14, 28, 36 } 
				};
		
		int idx = 0;
		for (int[] arScore : arrScore) {
			int total = 0;
			for (int score : arScore) {
				total += score;
			}
			double avg = Double.parseDouble(String.format
					("%2f", (double) total / arrScore.length));
			idx++;
			System.out.println(idx + "번 학생 총점 : " + total + "점");
			System.out.println(idx + "번 학생 평균 : " + avg + "점");
		}

	}
}
