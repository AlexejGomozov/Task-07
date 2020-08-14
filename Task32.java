package by.htp.arraysofarrays.logic;
import java.util.Arrays;
/* Отсортировать строки матрицы по возрастанию и убыванию значений элементов.      Sort matrix rows in ascending and descending order of element values. */

public class Task32 {

	
		int n;
		
		int oneArray[];
		
		int matrix[][];
		
		int sortArray[];
		
		public Task32() {                                                                          //конструктор
			
			n = 10;
			
			System.out.println("Value of row " + n);
			
			System.out.println("Value of column " + n);
			
			oneArray = new int[n*n];
			
			matrix = new int[n][n];
			
			sortArray = new int[n*n];
			
		}	
                                 	public  void twoArrayToOneArray (int i, int j, int e) {            //метод создание одномерного массива из двумерного(данные используем из метода создающего двумерный массив)
			
                                  		oneArray[(i)*n + j] = e;
                                  	}
		
        /*              public void sortArrayM ( int i, int j, int e) {     						  // ???????????????
                                	
                           boolean sort = false;
                           		 
                               int temp;                                           						   //???????????????
                           		 
                           	  while(!sort) {
                           			 
                           			sort = true;
                        			
                                	   for (int m = 0; m< sortArray.length; m++) {              				 //????????????????
                                		   		
                                	       if(sortArray[(i)*n + j] > max) {
                                		
                                		      temp = sortArray[(i)*n + j];				
                    					
                                		      sortArray[(i)*n + j] = sortArray[(i)*n + (j + 1)];			//x[i]= x[i + 1];
                                					
                                		      																//x[i + 1] = temp;
                                		      sortArray[(i)*n + (j + 1)] = temp;              				    //???????????????
                                		
                                					  sort = false;
                                				       }	
                                				//System.out.print(sortArray[(i)*n + j] + " ");
                                			                               	                                                  		                                                    			
      	                         }
                                } 
                           		sortArray[(i)*n + j] = e;	  
                                }              */                                            								  //???????????????
                                
                                
		   public int get(int i, int j) {                                                                      //возвратный метод создания одномерго массива для печатания
			
			 return oneArray[(i)*n + j];
		           }		          		 
		      								public void storeMatrix() {                                //метода создания двумерного массива
			
		        								 for(int i = 0; i< n; i++) {
				
		        										for(int j = 0; j< n; j++) {
					
		        											 int ee = (int)(Math.random()*100);
					
		        												 matrix[i][j] = ee;
					
		        														twoArrayToOneArray(i, j, ee);					                 	        																				
		        							}			
		        						}
		      					   }		
		
	          public void printMatrix() {          															//печатаем двумерный массив
			
			System.out.println("Matrix " + ": ");
			
                               for(int i = 0; i< n; i++) {
				
				    for(int j = 0; j< n; j++) {
					
					System.out.print(matrix[i][j] + " ");
				         }
				            System.out.println();
				}
		}
		
		public void printArray(){																	    //печатаем одномерный массив
			
			System.out.println("Array " + ": ");
			
             			  for(int i = 0; i< n; i++) {
				
					for(int j = 0; j< n; j++) {
					
						System.out.print(get(i, j) + " ");					
		 }	
	 }
 }			
	           public void printSortArray(){                                                      //печатаем. метод сортировки одномерного массива (используем метода sort() из класса Arrays.)
	               		
	               Arrays.sort(oneArray);
	               		
	               	  System.out.println("SortArray " + " : ");
	               		
	               	      for(int i = 0; i <  oneArray.length; i++) {
	               		    	 
	               	        System.out.print(oneArray[i] + " ");
	               	  }
	               }	               			               		
	               		         
	 public static void main(String[]args) {
			
			Task32 Result = new Task32 ();
			
			Result.storeMatrix();
			Result.printMatrix();
			Result.printArray();
			System.out.println( " ");
			Result.printSortArray();
			}				 
}

//Value of row 10
//Value of column 10
//Matrix : 
//17 78 19 56 71 48 34 2 13 98 
//96 13 13 67 98 27 44 22 40 91 
//59 4 6 35 62 79 4 24 69 27 
//95 12 55 86 47 95 27 86 8 12 
//56 69 52 23 39 73 55 56 68 80 
//79 88 53 20 6 15 3 75 41 30 
//15 6 6 23 3 87 13 98 41 28 
//29 3 2 4 92 34 76 56 9 18 
//36 45 66 21 54 79 19 79 16 96 
//74 33 94 4 82 52 10 44 50 59 
//Array : 
//17 78 19 56 71 48 34 2 13 98 96 13 13 67 98 27 44 22 40 91 59 4 6 35 62 79 4 24 69 27 95 12 55 86 47 95 27 86 8 12 56 69 52 23 39 73 55 56 68 80 79 88 53 20 6 15 3 75 41 30 15 6 6 23 3 87 13 98 41 28 29 3 2 4 92 34 76 56 9 18 36 45 66 21 54 79 19 79 16 96 74 33 94 4 82 52 10 44 50 59  
//SortArray  : 
//2 2 3 3 3 4 4 4 4 6 6 6 6 8 9 10 12 12 13 13 13 13 15 15 16 17 18 19 19 20 21 22 23 23 24 27 27 27 28 29 30 33 34 34 35 36 39 40 41 41 44 44 45 47 48 50 52 52 53 54 55 55 56 56 56 56 59 59 62 66 67 68 69 69 71 73 74 75 76 78 79 79 79 79 80 82 86 86 87 88 91 92 94 95 95 96 96 98 98 98 
