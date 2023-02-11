package javaAdvancePractice;

public class TwoDimensionArrayTrans {

	public static void main(String[] args) {
		int[][] original = { {1,2}, {3,4}, {5,6}, {7,8} };
		int[][] revised = new int[2][4];
		// trans i<->j
		for ( int i = 0; i < original.length; i++ ) {
			for ( int j = 0; j<original[i].length; j++ ) {
				revised[j][i] = original[i][j];
			}
		}
		// print revised array by foreach loop
		for ( int[] firstLayer:revised ) {
			for ( int valueUnderFirstLayer:firstLayer ) {
				System.out.print(valueUnderFirstLayer + ", ");
			}
			System.out.println();
		}
		
	}

}
