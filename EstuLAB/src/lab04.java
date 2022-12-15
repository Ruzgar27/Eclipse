import java.util.Scanner;
import java.util.Random;

public class lab04 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		Scanner scanner = new Scanner(System.in);
		
		int gcd = 1;
		
	    int a = random.nextInt(1000)+1;
	    
	    int b = random.nextInt(1000)+1;

	    System.out.println("Choose an algorithm between Brute and Oklid");
	    
	    String chosenAlgorithm = scanner.nextLine();
	    
	    if(chosenAlgorithm.equals("Brute")) {
	    	
	    	for(int i = 1 ; i<=a && i<=b ; i++) {
	    		
	    		if(a % i == 0 && b % i == 0) {
	    			
	    			gcd=i;
	    			
	    			System.out.println("The GCD of "+a+" and "+b+" is : "+gcd);
	    			
	    		}
	    		
	    	}
	    			
	    	
	    }else if(chosenAlgorithm.equals("Oklid")) {
	    	
	    	if(a<b) {
	    		int temp;
	    		
	    	temp = a;
	    	a = b ;
	    	b = temp;
	    	
	    	
	    			
	    	}
	    	
	    	int k = a%b;
	    	
	    	while(k != 0) {
	    		a=b;
	    		b=k;
	    		k=a%b;
	    	}
	    	gcd=b;
	    	System.out.println("The GCD of "+a+" and "+b+" is : "+gcd);
	    	
	    }

	    
	    
	}

}

