package by.htp.arraysofarrays.logic;

/*  Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце.  A matrix of non-negative numbers is given. Calculate the sum of the items in each column.
 *  Определить, какой столбец содержит максимальную сумму.                             Determine which column contains the maximum amount.  */

public class Task28 {

	public static void main(String[]args) {
		
		int n = 5;
		
		int count = 0;
		
		int[][] columnContainsMaximumAmount = new int[n][n];
		
		for(int i = 0; i< n; i++) {
			
			for(int j = 0; j< n; j++) {
				
				columnContainsMaximumAmount[i][j] = (int)(Math.random()*10);
			
				System.out.print(columnContainsMaximumAmount[i][j] + " ");
		}
			System.out.println();
	}
		System.out.println("_________");
		
         for(int j = 0; j< n; j++) {                      //поменял местами for(i) и  for(j), чтобы считало сумму столбцов
			        	
        	int sum = 0;
        	
        	 for(int i = 0; i< n; i++) {
				
				if(columnContainsMaximumAmount[i][j] == columnContainsMaximumAmount[i][count]) sum = columnContainsMaximumAmount[i][j] + sum; 			
		}
        	 System.out.print("sum" + j + " = " + sum);
        	 
        	 count++;
        	 
			System.out.println();
	}		
}
}
//9 3 6 0 4 
//1 9 9 9 2 
//0 5 9 1 7 
//4 8 4 8 2 
//0 9 9 8 7 
//_________
//sum0 = 14
//sum1 = 34
//sum2 = 37
//sum3 = 26
//sum4 = 22