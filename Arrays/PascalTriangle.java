/*
----problem statement-----

Given an integer numRows return the first numRows rows of Pascal's triangle.

In Pascal's triangle:
﻿﻿The first row has one element with a value of 1.
﻿﻿Each row has one more element in it than its previous row.
﻿﻿The value of each element is equal to the sum of the elements directly above it when arranged in a triangle format.

Examples:
Input: numRows = 4
Output: (11, (1, 1L (1, 2, 1L, (1, 3, 3, 1])
Explanation: 1st Row has its value set to 1.
All other cells take their value as the sum of the values directly above them

*/

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
