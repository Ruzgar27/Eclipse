import java.util.Scanner;
public  class lab04_Q2 {

	private static String isPalindrome(String palindrome) {
		
		String p = palindrome , reverseStr = "";
	    
	    int strLength = p.length();

	    for (int i = (strLength - 1); i >=0; --i) {
	      reverseStr = reverseStr + p.charAt(i);
	    }

	    if (p.toLowerCase().equals(reverseStr.toLowerCase())) {
	      System.out.println(p + " is a Palindrome String.");
	    }
	    else {
	      System.out.println( p + " is not a Palindrome String.");
	    }
		
	    return "";
	    
	}
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the word you want to check for a Palindrome.");
		String palindrome = scanner.nextLine();
		
		isPalindrome(palindrome);
		
		
	}

}
