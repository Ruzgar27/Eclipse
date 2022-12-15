import java.util.Scanner;
public class lab02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the first side of the triangle.");
		
		int a = scanner.nextInt();
		
		System.out.println("Enter the second side of the triangle.");

		int b = scanner.nextInt();
		
		System.out.println("Enter the third side of the triangle.");
		
		int c = scanner.nextInt();
		
		if((a+b)>c && (a+c)>b && (b+c)>a) {
			
			 double v = (a + b + c) / 2;
			 
			 double e = Math.sqrt(v * (v - a) * (v - b) * (v - c));
			
			System.out.println("The area of the triangle is : "+e);
			
		} else {
			System.out.println("This is not a valid triangle.");
		}
				
	}

}
