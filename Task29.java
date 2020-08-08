package by.htp.arraysofarrays.logic;

/* Найти положительные элементы главной диагонали квадратной матрицы.     Find the positive elements of the main diagonal of a square matrix. */

public class Task29 {
	
  public static void main(String[]args) {
	
    int n = 7;
	
      int sum = 0;
	
	int [][]positiveElementsDiagonal = new int[n][n];
	
	  for(int i = 0; i< n; i++) {
		
	     for(int j = 0; j< n; j++) {
			
		positiveElementsDiagonal[i][j] = (int)(Math.random()*10);
			
		  System.out.print(positiveElementsDiagonal[i][j] + " ");
		    }
		    System.out.println();
	             }			
	              System.out.println("_____________");
	
                       for(int i = 0; i< n; i++) {
		
		         for(int j = 0; j< n; j++) {
			
			  if(i==j) sum = sum + positiveElementsDiagonal[i][j];
		           }		
	                 }	
                      System.out.print(sum);		
                     }
                   }
//5 6 7 7 6 1 2 
//4 7 0 0 1 7 5 
//2 7 8 2 4 6 8 
//6 5 3 6 3 7 4 
//8 1 6 5 9 5 0 
//3 4 9 7 0 2 8 
//8 2 4 2 6 5 9 
//_____________
//46
