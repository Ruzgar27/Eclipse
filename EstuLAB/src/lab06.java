import java.util.Random;
import java.util.*;
public class lab06 {
	
	
	public static int[] initRandomArray() {
		Random random = new Random();
		
		int a = random.nextInt(20)+1;
		
		int [] array = new int[a];
		
		for(int i = 0 ; i < array.length ; i++) {
			
			array[i] = random.nextInt(20)+1;
		}
		
		return array;
		
	}
	 public static int getMax(int[] arr) {
		
		 int max = 0;
		 
		 for(int i = 0 ; i<arr.length ; i++) {
			 
			 if(arr[i]>=max) {
				 
				 max = arr[i];
			 }else 
				 max = max;
			 
		 }
		 
		 return max;
		 
	 }
	 public static int getMin(int[] arr) {
		 
		 int min = 99;
		 
		 for(int i = 0 ; i<arr.length ; i++) {
			 
			 if(min>arr[i]) {
				 
				 min = arr[i];
			 }
			 
			 
			 
		 }
		 
		 return min;
		 
	 }
	 public static double getMean(int[] arr) {
		 
		 int sum = 0;
		 
		 for(int i = 0; i<arr.length;i++) {
			 
			 sum += arr[i];
			 
		 }
		 double count = sum/arr.length;
		 
		 
		 return count;
	 }

	

	public static void main(String[] args) {
		
		
		int[] arr = initRandomArray().clone();
		
		
		
		
		
		System.out.println("The randomized array is : ");
		
	System.out.println(Arrays.toString(arr));
	
	System.out.println("The biggest element of the array is : " + getMax(arr));
	
	System.out.println("The smallest element of the array is : " + getMin(arr));
	
	System.out.println("The mean value of the arrays is : " + getMean(arr));
	
	
	

	
	
	
			
	}

}
