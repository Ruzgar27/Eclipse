import java.util.Random;

public class nbynmatrix {
	
	public static int getRandomSize() {
		
		Random r = new Random();
		
		int RandomSize = r.nextInt(10)+1;
		
		return RandomSize;
		 
		
	}
	
	public static int[][] generateMatrix(int n){
		
		Random r = new Random();
		
		int[][] matrix = new int[n][n];
		
		for(int i = 0 ; i < n ; i++) {
			
			  for(int j = 0 ; j <  n; j++) {
				  				  
				  matrix[i][j] = r.nextInt(20)+1;
				  
				  System.out.print(matrix[i][j] + " ");
		
			  }
			  
			  System.out.println();
			  
			  
			  }
		System.out.println();
		
		
		return matrix;
 	}

	
	public static void printMatrix(int[][] matrix) {
		
		// I didn't quite understand the purpose of this method so I just made it a println method to use it in the code.
		
		System.out.println("The matrix is :  "); 
		
		System.out.println();
					
	}
	
	public static int computeSum(int[][] matrix) {
		
		 int sumL = 0 , sumR= 0;
		 
		for(int i = 0 ; i < matrix.length ; i++) {
			
			for(int j = 0; j < matrix.length ; j++) {
				
				if(i==j) 
					
					sumL += matrix[i][j];
				
				if(i+j==matrix.length-1) 
					
					sumR += matrix[i][j];
				
			}


      }
		
        System.out.println("The right diagonal sum of the matrix is : "+sumR);
		
		
		System.out.println("\n");
		
		
		System.out.println("The left diagonal sum of the matrix is : " + sumL);

	
		return sumL ;
}
	

	public static void main(String[] args) {
		
		// Created an empty array to use it in the printMatrix method.
		int [][] a = {};
		
		printMatrix(a);
		
		computeSum(generateMatrix(getRandomSize()));
		
	}

}
