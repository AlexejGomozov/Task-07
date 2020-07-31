package by.htp.arraysofarrays.logic;

/* Создать и вывести на экран матрицу 2 x 3, заполненную случайными числами из [0, 9]. 
   Create and display a 2 x 3 matrix filled with random numbers from [0, 9]. */

public class Task02 {

	public static void main (String[] args) {
	
	int [][] randomNumbers = new int [2][3];
	
	for(int i = 0; i< randomNumbers.length; i++) {
		
		for (int j = 0; j<randomNumbers[i].length; j++) {
	
			randomNumbers[i][j] = (int)(Math.random()*10);      //случайны числа от "0" до "9"
	
	       System.out.print(randomNumbers[i][j] + " ");
	      
	}
		 System.out.println();
	}
	}
	
}