package by.htp.arraysofarrays.logic;

import java.util.Arrays;

/*  С клавиатуры вводится двумерный массив чисел размерностью nxm.    			  A two-dimensional array of numbers with dimension nxm is entered 
 *  Выполнить с массивом следующие действия:									  from the keyboard. Perform the following actions with the array:
   а) вычислить сумму отрицательных элементов в каждой строке;                    a) calculate the sum of negative elements in each line;
   б) определить максимальный элемент в каждой строке;                            b) determine the maximum element in each line;	
   в) переставить местами максимальный и минимальный элементы матрицы.			  c) rearrange the places of the maximum and minimum elements of the matrix.*/
 																										  	

public class Task26 {

 public static void main(String[]args) {
		
  int n = 5;
		
   int m = 7;
		
	int count = 0;
		
	 int temp1;
		
	  int[][]sumNegatDetermineMaxRearrangePlaces = new int[n][m];
		 
	   int rowMin = 0, colMin = 0, rowMax = 0, colMax = 0;
		
		sumNegatDetermineMaxRearrangePlaces[rowMax][colMax] = sumNegatDetermineMaxRearrangePlaces[0][0];  // maxArray задаем макс значение для дальнейшего его нахождения
	  	 
	  	 sumNegatDetermineMaxRearrangePlaces[rowMin][colMin] = sumNegatDetermineMaxRearrangePlaces[0][0]; // minArray  задаем мин значение для дальнейшего его нахождения
		
		  for(int i = 0; i< n; i++ ) {
			
		   for(int j = 0; j< m; j++) {
				
			 sumNegatDetermineMaxRearrangePlaces[i][j] = (int)(100 - Math.random()*200);       // задаем массив через рандом с отрицательными числами
							
			  System.out.print(sumNegatDetermineMaxRearrangePlaces[i][j] + " ");			
			   }		
			   System.out.println();
		        }
		        System.out.println("_____________________________________________________________________________________");
		
		
          for(int i = 0; i< n; i++ ) {
        	  
           int sum = 0;                                                                                       //значение sum обнуляем с новым циклом для нахождения суммы отриц знач в кажд строке
        	   
        	int max = sumNegatDetermineMaxRearrangePlaces[i][0];                                               //задаем макс значение для дальнейшего его нахождения в каждой отдельной строке
        	       	  
		     for(int j = 0; j< m; j++) {
									
	          if(i== count & sumNegatDetermineMaxRearrangePlaces[i][j] < 0)  sum= sumNegatDetermineMaxRearrangePlaces[i][j]+ sum;              //находим сумму отриц значений в каждой строке
		
		       if(max< sumNegatDetermineMaxRearrangePlaces[i][j]) max = sumNegatDetermineMaxRearrangePlaces[i][j];                           //находим макс значение в каждой строке
		 
		        if(sumNegatDetermineMaxRearrangePlaces[rowMax][colMax]< sumNegatDetermineMaxRearrangePlaces[i][j])  {rowMax = i; colMax = j;}  //находим макс значение матрицы и определением индексы макс значения матрицы 
		
		         if(sumNegatDetermineMaxRearrangePlaces[rowMin][colMin] > sumNegatDetermineMaxRearrangePlaces[i][j]) { rowMin = i; colMin = j;}  //находим мин значение матрицы и определением индексов этих значений
		          }
		          System.out.print("сумма отрицательных значений в строке " + i + " = " + sum + "; ");	
		
		           System.out.print("максимальное значение в строке " + i + " = " + max + "; ");
				
		            count++;                                                                                                                          //count увеличивается по первому циклу for , вместе с i
		   
			         System.out.println();
		              }
                      System.out.println("_____________________________________________________________________________________");
          
                       System.out.println("maxArray = " + sumNegatDetermineMaxRearrangePlaces[rowMax][colMax] + "; " + "minArray = " + sumNegatDetermineMaxRearrangePlaces[rowMin][colMin] + ". "); 
                   
                        System.out.println("_____________________________________________________________________________________");          
	
          for(int i = 0; i< n; i++ ) {
        	 
  		   for(int j = 0; j< m; j++) {			 
  				
  			 if(sumNegatDetermineMaxRearrangePlaces[i][j] ==  sumNegatDetermineMaxRearrangePlaces [rowMax][colMax])                              //меняем местами max и min в матрице		
  			  {
  			   temp1 = sumNegatDetermineMaxRearrangePlaces [rowMin][colMin]; sumNegatDetermineMaxRearrangePlaces [rowMin][colMin] = sumNegatDetermineMaxRearrangePlaces [rowMax][colMax];  sumNegatDetermineMaxRearrangePlaces [rowMax][colMax] = temp1;
  			    }   				  				 
  				 System.out.print(sumNegatDetermineMaxRearrangePlaces[i][j] + " "); 							
  				  }		  			
 			      System.out.println();
  		           }
                    System.out.println("значения наоборот: maxArray = " + sumNegatDetermineMaxRearrangePlaces[rowMax][colMax] + "; " + "minArray = " + sumNegatDetermineMaxRearrangePlaces[rowMin][colMin] + ". ");     
	}	
}
//23 -60 -95 -71 -22 33 51 
//-1 -20 30 -23 26 -2 -29 
//39 56 56 95 -79 -83 -78 
//-77 -94 -19 -35 39 -23 95 
//-75 21 11 -99 36 -51 38 
//_____________________________________________________________________________________
//сумма отрицательных значений в строке 0 = -248; максимальное значение в строке 0 = 51; 
//сумма отрицательных значений в строке 1 = -75; максимальное значение в строке 1 = 30; 
//сумма отрицательных значений в строке 2 = -240; максимальное значение в строке 2 = 95; 
//сумма отрицательных значений в строке 3 = -248; максимальное значение в строке 3 = 95; 
//сумма отрицательных значений в строке 4 = -225; максимальное значение в строке 4 = 38; 
//_____________________________________________________________________________________
//maxArray = 95; minArray = -99. 
//_____________________________________________________________________________________
//23 -60 -95 -71 -22 33 51 
//-1 -20 30 -23 26 -2 -29 
//39 56 56 -99 -79 -83 -78 
//-77 -94 -19 -35 39 -23 95 
//-75 21 11 95 36 -51 38 
//значения наоборот: maxArray = -99; minArray = 95. 
	
