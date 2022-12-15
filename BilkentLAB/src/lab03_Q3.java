import java.util.Scanner;
public class lab03_Q3 {
	
	public static int firstDigit(int x) {
	    while (x > 9) {
	        x /= 10;
	    }
	    return x;
	}
		

	public static void main(String[] args) {
		
       Scanner scanner = new Scanner(System.in);

      // Your account PIN by default is 1234.
		
		System.out.println("Please enter your account PIN.");
		int PIN = scanner.nextInt();
		
		if(PIN==1234) {
			
			System.out.println("1- Withdraw money");
			System.out.println("2- Open a new account");
			System.out.println("3- Change PIN");
			System.out.println("Select an operation:");
			
			int Operation = scanner.nextInt();
			
			if(Operation==1) {
				
				System.out.println("Enter the amount to withdraw: ");
				double Amount = scanner.nextDouble();
				
				System.out.println("Your new balance is "+ (1000-Amount) + "TRY. Bye!");
				
				
			}else if(Operation==2) {
				
				System.out.println("Please choose the currency type of your new account");
				System.out.println("1- TRY");
				System.out.println("2- USD");
				System.out.println("Select currency type:");
				
				int Currency = scanner.nextInt();
				
				
				if(Currency==1) {
					
					System.out.println("Your new TRY account is now opened! Bye!");
					
				}else if(Currency==2) {
					
					System.out.println("Your new USD account is now opened! Bye!");
					
				}


				
			}else if(Operation==3) {
				
				System.out.println("Please enter your old PIN first.");
				
				int OldPIN = scanner.nextInt();
				
				if(OldPIN != 1234) {
					
					System.out.println("The PIN you entered is wrong. Bye!");
					
				}else if(OldPIN == 1234) {
					
					System.out.println("Please enter the new PIN you want to have.");
					
					int newPIN = scanner.nextInt();
					
					int lastDigit = newPIN%10;
					
					System.out.println("Your PIN is changed to "+firstDigit(newPIN)+"**"+lastDigit  + ". Bye!");
					
				}
				
			}
			
		}else if(PIN != 1234) {
			
			System.out.println("Invalid PIN! Bye!");
			
		}
		

	}

}
