package by.htp.arraysofarrays.logic;

/*  Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.      Find the largest element of the matrix and replace all odd elements with it. */

public class Task35 {

	public static void main(String[]args) {
		
		int n = 5;
		
		int[][]largElMatReplOddEl = new int[n][n];
		
		int max = largElMatReplOddEl[0][0];             //max определяем здесь, чтобы max определилось 
		 												//на всю матрицу и замена произошла по всей матрицы
		for(int i = 0; i< n; i++) {
			
			for(int j = 0; j< n; j++) {
				
				largElMatReplOddEl[i][j] = (int)(Math.random()*26);
				
				if(largElMatReplOddEl[i][j]> max) max = largElMatReplOddEl[i][j];
				
				
				System.out.print(largElMatReplOddEl[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("_____________");
		
		
            for(int i = 0; i< n; i++) {
			
			for(int j = 0; j< n; j++) {
				
				if(largElMatReplOddEl[i][j]%2 != 0) largElMatReplOddEl[i][j] = max;
				
				System.out.print(largElMatReplOddEl[i][j] + " ");
			}
			System.out.println();			
		}
            System.out.println("max = " + max);
	}	
}
//11 9 23 22 24 
//16 6 4 23 13 
//18 4 18 12 3 
//20 3 21 10 24 
//25 15 11 7 11 
//_____________
//25 25 25 22 24 
//16 6 4 25 25 
//18 4 18 12 25 
//20 25 25 10 24 
//25 25 25 25 25 
//max = 25