package by.htp.arraysofarrays.logic;

/* Сформировать квадратную матрицу порядка n по заданному образцу(n - четное): по диагонали 
 * из  верхнего правого угла
 *  Form a square matrix of order n according to a given pattern(n-even): diagonally from 
 *  the upper right corner*/

public class Task14 {

	public static void main(String[]args) {
		
		int n = 5;
		
		   int c = 1;
		
		      int[][]diagonallyUpperRightCorner = new int [n][n];
		
		         for(int i = 0; i< n; i++) {
			
			     for(int j = 0; j< n; j++) {
				
				  System.out.print(diagonallyUpperRightCorner[i][j]  + " "); 
			             }
			               System.out.println();
		                         }
		                            System.out.println("_________");
		
		                                for(int i = 0; i< n; i++) {
			
			                            for(int j = 0; j< n; j++) {
				
				                       if (i == n - 1 - j)  System.out.print(c++  + " "); //по диагонали из правого верхнего угла
			
				                          else System.out.print(0  + " ");                //остальные ячейки заполняем '0'
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
//0 0 0 0 1 
//0 0 0 2 0 
//0 0 3 0 0 
//0 4 0 0 0 
//5 0 0 0 0 
