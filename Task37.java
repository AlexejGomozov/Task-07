package by.htp.arraysofarrays.logic;

/* Переставить строки матрицы случайным образом.         Rearrange the matrix rows randomly. */

public class Task37 {

	public static void main(String[]args) {
		
		 int n = 5;
		
		 int count = 0;
		
		 int random;
		
		 int temp;
		
		int[][] rearrange = new int[n][n];
		
		 for(int i = 0; i< n; i++) {
			
			for(int j = 0; j< n; j++) {
				
			   rearrange[i][j] = (int)(Math.random()*20 + 1);
				
				  System.out.print(rearrange[i][j] + " " );				
			       }
			        System.out.println();
		}
		System.out.println("_____________");
				
         for(int i = 0; i< n; i++) {
			     	
        	 random = (int)(Math.random()*(n-1));    //выбираем случайный номер столбца и меняем
        	 
        	  temp = random;
        	 
        	   random = i;
        	 
        	     i = temp;
        	 
			for(int j = 0; j< n; j++) {
				                             				
				System.out.print(rearrange[i][j] + " " );				
			    }
			     count ++;
			 
			      if(count > n-1) break;
			
			      System.out.println();
		         }		
	            }	
               }
//9 16 6 19 7 
//17 7 17 11 9 
//8 17 18 13 16 
//11 19 7 11 19 
//8 7 2 13 13 
//_____________
//17 7 17 11 9 
//9 16 6 19 7 
//17 7 17 11 9 
//11 19 7 11 19 
//9 16 6 19 7 