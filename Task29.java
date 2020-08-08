package by.htp.arraysofarrays.logic;

/* Найти положительные элементы главной диагонали квадратной матрицы.     Find the positive elements of the main diagonal of a square matrix. */

public class Task29 {

	public static void main(String[]args) {
	
	int n = 7;
	
	int sum = 0;
	
	int [][]positiveElementsDiagonal = new int[n][n];
	
	for(int i = 0; i< n; i++) {
		
		for(int j = 0; j< n; j++) {
			
			positiveElementsDiagonal[i][j] = (int)(Math.random()*10);
			
			System.out.print(positiveElementsDiagonal[i][j] + " ");
		}
		System.out.println();
	}			
	System.out.println("_____________");
	
for(int i = 0; i< n; i++) {
		
		for(int j = 0; j< n; j++) {
			
			if(i==j) sum = sum + positiveElementsDiagonal[i][j];
			
			//System.out.print(sum);
		}
		//System.out.print(sum);
		//System.out.println();
	}	
System.out.print(sum);		
}
}