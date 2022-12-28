import java.util.Scanner;
public class lab04_Q3 {
	
	public static int getMaxValue(int[] array) {
	    int maxValue = array[0];
	    for (int i = 1; i < array.length; i++) {
	        if (array[i] > maxValue) {
	            maxValue = array[i];
	        }
	    }
	    return maxValue;
	}

	public static int getMinValue(int[] array) {
	    int minValue = array[0];
	    for (int i = 1; i < array.length; i++) {
	        if (array[i] < minValue) {
	            minValue = array[i];
	        }
	    }
	    return minValue;
	}

	public static void main(String[] args) {
    
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the amount of integers you want to enter.");
		int input = scanner.nextInt();
		
		int[] integers = new int[input];
		
		System.out.println("Please enter "+input+" integers");
		
		for(int i = 0 ; i < integers.length ; i++) {
			
			integers[i] = scanner.nextInt();
			
						
		} 		
		
		System.out.println("Your integers are : ");	
		
		for(int j = 0 ; j<integers.length;j++) {
			
			System.out.println(integers[j]);
			
		}
		
		 double sum = 0.0;

	        for (double num: integers) {
	           sum += num;
	        }

	        double average = sum / integers.length;
		
		
		System.out.println("Min : "+getMinValue(integers));
		System.out.println("");
		System.out.println("Max : "+getMaxValue(integers));
		System.out.println("");
		System.out.format("Average: %.2f", average);

		
		
	}

}
