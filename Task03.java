package by.htp.arraysofarrays.logic;

/* Дана матрица. Вывести на экран первый и последний столбцы. 
 * A matrix is given. Display the first and last columns.*/

public class Task03 {

	public static void main(String[] args) {
		
		int [][] matrixFirstLast = new int [4][6];
		
		     for(int i = 0; i< matrixFirstLast.length; i++) {
		
		           for (int j = 0; j < matrixFirstLast[i].length; j = j + (matrixFirstLast[i].length-1)) {
		
			        System.out.print(matrixFirstLast[i][j] + " ");						
	                           }		
		                      System.out.println();
         				}
					     }
						}
//0 0 
//0 0 
//0 0 
//0 0 
