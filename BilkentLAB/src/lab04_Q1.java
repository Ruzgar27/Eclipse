import java.util.Scanner;
public class lab04_Q1 {

		private static int Fib(int n)
		    {
		        if (n <= 1)
		            return n;
		        return Fib(n - 1) + Fib(n - 2);
		    }

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the index of Fibonacci you want to know:");
		int index= scanner.nextInt();
		
		System.out.println("Fib ("+index+") is "+Fib(index));

	}

}
