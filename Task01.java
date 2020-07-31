package by.htp.arraysofarrays.logic;

/*  Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, чтобы в одной строке была
 *  ровно одна единица, и вывести на экран.
 *    Create a 3 x 4 matrix, fill it with the numbers 0 and 1 so that there is exactly 
 *    one unit in one line, and display it. */


public class Task01 {

	public static void main(String[] args) {
		
		int[][] firstArraysOfArrays = new int [3][4];
		
		for(int i = 0; i< firstArraysOfArrays.length; i++) {
			
			for(int j = 0; j< firstArraysOfArrays[i].length; j++) {
				
				firstArraysOfArrays[i][j] = 0;
				
				firstArraysOfArrays[i][firstArraysOfArrays[i].length - 1 -i] = 1;
								
				System.out.print(firstArraysOfArrays[i][j] + ""); //(Arrays.toString(firstArraysOfArrays));								
			}
			System.out.println();
		}
		
	}
	
}
