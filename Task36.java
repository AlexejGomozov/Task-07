package by.htp.arraysofarrays.logic;

/* Операция сглаживания матрицы дает новую матрицу того же размера, каждый элемент которой         The matrix smoothing operation produces a new matrix of the same size, each 
 * получается как среднее арифметическое соседей соответствующего элемента исходной матрицы.       element of which is obtained as the arithmetic mean of the neighbors of the 
 *  Построить результат сглаживания заданной матрицы                                               corresponding element of the original matrix. Build the result of smoothing 
 *                                                                                                  the specified matrix */

public class Task36 {

	public static void main(String[] args) {
		
		 int n =7;
		
		 int count = 0;
		
		 int[][] matrix = new int[n][n];
		
		 int[][] specifiedMatrix = new int[n][n];
		
		               for(int i = 0; i< matrix.length; i ++) {
			
			            for(int j = 0; j< matrix[i].length; j++) {
				
			             matrix[i][j] = (int)(Math.random()* 15 + 1);
				
				          System.out.print(matrix[i][j] + " ");
			               }
			               System.out.println();
		                    }
		                    System.out.println("_________________");
		
        
		for(int k = 0; k< n; k ++) {
			
			for(int j = 0; j< n; j++) {
				
				
				if(k == count & j == n-1) specifiedMatrix[k][j] = (matrix[k][j] +  matrix[k][j-1])/2;          //если краяний элемент справа, считается сумма крайней и предкрайней
				
				if(k == count & j < n-1) { if (j == 0) specifiedMatrix[k][j] = (matrix[k][j] +  matrix[k][j+1])/2;    //все остальные элементы считаются сдесь, иф элемент нулевом месте считается так же как и крайие элементы
				
				else specifiedMatrix[k][j] = (matrix[k][j-1] +  matrix[k][j+1])/2;} 
				
        	
				System.out.print(specifiedMatrix[k][j] + " ");
			  }
			count++;
			
		  System.out.println();
		}
	}	
}
//7 12 14 13 10 3 7 
//12 14 10 4 13 8 7 
//8 13 3 1 3 7 13 
//7 4 6 13 6 13 7 
//10 8 11 12 2 4 9 
//13 11 1 3 6 11 3 
//4 2 8 8 13 6 8 
//_________________
//9 10 12 12 8 8 5 
//13 11 9 11 6 10 7 
//10 5 7 3 4 8 10 
//5 6 8 6 13 6 10 
//9 10 10 6 8 5 6 
//12 7 7 3 7 4 7 
//3 6 5 10 7 10 7 