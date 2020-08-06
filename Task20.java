package by.htp.arraysofarrays.logic;

/* Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):    Form a square matrix of order n according to a given pattern (n is even):
 *  "0" по всей ширине матрицы,  начиная с первой строки (кроме ячеек "первая"    "0" over the entire width of the matrix, starting from the first row 
 *  и "последняя") с каждой строкой "0" меньше с обеих сторон, слева  и справа .  (except for the cells "first" and "last") with each row "0" less on 
 *  И так до середины матрицы( таким образом, что это напоминает песочные часы).   both sides, left and right . And so on until the middle of the matrix 
 *  Потом от середины идет обратное увеличение "0".  В остальных ячейках "1".      (in such a way that it look likes an hourglass). Then from the middle 
                                  											     	there is a reverse increase of "0". The rest of the cells are "1". */ 
           
public class Task20 {

	public static void main(String[]args) {
		
		int n = 10;
		
		  int count = 0;
		
		     int[][] lookLikesHourglass = new int [n][n];
		
		        for(int i = 0; i< n; i++) {
			
			       for(int j = 0; j< n; j++) {
				
				     lookLikesHourglass[i][j] = 1;
				
				        System.out.print(lookLikesHourglass[i][j] + " ");
			             }
			              System.out.println();
		                   }
		                    System.out.println("___________________");
		
				
		  for(int i = 0; i< n; i++) {
			
			 for(int j = 0; j< n; j++) {
				
				if(count< n/2) {
					
					if (i == count & j >= i +1 & j <= n - i - 2) System.out.print(0 + " "); 
					
					  else System.out.print(1 + " ");
					   } 				
					    if(count >= n/2) {
						
						  if( i == count & j >= (n-count)  & j <= (n - (n - count +1)))  System.out.print(0 + " "); 
						
						    else System.out.print(1 + " ");
						     } 				
			                  }
			                   count++;
			
			                     System.out.println();
		                     }		
	                        }
                           }
//1 1 1 1 1 1 1 1 1 1 
//1 1 1 1 1 1 1 1 1 1 
//1 1 1 1 1 1 1 1 1 1 
//1 1 1 1 1 1 1 1 1 1 
//1 1 1 1 1 1 1 1 1 1 
//1 1 1 1 1 1 1 1 1 1 
//1 1 1 1 1 1 1 1 1 1 
//1 1 1 1 1 1 1 1 1 1 
//1 1 1 1 1 1 1 1 1 1 
//1 1 1 1 1 1 1 1 1 1 
//___________________
//1 0 0 0 0 0 0 0 0 1 
//1 1 0 0 0 0 0 0 1 1 
//1 1 1 0 0 0 0 1 1 1 
//1 1 1 1 0 0 1 1 1 1 
//1 1 1 1 1 1 1 1 1 1 
//1 1 1 1 1 1 1 1 1 1 
//1 1 1 1 0 0 1 1 1 1 
//1 1 1 0 0 0 0 1 1 1 
//1 1 0 0 0 0 0 0 1 1 
//1 0 0 0 0 0 0 0 0 1 
