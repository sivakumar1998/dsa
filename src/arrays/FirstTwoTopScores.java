package arrays;

public class FirstTwoTopScores {
	public static void main(String[] args) {

	}

	public static int[] topTwoScores(int arr[]) {
		int firstHighScore = Integer.MIN_VALUE;
		int secondHighScore = Integer.MIN_VALUE;
		for (int score : arr) {
			if (score > firstHighScore) {
				secondHighScore = firstHighScore;
				firstHighScore = score;
			} else if (score > secondHighScore && score < firstHighScore) {
				secondHighScore = score;
			}
		}
		return new int[] { firstHighScore, secondHighScore };
	}
}
