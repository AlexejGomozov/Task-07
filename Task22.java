package by.htp.arraysofarrays.logic;

/* Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):    Form a square matrix of order n according to a given pattern (n is even):
 * квадрат разделен по диагонали. Одна половина "0", вторая заполнена числами.    the square is divided along the diagonal. One half is "0", the other
 * Числа начинаются с "1"  по строке и по вертикали вниз. С каждой ячейкой в      is filled with numbers. Numbers start with "1" along the line and vertically  
 * строке справа, счет начинается со следующего по порядку числа и заканчивается   down. With each cell in the row to the right, counting starts at the next 
 * на диагонали числом n.  														   in order and ends on the diagonal with n. */

  public class Task22 {

	 public static void main(String[] args) {
		
		int n = 8;
		
		  int[][]squareDividedAlongDiagonalVerticallyDown = new int[n][n];
		
		     for(int i = 0; i< n; i++) {
			
			   for(int j = 0; j< n; j++) {
				
				 System.out.print(squareDividedAlongDiagonalVerticallyDown[i][j] + " ");
			      }
			       System.out.println();
		            }
		             System.out.println("_______________");
		
		
       for(int i = 0; i< n; i++) {
			
    	  int count = i + 1;
    	  
			for(int j = 0; j< n; j++) {
				
			   if(i <= n-j-1)	{
				
				 System.out.print(count + " ");
				
				   count++;
				    }			
			         else System.out.print(0 + " ");
			           }
			           System.out.println();		
	                }	
                  }
                }
  //0 0 0 0 0 0 0 0 
  //0 0 0 0 0 0 0 0 
  //0 0 0 0 0 0 0 0 
  //0 0 0 0 0 0 0 0 
  //0 0 0 0 0 0 0 0 
  //0 0 0 0 0 0 0 0 
  //0 0 0 0 0 0 0 0 
  //0 0 0 0 0 0 0 0 
  //_______________
  //1 2 3 4 5 6 7 8 
  //2 3 4 5 6 7 8 0 
  //3 4 5 6 7 8 0 0 
  //4 5 6 7 8 0 0 0 
  //5 6 7 8 0 0 0 0 
  //6 7 8 0 0 0 0 0 
  //7 8 0 0 0 0 0 0 
  //8 0 0 0 0 0 0 0 