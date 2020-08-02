package by.htp.arraysofarrays.logic;

/* Получить квадратную матрицу порядка n: чтоб по диагонали было 0, 1, 2, .... n-1. Остальные нули. 
 * Get a square matrix of order n: so that the diagonal is 0, 1, 2, .... n-1. The rest are zeros.*/ 


public class Task12 {

	public static void main(String[]args) {
		
		int n = 6;
					
		  int c = 0;
		
		    int[][]diagonal = new int [n][n];
		
		       for(int i = 0; i< n; i++) {
			
			      for(int j = 0; j< n; j++) {
				
				    diagonal[i][j] = 0;
				
				      System.out.print(diagonal[i][j] + " ");  			 		
			            }
			            System.out.println();
		                  }
		                   System.out.println("___________");
		
                             for(int i = 0; i< n; i++) {
			
			                    for(int j = 0; j< n; j++) {
				
				                   if(i == j)  System.out.print(c++   + " "); 
				                   
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
//0 0 0 0 0 0 
//0 1 0 0 0 0 
//0 0 2 0 0 0 
//0 0 0 3 0 0 
//0 0 0 0 4 0 
//0 0 0 0 0 5 
