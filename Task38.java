package by.htp.arraysofarrays.logic;

/* Найдите сумму двух матриц                           Find the sum of two matrices  */

public class Task38 {

	public static void main(String[]args) {
		
		int n = 5;
		
		int m = 7;
		
		int[][] firstMatr = new int[n][m];
		
		    for(int i =0; i< n; i++) {
			
			   for(int j = 0; j< firstMatr[i].length; j++) {
				
			   	firstMatr[i][j] = (int)(Math.random()* 31);
				
				System.out.print(firstMatr[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println("___________________");
		
		
           int[][] secondMatr = new int[n][m];
		
		for(int i =0; i< n; i++) {
			
			for(int j = 0; j< secondMatr[i].length; j++) {
				
				secondMatr[i][j] = (int)(Math.random()* 31);
				
				System.out.print(secondMatr[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println("____________________");
		
		
		 int[][] sumMatr = new int[n][m];   							//сумма 2х матриц
			
			 for(int i =0; i< n; i++) {
				
				 for(int j = 0; j< sumMatr[i].length; j++) {
					
					sumMatr[i][j] = secondMatr[i][j] + firstMatr[i][j];
					
				 System.out.print(sumMatr[i][j]+ " ");
				}
			 System.out.println();
		    }		
	    }
     }
//23 19 17 12 21 25 12 
//27 21 29 27 6 9 18 
//10 30 20 25 20 11 7 
//6 26 3 9 17 9 16 
//9 4 1 20 30 17 28 
//___________________
//11 20 24 8 14 18 9 
//14 11 0 18 17 5 21 
//12 8 12 27 19 25 29 
//13 19 4 1 13 3 5 
//3 10 4 14 4 27 13 
//____________________
//34 39 41 20 35 43 21 
//41 32 29 45 23 14 39 
//22 38 32 52 39 36 36 
//19 45 7 10 30 12 21 
//12 14 5 34 34 44 41 
