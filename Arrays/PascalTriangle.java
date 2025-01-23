import java.util.*;
public class PascalTriangle
{
	public static int[][] generate(int numRows) {
		int[][] triangle = new int[numRows][];
		for (int i = 0; i < numRows; i++) {
			triangle[i] = new int[i + 1];

			triangle[i][0] = 1;
			triangle[i][i] = 1;

			for (int j = 1; j < i; j++) {
				triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
			}
		}
		return triangle;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int numRows = scn.nextInt();
        int[][] result = generate(numRows);
        System.out.println(Arrays.deepToString(result));
	}
}