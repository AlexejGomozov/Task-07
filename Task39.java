package by.htp.arraysofarrays.logic;

/* Найдите произведение двух матриц.                    Find the product of two matrices.  */

public class Task39 {

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
		System.out.println("_________________________");
		
		
		 int[][] productMatr = new int[n][m];
			
			 for(int i =0; i< n; i++) {
				
				 for(int j = 0; j< productMatr[i].length; j++) {
					
					 productMatr[i][j] = secondMatr[i][j] * firstMatr[i][j];
					
				 System.out.print(productMatr[i][j]+ " ");
				}
			 System.out.println();
		    }		
	    }
     }
//8 18 22 27 18 21 3 
//26 1 22 11 26 6 23 
//21 19 29 13 14 28 19 
//9 6 18 9 8 5 26 
//1 19 27 23 24 9 28 
//___________________
//4 12 28 30 26 30 30 
//17 20 14 4 22 18 30 
//15 8 3 1 15 23 2 
//6 26 19 13 10 10 24 
//8 5 7 11 1 25 4 
//_________________________
//32 216 616 810 468 630 90 
//442 20 308 44 572 108 690 
//315 152 87 13 210 644 38 
//54 156 342 117 80 50 624 
//8 95 189 253 24 225 112 
