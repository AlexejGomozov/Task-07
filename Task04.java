package by.htp.arraysofarrays.logic;

/* Дана матрица. Вывести на экран первую и последнюю строки. 
 * A matrix is given. Display the first and last lines. */

  public class Task04 {

	 public static void main(String[] args) {
		
		int[][] firstLastStrings = new int [3][5];
		
		      for (int i = 0; i< firstLastStrings.length; i = i + (firstLastStrings.length-1)) {
			
			     for(int j = 0; j< firstLastStrings[i].length; j++) {
				
				   System.out.print(firstLastStrings[i][j] + "");
			
			                  }
			                   System.out.println();
		                             }		
	                                       }
                                                 }
						//00000
						//00000
