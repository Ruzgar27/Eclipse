import java.util.Scanner;
public class lab03_Q2 {
	
	private static int centuryFromYear(int year) {
		  double century;                
		  century = (double)year / 100; 
		  century = Math.ceil(century);
		  return (int)century;
		}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the year.");
		
		int YEAR = scanner.nextInt();
		
		if(YEAR%4 != 0 && YEAR<=100 ) {
			
			System.out.println("Year "+YEAR+" is in the "+centuryFromYear(YEAR)+"st century and it is not a leap year. ");
			
		}else if(YEAR%4 != 0 && YEAR<=200 ) {
			
			System.out.println("Year "+YEAR+" is in the "+centuryFromYear(YEAR)+"nd century and it is not a leap year. ");
			
		}else if(YEAR%4 != 0 && YEAR<=300 ) {
			
			System.out.println("Year "+YEAR+" is in the "+centuryFromYear(YEAR)+"rd century and it is not a leap year. ");
			
		}else if(YEAR%4 != 0 ) {
			
			System.out.println("Year "+YEAR+" is in the "+centuryFromYear(YEAR)+"th century and it is not a leap year. ");
			
		}else if(YEAR%4 == 0 && YEAR%100 != 0 && YEAR <= 100 ) {
			
			System.out.println("Year "+YEAR+" is in the "+centuryFromYear(YEAR)+"st century and it is a leap year. ");
			
		}
		else if(YEAR%4 == 0 && YEAR%100 != 0 && YEAR <= 200 ) {
			
			System.out.println("Year "+YEAR+" is in the "+centuryFromYear(YEAR)+"nd century and it is a leap year. ");
			
		}else if(YEAR%4 == 0 && YEAR%100 != 0 && YEAR <= 300 ) {
			
			System.out.println("Year "+YEAR+" is in the "+centuryFromYear(YEAR)+"rd century and it is a leap year. ");
			
		}else if(YEAR%4 == 0 && YEAR%100 != 0) {
			
			System.out.println("Year "+YEAR+" is in the "+centuryFromYear(YEAR)+"th century and it is a leap year. ");
			
		}else if(YEAR%4 == 0 && YEAR%100 == 0 && YEAR%400 !=0 && YEAR<=100 ) {
			
			System.out.println("Year "+YEAR+" is in the "+centuryFromYear(YEAR)+"st century and it is not a leap year. ");
			
		}else if(YEAR%4 == 0 && YEAR%100 == 0 && YEAR%400 !=0 && YEAR<=200 ) {
			
			System.out.println("Year "+YEAR+" is in the "+centuryFromYear(YEAR)+"nd century and it is not a leap year. ");
			
		}else if(YEAR%4 == 0 && YEAR%100 == 0 && YEAR%400 !=0 && YEAR<=300 ) {
			
			System.out.println("Year "+YEAR+" is in the "+centuryFromYear(YEAR)+"rd century and it is not a leap year. ");
			
		}else if(YEAR%4 == 0 && YEAR%100 == 0 && YEAR%400 == 0 && YEAR <= 100 ) {
			
			System.out.println("Year "+YEAR+" is in the "+centuryFromYear(YEAR)+"st century and it is a leap year. ");
			
		}else if(YEAR%4 == 0 && YEAR%100 == 0 && YEAR%400 == 0 && YEAR <= 200 ) {
			
			System.out.println("Year "+YEAR+" is in the "+centuryFromYear(YEAR)+"nd century and it is a leap year. ");
			
		}else if(YEAR%4 == 0 && YEAR%100 == 0 && YEAR%400 == 0 && YEAR <= 300 ) {
			
			System.out.println("Year "+YEAR+" is in the "+centuryFromYear(YEAR)+"rd century and it is a leap year. ");
			
		}
		
		
		

	}

}
