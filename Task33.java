package by.htp.arraysofarrays.logic;

/* Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.  Filter the matrix columns in ascending and descending order of element values. */

public class Task33 {

	public static void main(String[]args) {
		
int n = 10;
		
	int [][] matrixAscendingDescendingOrder = new int[n][n];
		
		for(int i = 0; i< n; i++) {
			
			for(int j = 0; j< n; j++) {
				
				matrixAscendingDescendingOrder[i][j] = (int)(Math.random()*51);
				
				  System.out.print(matrixAscendingDescendingOrder[i][j] + " ");				
			       }
			         System.out.println();
		}
		
		boolean flag = true;
		
		 int temp;                                                                            //замена елементов
		
		  while(flag) {
			
			flag = false;
			 
			  for (int b = 0; b<matrixAscendingDescendingOrder.length; b++ ) {
				
			   for(int k = 0; k< matrixAscendingDescendingOrder[b].length- 1; k++ ) {				
				
				  if (matrixAscendingDescendingOrder[k][b]> matrixAscendingDescendingOrder[k+1][b]) {
					
					temp = matrixAscendingDescendingOrder[k][b];                                     //замена елементов
					
					  matrixAscendingDescendingOrder[k][b] = matrixAscendingDescendingOrder[k+1][b];
					
					    matrixAscendingDescendingOrder[k+1][b] = temp;
					
					      flag = true;
				}
			}
		}
	}		
		System.out.println("_______________________________________________");
		
           for(int i = 0; i< n; i++) {
			
			  for(int j = 0; j< n; j++) {
				
				System.out.print(matrixAscendingDescendingOrder[i][j] + "   ");				
			      }
			       System.out.println();
		}
	}
}

//17 29 31 42 6 26 7 12 27 47 
//41 22 24 40 7 27 43 5 49 33 
//14 33 40 15 25 28 17 39 45 48 
//3 37 40 28 3 15 11 30 29 46 
//40 43 50 36 27 13 48 11 1 14 
//33 6 34 27 12 0 47 49 7 50 
//45 5 22 48 0 18 50 48 47 34 
//41 11 48 17 21 22 21 20 49 7 
//6 18 13 18 15 25 1 0 6 0 
//26 17 45 14 44 17 28 31 33 4 
//_______________________________________________
//3   5   13   14   0   0   1   0   1   0   
//6   6   22   15   3   13   7   5   6   4   
//14   11   24   17   6   15   11   11   7   7   
//17   17   31   18   7   17   17   12   27   14   
//26   18   34   27   12   18   21   20   29   33   
//33   22   40   28   15   22   28   30   33   34   
//40   29   40   36   21   25   43   31   45   46   
//41   33   45   40   25   26   47   39   47   47   
//41   37   48   42   27   27   48   48   49   48   
//45   43   50   48   44   28   50   49   49   50   