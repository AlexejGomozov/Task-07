package by.htp.arraysofarrays.logic;

import java.util.Arrays;

/* Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.  */

public class Task06 {

	public static void main(String[]args) {
		
					int x = 4; int y = 6;
		
		int[][] oddColumnElements = new int[x][y];
						
				for ( int i = 0; i< x ; i++) {
				
					for( int j = 1; j< y; j=j+2) {                   //берем только нечетные столбцы
											
				oddColumnElements[i][j] = (int)(Math.random()*100+1);
									
				System.out.print(oddColumnElements[i][j] + " ");
								
							}                                       //первый раз не получалось потому что if вставлял в 
			System.out.println();                                   //первые циклы for , т.е. хотел сделать проверку еще на 
		}                                                           //несформированном массиве.
				System.out.println("_________");                    //вторые циклы for уже работают с готовым массивом
				
				for ( int i = 0; i< x ; i++) {
					
					for( int j = 1; j< y; j=j+2) {                 //берем только нечетные столбцы
										
						if(oddColumnElements[0][j] > oddColumnElements[x-1][j])
							
							System.out.print(oddColumnElements[i][j] + " ");
							
					}
					System.out.println();
				}
	}
			
}
