package by.htp.arraysofarrays.logic;

/* Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):     Form a square matrix of order n according to a given pattern (n is even): the 
 *  квадрат разделен по диагонали. Одна половина "0", вторая заполнена числами.    square is divided along the diagonal. One half is "0", the other is filled with 
 *  Числа начинаются с "1"  по строке и по вертикали вверх. С каждой ячейкой в     numbers. Numbers start with "1" along the string and vertically up. With each cell 
 *  строке справа, счет начинается со следующего по порядку числа и заканчивается  in the row to the right, counting starts at the next in order and ends on the 
 *  на диагонали числом n.                                                         diagonal with n. */

public class Task21 {

  public static void main(String[]args) {
		
     int n = 10;
		
	   int count = 0;
		
		int[][] squareDividedAlongDiagonal = new int[n][n];
			
		  for(int i = 0; i< n; i++) {
			
		    for(int j = 0; j< n; j++) {
										
			  System.out.print(squareDividedAlongDiagonal[i][j] + " ");
			   }
			    System.out.println();
		             }
		              System.out.println("____________________");
		         
		
          for(int i = 0; i< n; i++) {
        	  
	     count = n - i;
			
	        for(int j = 0; j< n; j++) {
				
	           if( j<= i)  {System.out.print(count + " ");count++ ;}   
				
		      else System.out.print(0 + " ");
			}						
			 System.out.println();
	                }
                      }	
                    }

//0 0 0 0 0 0 0 0 0 0 
//0 0 0 0 0 0 0 0 0 0 
//0 0 0 0 0 0 0 0 0 0 
//0 0 0 0 0 0 0 0 0 0 
//0 0 0 0 0 0 0 0 0 0 
//0 0 0 0 0 0 0 0 0 0 
//0 0 0 0 0 0 0 0 0 0 
//0 0 0 0 0 0 0 0 0 0 
//0 0 0 0 0 0 0 0 0 0 
//0 0 0 0 0 0 0 0 0 0 
//____________________
//10 0 0 0 0 0 0 0 0 0 
//9 10 0 0 0 0 0 0 0 0 
//8 9 10 0 0 0 0 0 0 0 
//7 8 9 10 0 0 0 0 0 0 
//6 7 8 9 10 0 0 0 0 0 
//5 6 7 8 9 10 0 0 0 0 
//4 5 6 7 8 9 10 0 0 0 
//3 4 5 6 7 8 9 10 0 0 
//2 3 4 5 6 7 8 9 10 0 
//1 2 3 4 5 6 7 8 9 10 
