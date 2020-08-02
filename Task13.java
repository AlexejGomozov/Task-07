package by.htp.arraysofarrays.logic;

/* Сформировать квадратную матрицу порядка n по заданному образцу(n - четное): 
 * первая строка от 1 до n, вторая наоборот от n до 1 и так до конца(последняя строка от n до 1)
 *   Form a square matrix of order n according to a given pattern (n is even): the first row is 
 *   from 1 to n, the second, on the contrary, is from n to 1 and so on until the end 
 *   (the last row is from n to 1)*/

public class Task13 {
	
	public static void main(String[]args) {
			
		int n = 6;
						
			int c = 0;
			
			    int[][]reverseLines = new int [n][n];
			
			       for(int i = 0; i< n; i++) {
			    	   
				     c = 0;
				
				      for(int j = 0; j< n; j++) {
					
				    	if(i==0 | i%2==0)  { reverseLines[i][j] = c + 1; c++;
					
					      System.out.print(reverseLines[i][j] + " ");  }
					      
				    	     else {reverseLines[i][j] = n  - c; c++;
				    	
				    	    	System.out.print(reverseLines[i][j] + " "); }
				                  }
				                   System.out.println();
			                         }		                  
									   }	
									    }

//1 2 3 4 5 6 
//6 5 4 3 2 1 
//1 2 3 4 5 6 
//6 5 4 3 2 1 
//1 2 3 4 5 6 
//6 5 4 3 2 1 
