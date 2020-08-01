package by.htp.arraysofarrays.logic;

import java.util.Arrays;

/* Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего. 
   A matrix is given. Display all odd columns with the first item greater than the last.  */

public class Task06 {

	public static void main(String[]args) {
		
		int x = 4; int y = 6;
		
		     int[][] oddColumnElements = new int[x][y];
						
			    for ( int i = 0; i< x ; i++) {
				
			           for( int j = 1; j< y; j=j+2) {                                     //берем только нечетные столбцы
											
				         oddColumnElements[i][j] = (int)(Math.random()*100+1);
									
				                 System.out.print(oddColumnElements[i][j] + " ");								
							}                                                   //первый раз не получалось потому что if вставлял в 
			                               System.out.println();                                   //первые циклы for , т.е. хотел сделать проверку еще в 
		                                           }                                                     //несформированном массиве.
				                            System.out.println("_________");                          //вторые циклы for уже работают с готовым массивом.
				
				                                for ( int i = 0; i< x ; i++) {
					
					                              for( int j = 1; j< y; j=j+2) {                                  //берем только нечетные столбцы
										
						                            if(oddColumnElements[0][j] > oddColumnElements[x-1][j])
							
							                          System.out.print(oddColumnElements[i][j] + " ");							
					                                              }
					                                                 System.out.println();
				                                                            }
	                                                                                       }			
                                                                                                  }
//67 26 45 
//13 16 78 
//51 14 26 
//79 92 29 
//_________
//45 
//78 
//26 
//29 

