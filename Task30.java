package by.htp.arraysofarrays.logic;

/* Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму        Fill the 10x20 matrix with random numbers from 0 to 15. Display the matrix
 * матрицу и номера строк, в которых число 5 встречается три и более раз.              itself and the row numbers in which the number 5 occurs three or more times. */

public class Task30 {

	public static void main(String[]args) {
		
		int n = 10;
		
		int m = 20;
		
		int count1 = 0;                      //два счетчика 1 считает строки чтобы в каждой искать повторяющие 5ки
		
		int count2;                          //2й счетчик считает количество 5к в строке
		
		int [][]occursThreeTimes = new int[n][m];
		
		for(int i = 0; i< n; i++) {
			
			for(int j = 0; j< m; j++) {
				
				occursThreeTimes[i][j] = (int)(Math.random()*16);
				
				System.out.print(occursThreeTimes[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("__________________________________________________");
		
   for(int i = 0; i< n; i++) {
	   
	     count2 = 0;                            //каждый раз с переходом на новую строку count2 обнуляется 
	     
			for(int j = 0; j< m; j++) {
				
				if(i == count1 & occursThreeTimes[i][j] == 5) count2++; 
																			
			}
			if(count2 >= 3) System.out.println("В строке " + i + ", встречаются 5-ки, три или более раз.");
			
			count1++;                          //count1 увеличивается каждый for(i)
			
			//System.out.println();
		}
	}
}
//13 6 13 8 0 13 11 7 4 15 8 11 13 12 9 10 4 2 2 15 
//9 13 9 14 12 8 12 13 6 11 8 1 4 1 12 10 9 15 14 5 
//11 14 12 10 0 7 7 8 5 13 7 7 5 10 10 9 3 7 2 8 
//10 4 0 1 7 15 13 6 3 4 0 4 6 5 14 9 5 10 4 4 
//9 3 12 6 15 10 15 8 12 10 2 1 9 15 9 15 3 1 2 9 
//15 5 15 4 13 15 5 8 3 1 14 6 4 0 8 12 5 8 5 3 
//15 2 12 13 15 2 15 13 9 5 12 8 13 10 15 15 10 3 7 12 
//11 7 2 13 13 0 14 14 8 5 1 2 7 9 3 6 5 6 4 6 
//10 13 14 9 11 9 10 1 4 14 15 9 12 2 1 8 1 5 7 5 
//4 11 14 13 1 11 9 10 7 2 0 12 3 14 3 6 15 1 8 1 
//__________________________________________________
//В строке 5, встречаются 5-ки, три или более раз.
