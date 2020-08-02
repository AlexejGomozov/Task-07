package by.htp.arraysofarrays.logic;

/* Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали. 
 *  You are given a square matrix. Display the elements on the diagonal. */

public class Task09 {

	public static void main(String[]args) {
		
	  int x = 5;
		
		int y = 5;
			
		   int [][] squareMatrix = new int[x][y];
				
			  for(int i = 0; i< x; i++ ) {
					
				 for(int j = 0; j< y; j++) {
						
					squareMatrix[i][j]= (int)(Math.random()*10);
						
						System.out.print(squareMatrix[i][j]+ " ");
						
					      }
					       System.out.println();
				             }
				               System.out.println("_________");
				
                                  for(int i = 0; i< x ; i++) {   
					
					                 for(int j = 0; j< y; j++) {    
						
	if(i == j)	   {
				                        
		System.out.print(squareMatrix[i][i] +" " );	
				
		    //if(i == (x-1)-j) {         //чтобы вывести числа по диагонали в квадрате, нужно добавить этот if и else которые закоментированы. но получаетя за один столбец больше(не по заданию)
		     //if (i == j & i == (x-1)-j) continue;
					
				System.out.print(squareMatrix[x-1-j][j]+ " ");   //это строка печатает символы  диагонали квадрата снизу 
				}						 
				   //else System.out.print(" - ");	   
				 
					  }
					   System.out.println();
				         }		
	                       }	
                             }

