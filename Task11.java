package by.htp.arraysofarrays.logic;

/* Дана матрица размера m x n. Вывести ее элементы в следующем порядке: первая строка 
 * справа налево, вторая строка слева направо, третья строка справа налево и так далее.
 *  An m x n matrix is given. Print its elements in the following order: first line from 
 *  right to left, second line from left to right, third line from right to left, and so on. */

public class Task11 {

   public static void main(String[]args) {
		
	int x = 7;
		
            int y = 5;
		
	        int [][] rightLeft = new int [x][y];
		
		    for (int i = 0; i< x; i++) {
			
			for(int j = 0; j< y; j++) {
				
		           rightLeft[i][j] = (int)(Math.random()*10 + 1);
				
				System.out.print(rightLeft[i][j] + " " );			
			           }
			             System.out.println();
		                       }
		                        System.out.println("_______________");
		
                                           for (int i = 0; i< x; i++) {
			
			                       for(int j = 0; j< y; j++) {
											
				                   if(i==0 | i%2==0)  System.out.print(rightLeft[i][j] + " " );
				     
				                       if (i%2 !=0) System.out.print(rightLeft[i][y - 1 - j] + " " );			
			                                 }
			                                   System.out.println();					
	                                                     }
                                                               }
                                                                 }
//8 5 5 2 7 
//4 1 5 9 7 
//10 1 8 3 7 
//2 8 2 1 6 
//5 5 7 10 10 
//1 10 6 6 5 
//8 1 8 7 1 
//_______________
//8 5 5 2 7 
//7 9 5 1 4 
//10 1 8 3 7 
//6 1 2 8 2 
//5 5 7 10 10 
//5 6 6 10 1 
//8 1 8 7 1 
