package by.htp.arraysofarrays.logic;

/* Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * диагональ от верхнего левого угла начиная с 1 до n , каждое умноженное на 
 * единицу больше запсанного числа 
 * Form a square matrix of order n according to a given pattern (n is even):
 *  the diagonal from the upper left corner starting from 1 to n, each multiplied 
 *  by one is greater than the written number*/

public class Task16 {

	public static void main(String[]args) {
		int n = 6;
		
		  int c = 1;
		
		    int[][]diagonalUpperLeftСorner = new int [n][n];
		
		       for(int i = 0; i< n; i++) {
			
			      for(int j = 0; j< n; j++) {
							   				
				      System.out.print(diagonalUpperLeftСorner[i][j] + " ");  			 		
			            }
			            System.out.println();
		                  }
		                   System.out.println("___________");
		
                           for(int i = 0; i< n; i++) {
			
			                    for(int j = 0; j< n; j++) {
				
				                   if(i == j)  System.out.print(((c++)*(i+2))  + " "); //*(1 + (c++))
				                   
				                     else  System.out.print(0   + " "); 			
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
//2 0 0 0 0 0 
//0 6 0 0 0 0 
//0 0 12 0 0 0 
//0 0 0 20 0 0 
//0 0 0 0 30 0 
//0 0 0 0 0 42 

		


