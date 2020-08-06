package by.htp.arraysofarrays.logic;

/*  Получить квадратную матрицу порядка n:            				     Get a square matrix of order n: on a new line, each element is 
 *  в новой строке каждый элемент умножаем на множетель равный номеру строки + 1     multiplied by a multiplier equal to the line number  + 1.   */
                                                                                  

          public class Task25 {

	     public static void main(String[] args) {
		
		int n = 5;
		
		  int[][]multiplierEqualLineNumber = new int[n][n];
		
		     for(int i = 0; i< n; i++) {
			
			 int increase = 1;
			
			    for(int j = 0; j< n; j++) {
				
			    	multiplierEqualLineNumber[i][j] = increase++; 
				
				   System.out.print(multiplierEqualLineNumber[i][j] * (i+1) + "   ");				
			             }			
			              System.out.println();
		                    }				
	                          }
	                        }

//1   2   3   4   5   
//2   4   6   8   10   
//3   6   9   12   15   
//4   8   12   16   20   
//5   10   15   20   25   
