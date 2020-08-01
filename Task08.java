package by.htp.arraysofarrays.logic;

/* Дан двухмерный массив n×m элементов. Определить, сколько раз встречается 
 * число 7 среди элементов массива. 
 * You are given a two-dimensional array of n × m elements. Determine how many 
 * times the number 7 occurs among the array elements. */

public class Task08 {

	public static void main(String[]rgs) {
		
		int n = 4;
		
		int m = 7;
		
		int count = 0;
		
		int [][] occurs7 = new int[n][m];
		
		for(int i = 0; i< n; i++) {
			
			for( int j= 0; j< m; j++) {
				
				occurs7[i][j] = (int)(Math.random()*7 + 1);
				
				System.out.print(occurs7[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("____________________________________________");
		
		for(int i = 0; i< n; i++) {
			
			for(int j = 0; j< m; j++) {
				
				if(occurs7[i][j] == (7)) count++;
			}
		}
		System.out.println("в массиве occurs7 , 7-ка встречается "+ count+ " раз/a");
	}
	
	
}
