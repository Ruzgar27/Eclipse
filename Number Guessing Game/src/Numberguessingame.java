import java.util.Scanner;
import java.util.Random;
public class Numberguessingame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int k = 15;

		int r = random.nextInt(100)+1;		
		
		for(int i = 0 ; i < k ; i++) {

			System.out.println("Please guess the number between 1 and 100 "+"You have "+(k-i)+" tries left.");
			
			int Guess = scanner.nextInt();
			
			if(Guess==r){
				
				System.out.println("Thats Correct! Congrats!");
				
			}else if(Guess<r&&i!=k-1) {
				
				System.out.println("Thats too low!");
				
			} else if(Guess>r&&i!=k-1) {
				
				System.out.println("Thats too high!");
				
			}else if(i==k) {
				System.out.println("You have exhausted all your tries!");
				
				System.out.println("The number was : "+r);
			}


			
		}
		

	}

}
