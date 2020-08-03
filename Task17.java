package by.htp.arraysofarrays.logic;

/*  Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * чтобы по периметру квадрата шли ячейки с единицами 
 *   Form a square matrix of order n according to a given pattern (n is even): 
 *   so that cells with "1" go along the perimeter of the square */

 public class Task17 {
	 
     public static void main(String[]args) {
		
	int n = 5;
		
            int per = 1;
		
		int [][] goAlongPerimeter = new int[n][n];
		
		    for (int i = 0; i< n; i++) {
			
			for(int j = 0; j< n; j++) {
				
		            System.out.print(goAlongPerimeter[i][j] + " ");											
			       }
			        System.out.println();
		                  }
		                    System.out.println("_________");
		
                                       for (int i = 0; i< n; i++) {
			
			                   for(int j = 0; j< n; j++) {
										
				               if(i == 0)    System.out.print(per + " ");  //if(i == 0 & i == (n-1) & j == 0 & j == (n-1))
				
				                  else if(i == n-1)    System.out.print(per + " ");
				   
				                     else if(j == n-1)    System.out.print(per + " ");
				
				                        else if(j == 0)    System.out.print(per + " ");
				
				                          else  System.out.print(0 + " ");
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
//1 0 0 0 1         КРАСОТА!!)
//1 0 0 0 1 
//1 0 0 0 1 
//1 1 1 1 1 
