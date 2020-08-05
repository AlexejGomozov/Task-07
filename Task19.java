package by.htp.arraysofarrays.logic;

/* Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):    Form a square matrix of order n according to a given pattern (n is even):
 * "1" по всей ширине матрицы,  с каждой строкой "1" меньше на одну ячейку слева  "1" over the entire width of the matrix, with each row less by one cell 
 * и справа ( две в сумме)следующая строка - 2 ячейки с кажой стороны строки.     to the left and right (two in total) next row - 2 cells on each side of
 *  И так до середины матрицы. Потом от серидины идет обратное увеличение.        the row. And so on until the middle of the matrix. Then there is a reverse 
                                                                                  increase from the middle.    */
public class Task19 {

   public static void main(String[] args) {
		
	int n = 12;
		
            int count = 0;
						
		int[][]reverseIncreaseFromMiddle = new int[n][n];
		
		   for(int i= 0; i< n; i++) {
			
		       for(int j = 0; j< n; j++) {
								
		         reverseIncreaseFromMiddle[i][j] = 1;
				
			    System.out.print(reverseIncreaseFromMiddle[i][j]+ " ");			
			       }
			        System.out.println();
		                   }
		                    System.out.println("_______________________");
		
		                       for(int i= 0; i< n; i++) {   
		    	
			                  for(int j = 0; j< n; j++) {  
				  
				             if(count < (n/2)) { 
					  
					        if ((i == count & j<= i - 1 )|(i == count & j >= n-count)) {
						  
						  System.out.print(0 + " ");  } else  System.out.print(1 + " ");
					            }    		    
				                     if(count >=(n/2)) {
			  
			                               if ((i == count & j <= n -2 - i) | (i == count & j >= n - (n - count-1) ))  { 
			                	   
			                	          System.out.print(0 + " ");}else  System.out.print(1 + " ");	 
			                                    }				                            
					                      }  
			                                        count++ ;   
			  
			                                          System.out.println();
			                                            } 
	                                                              }
                                                                        }
																 
	/*			if((i == 1 & j==0 )| (i == 1 & j == n-1)) System.out.print(0 + " "); 
				
				  else if((i == 2 & j<=1)| (i == 2 & j >= n-2)) System.out.print(0 + " ");  
				
				    else if((i == 3 & j<=2)| (i == 3 & j >= n-3)) System.out.print(0 + " ");      //из этого пошагового образца делал цикл с if для матрицы квадрата любой величины 
				 
				      else if((i == 4 & j<=2)| (i == 4 & j >= n-3)) System.out.print(0 + " "); 
				
				        else if((i == 5 & j<=1)| (i == 5 & j >= n-2)) System.out.print(0 + " ");
				
				          else if((i == 6 & j==0)| (i == 6 & j == n-1)) System.out.print(0 + " ");*/
									  
			               //  else  System.out.print(1 + " ");				 
			                
//1 1 1 1 1 1 1 1 1 1 1 1 
//1 1 1 1 1 1 1 1 1 1 1 1 
//1 1 1 1 1 1 1 1 1 1 1 1 
//1 1 1 1 1 1 1 1 1 1 1 1 
//1 1 1 1 1 1 1 1 1 1 1 1 
//1 1 1 1 1 1 1 1 1 1 1 1 
//1 1 1 1 1 1 1 1 1 1 1 1 
//1 1 1 1 1 1 1 1 1 1 1 1 
//1 1 1 1 1 1 1 1 1 1 1 1 
//1 1 1 1 1 1 1 1 1 1 1 1 
//1 1 1 1 1 1 1 1 1 1 1 1 
//_______________________
//1 1 1 1 1 1 1 1 1 1 1 1 
//0 1 1 1 1 1 1 1 1 1 1 0 
//0 0 1 1 1 1 1 1 1 1 0 0 
//0 0 0 1 1 1 1 1 1 0 0 0 
//0 0 0 0 1 1 1 1 0 0 0 0 
//0 0 0 0 0 1 1 0 0 0 0 0 
//0 0 0 0 0 1 1 0 0 0 0 0 
//0 0 0 0 1 1 1 1 0 0 0 0 
//0 0 0 1 1 1 1 1 1 0 0 0 
//0 0 1 1 1 1 1 1 1 1 0 0 
//0 1 1 1 1 1 1 1 1 1 1 0 
//1 1 1 1 1 1 1 1 1 1 1 1 

