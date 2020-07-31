package by.htp.arraysofarrays.logic;

/* Дана матрица. Вывести на экран все четные строки, то есть с четными номерами. 
 * A matrix is given. Display all even lines, that is, with even numbers.*/

public class Task05 {

	public static void main(String[]args) {
		
		int[][]evenStrings = new int[10][9];
		
		      for(int i = 2; i< evenStrings.length;  i = i + 2 ) {
			
			    for(int j = 0; j< evenStrings[i].length; j++) {
				
				  System.out.print(evenStrings[i][j] + "");
			             }
			                 System.out.println();
						}	
						}
						}
						//000000000
						//000000000
						//000000000
						//000000000
