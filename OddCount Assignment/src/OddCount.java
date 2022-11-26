import java.util.Scanner;

public class OddCount {
	
	public static int loopBasedCount(int a, int b) {

	    int count=0;
	    if(a>b) {
	    	 for(int i=b;i<=a;i++) {
		    	 
	 	    	if(i%2 != 0) {
	 		        	count++;
	 		        }	 	    	
	 	    }
	    	
	    } else for(int i=a;i<=b;i++) {
	    	 
	    	if(i%2 != 0) {
		        	count++;
		        }	    	
	    }
	    	             
	    return count;
	}
		
		        
	public static int mathBasedCount(int a, int b) {
		
		if(a>b) {
			if(a%2==0 && b%2 == 0) {
				return (a - b)/2;
			} else 
				return (a - b)/2+1;
			
		} else if (b>a) {
			if(a%2==0 && b%2 == 0) {
				return (b - a)/2;
			}else
				return (b - a)/2+1;
		}
		return  0;
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the first number.");
		
		int a = scanner.nextInt();
		
		System.out.println("Enter the second number.");
		
		int b = scanner.nextInt();
		
		System.out.print("Loop Based Solution : ");
		int c = loopBasedCount(a,b);
		
		if(a>b) {
			System.out.println(" The number off odds in range ["+b+","+a+"] = "+c);
		}else {
			System.out.println(" The number off odds in range ["+a+","+b+"] = "+c);
		}
		
		
		System.out.print("Math Based Solution : ");
		int d = mathBasedCount(a,b);
		
		if(a>b) {
			System.out.println(" The number off odds in range ["+b+","+a+"] = "+d);
		}else {
			System.out.println(" The number off odds in range ["+a+","+b+"] = "+d);
		}
	 
		
		

   }

}
