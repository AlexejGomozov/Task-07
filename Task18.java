package by.htp.arraysofarrays.logic;

/* Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * чтобы элементы строки были рывны порядковому номеру по всей длинне строки. 
 * Form a square matrix of order n according to the given pattern (n is even):
 * so that the elements of the row are equal to the row number along the entire length of the row.*/

public class Task18 {

  public static void main (String[]args) {
		
      int n = 5;
		
	 int count = 1;
		
	    int [][] elementsRowEqualRowNumber = new int[n][n];
		
	       for(int i = 0; i< n; i++) {
			
		  for(int j = 0; j< n; j++) {
				
		     System.out.print(elementsRowEqualRowNumber[i][j] + " ");				
		       }
			 System.out.println();
		            }
		             System.out.println("_________");
		
                                for(int i = 0; i< n; i++) {
			
			           for(int j = 0; j< n; j++) {
						
			              if(i== (count - 1)) {System.out.print(count + " ");	count ++;}
				
				          else System.out.print(count - 1 + " ");
			                     }
			                      System.out.println();
		                                }	
	                                         }	
                                                   }
//0 0 0 0 0 
//0 0 0 0 0 
//0 0 0 0 0 
//0 0 0 0 0 
//0 0 0 0 0 
//_________
//1 1 1 1 1 
//2 2 2 2 2 
//3 3 3 3 3 
//4 4 4 4 4 
//5 5 5 5 5 
