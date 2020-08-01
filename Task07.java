package by.htp.arraysofarrays.logic;

/* Дан двухмерный массив 5×5. Найти сумму модулей отрицательных нечетных элементов.
Given a two-dimensional 5×5 array. Find the sum of modules of negative odd elements.*/

public class Task07 {

  public static void main(String[] args) {
		  
     int x = 5;
		
        int y = 5;
		
           int sum = 0;
		
	      int [][] sumModules = new int [x][y];
		
		 for(int i = 0; i< x; i++) {
			
		    for(int j = 0; j < y; j++) {
				
		       sumModules[i][j] = (int)(100 - Math.random()*200);
				
			  System.out.print(sumModules[i][j] + " ");
			    }
			    System.out.println();
		              }		
		               System.out.println("_______________");
		
		                 for(int i = 0; i< x; i++) {
			
			           for(int j = 0; j< y; j ++) {
				
				      if(sumModules[i][j] < 0) sum = sum + Math.abs(sumModules[i][j]);				
			                }
		                         }
		                         System.out.println(sum);		
	                                   }
                                            }
//-6 93 28 -19 8 
//-57 -44 78 63 19 
//-87 20 22 48 57 
//26 86 5 56 86 
//0 85 93 -31 22 
//_______________
//244
