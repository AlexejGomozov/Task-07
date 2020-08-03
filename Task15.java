package by.htp.arraysofarrays.logic;

/* Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * диагональ из правого верхнего угла , начиная от n и до 1 
 *    Form a square matrix of order n according to a given pattern (n is even):
 *    diagonal from the upper right corner, starting from n to 1*/

public class Task15 {

  public static void main (String[]args) {
		
     int n = 6;
		
         int c = n;
		
	    int [][] diagonalUpperRightCorner = new int[n][n];
		
	       for (int i = 0; i< n; i++) {
			
	          for(int j = 0; j< n; j++) {
				
		      System.out.print(diagonalUpperRightCorner[i][j] + " ");
			  }
			   System.out.println();
		             }
		              System.out.println("___________");
	
	                         for (int i = 0; i< n; i++) {
		
		                     for(int j = 0; j< n; j++) {
			
			                if (i == j) System.out.print(c-- + " ");
			
			                   else System.out.print(0 + " ");
		                             }
		                              System.out.println();
	                                        }
                                                  }
                                                    }
//0 0 0 0 0 0 
//0 0 0 0 0 0 
//0 0 0 0 0 0 
//0 0 0 0 0 0 
//0 0 0 0 0 0 
//0 0 0 0 0 0 
//___________
//6 0 0 0 0 0 
//0 5 0 0 0 0 
//0 0 4 0 0 0 
//0 0 0 3 0 0 
//0 0 0 0 2 0 
//0 0 0 0 0 1 
