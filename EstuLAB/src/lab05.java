import java.util.Scanner;
public class lab05 {
	
	public static int reverse(int number) {
		int reversed = 0;
		
		 while(number != 0) {
			    
		     
		      int digit = number % 10;
		      reversed = reversed * 10 + digit;

		    
		      number /= 10;
		    }
		 return reversed;
	}
	
	public static boolean isPalindrome(int number) {
		if(reverse(number)==number) {
			
			return true;
		}else 
			return false;
		
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("This is a program for checking palindromes.");
		System.out.println("");
		System.out.println("Please enter the number you want to check.");
		
		int number = scanner.nextInt();
		
		if(isPalindrome(number)==true) {
			
			System.out.println(number + " is a palindrome.");
			
		}else 
			System.out.println(number+" is not a palindrome.");
		

	}

}
