package by.htp.arraysofarrays.logic;

/*  Дан линейный массив x1 , x2, x3... , xn . Получить действительную квадратную матрицу порядка :    You are given a linear array x1 , x2, x3... , xn. Get real square order matrix: 
 *  каждая новая строка с повторяющимися элементами в степени на одну больше  предыдущей строки.   each new row with repeating elements is one power greater than the previous row */

public class Task24 {

	public static void main(String[]args) {
		
		int n = 5;
		
		  int[][]elementsOnePowerGreater = new int[n][n];
		
		    for(int i = 0; i< n; i++) {
			
			  int increase = 1;
			
			    for(int j = 0; j< n; j++) {
				
				  elementsOnePowerGreater[i][j] = increase++; 
				
				    System.out.print((int)Math.pow(elementsOnePowerGreater[i][j], i+1) + "   ");				
			          }			
			           System.out.println();
		}				
	}
}
//1   2   3   4   5   
//1   4   9   16   25   
//1   8   27   64   125   
//1   16   81   256   625   
//1   32   243   1024   3125   
