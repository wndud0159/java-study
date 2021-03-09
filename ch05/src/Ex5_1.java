// 2차원 배열 예제
public class Ex5_1 {
	public static void main(String[] args) {
		//2차원 배열안의 값의 합 구하기
		int[][] score = {
				{100, 100, 100}
				,{20, 20, 20}
				,{30, 30, 30}
				,{40, 40, 40}
		};
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
			}
		}
		System.out.println("sum : " + sum);
	}
}
