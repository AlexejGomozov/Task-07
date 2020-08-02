package by.htp.arraysofarrays.logic;

/* Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 *  A matrix is given. Print the k-th row and p-th column of the matrix. */

public class Task10 {
	
  public static void main(String[] args) {
	
     int x = 6;
	
        int y = 6;
	
	  int [][] rowColumnMatrix = new int[x][y];
	
	     for(int i = 0; i< x; i++ ) {
			
		for(int j = 0; j< y; j++) {
				
	           rowColumnMatrix[i][j]= (int)(Math.random()*10);
				
		      System.out.print(rowColumnMatrix[i][j]+ " ");			
			 }
			  System.out.println();
		             }
		               System.out.println("___________");
	
		                 for(int i = 0; i< x; i++) {
		            	
		            	    for(int j= 0; j< y; j++) {
		            				            		
		            		 if (j == 3)
						 
		            	           System.out.print(rowColumnMatrix[i][3]+ " ");
					    
		            		      if (j == 3 & i == 3) continue;          //строка и столбец красиво получаются, крестом(два числа не повторяются)
					    
		            		         if (i == 3)
							 
		            		    	   System.out.print(rowColumnMatrix[3][j]+ " ");
		            		
		            		              else  System.out.print("  ");
		            	                        }
		            	                         System.out.println();
		                                           }		               
                                                             }
						              } 
//2 5 3 8 2 9 
//1 1 6 3 6 0 
//8 4 8 1 5 1 
//5 2 4 0 5 0 
//3 1 5 2 3 2 
//7 1 0 8 6 7 
//___________
//      8       
//      3       
//      1       
//5 2 4 0 5 0 
//      2       
//      8       
