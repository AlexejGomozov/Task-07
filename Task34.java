package by.htp.arraysofarrays.logic;

/* Сформировать случайную матрицу m x n, состоящую из нулей и единиц,         Generate a random m x n matrix consisting of zeros and ones, with the 
 *  причем в каждом столбце число единиц равно номеру столбца.                 number of ones in each column being equal to the column number. */

public class Task34 {

  public static void main(String[]args) {
		
     int n = 7;
		
        int m = 8;		
		
	  int [][]onesColumnNumber = new int [n][m];
		
             for(int i = 0; i< n; i++) {
			
	        for(int j = 0; j < m; j++) {
			
		   System.out.print(onesColumnNumber[i][j] + " ");
			}
			System.out.println();
                          }
                           System.out.println("_______________");
       
	  
       for(int i = 0; i< n; i++) {
			
	  for(int j = 0; j < m; j++) {
							
	     if( (i+1) <= j ) onesColumnNumber[i][j] = 1;     //печатает 1 когда j>= (i + 1)
				
		 System.out.print(onesColumnNumber[i][j] + " ");
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
//_______________
//0 1 1 1 1 1 1 1 
//0 0 1 1 1 1 1 1 
//0 0 0 1 1 1 1 1 
//0 0 0 0 1 1 1 1 
//0 0 0 0 0 1 1 1 
//0 0 0 0 0 0 1 1 
//0 0 0 0 0 0 0 1 
