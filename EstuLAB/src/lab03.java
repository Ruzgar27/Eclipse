import java.util.Scanner;
public class lab03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("The equation is ax^2+bx+c");
		
		System.out.println("Enter the value of a");
		
		int a = scanner.nextInt();
		
		System.out.println("Enter the value of b");
		
		int b = scanner.nextInt();
		
		System.out.println("Enter the value of c");
		
		int c = scanner.nextInt();
		
		double d = ((b*b)-(4*a*c));
		
		if(d>0) {
			System.out.println("The equation has 2 real roots.");
			
			double value1 = ((-b)+Math.sqrt((b*b)-(4*a*c)))/(2*a);
			double value2 = ((-b)-Math.sqrt((b*b)-(4*a*c)))/(2*a);
			
			System.out.println("The first root of the equation is : "+value1);
			
			System.out.println("The second root of the equation is : "+value2);
		
		}else if(d==0) {
			
			System.out.println("The equation has 1 real root.");
			
			double value3 = ((-b)+Math.sqrt((b*b)-(4*a*c)))/(2*a);
			
			System.out.println("The root of this equation is "+value3);
			
		}else {
			
			System.out.println("This equation doesn't have any real roots.");
			
		}
	
		

	}

}
