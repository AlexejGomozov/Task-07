package by.htp.arraysofarrays.logic;
import java.util.Scanner;

/* В числовой матрице поменять местами два столбца любых столбца, т. е.    In a numerical matrix, swap two columns of any column, that is, put 
 * все элементы одного столбца поставить на соответствующие им позиции     all the elements of one column in the corresponding positions of the 
 * другого, а его элементы второго переместить в первый. Номера столбцов   other, and move its elements of the second to the first. Column 
 *  вводит пользователь с клавиатуры.                                      numbers are entered by the user from the keyboard.  */

public class Temp27 {

  public static void main(String[]args) {
		
   Scanner sc = new Scanner(System.in);
		
     System.out.println("Введите номера столбцов матрицы для замены");
		
      int v = sc.nextInt();                            //вводим номер столбца для замены
		
       int g = sc.nextInt();                            //вводим номер столбца для замены
			
        System.out.println("v = "+ v);
		
         System.out.println("g = "+ g);
		
          System.out.println("Поменять элементы столбцa - " + v + " , на элементы столбца - " + g);
		
	   sc.close();
		
	    int n = 7;       				//размер квадрата (матрыцы)
		
	     int temp;                                  //переменная временная для замены двух столбцов
		
	      int[][]swapTwoColumns = new int[n][n];
		
		for(int i = 0; i< n; i++) {
			
	         for(int j = 0; j< n; j++) {
				
	          swapTwoColumns[i][j] = (int)(Math.random()*10);      //заполняем матрицу
				
		    System.out.print(swapTwoColumns[i][j] + " ");			
		      }
		     System.out.println();
		       }
		       System.out.println("_______________");
		
                  for(int i = 0; i< n; i++) {
			
	           for(int j = 0; j< n; j++) {
				
		    if(swapTwoColumns[i][j] == swapTwoColumns[i][v])  	
	              {
		     temp = swapTwoColumns[i][v];  swapTwoColumns[i][v] = swapTwoColumns[i][g]; swapTwoColumns[i][g] = temp;
		       }
	   	      System.out.print(swapTwoColumns[i][j] + " ");			
			}
		       System.out.println();
                       }		
	             }	
                   }
//Введите номера столбцов матрицы для замены
//3
//4
//v = 3
//g = 4
//Поменять элементы столбцa - 3 , на элементы столбца - 4
//7 1 9 3 7 4 4 
//1 7 5 9 2 6 3 
//0 5 2 4 8 2 8 
//1 6 9 7 5 2 6 
//3 8 0 7 6 9 3 
//7 7 0 9 0 5 6 
//7 7 4 7 7 4 7 
//_______________
//7 1 9 7 3 4 4 
//1 7 5 2 9 6 3 
//0 5 2 8 4 2 8 
//1 6 9 5 7 2 6 
//3 8 0 6 7 9 3 
//7 7 0 0 9 5 6 
//7 7 4 7 7 4 7 
