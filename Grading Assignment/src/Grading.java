import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the overall score");
		double score = scan.nextDouble();
		
		if(score >= 90 && score <= 100){
			
			System.out.println("Grade : AA "+"State : Passed");
			
		}else if(score < 90 && score >= 85){
			
			System.out.println("Grade : AB "+"State : Passed");
			
		}else if(score < 85 && score >= 80){
			
			System.out.println("Grade : BA "+"State : Passed");
			
		}else if(score < 80 && score >= 75){
			
			System.out.println("Grade : BB "+"State : Passed");
			
		}else if(score < 75 && score >= 70){
			
			System.out.println("Grade : CB "+"State : Passed");
			
		}else if(score < 70 && score >= 65){
			
			System.out.println("Grade : CC "+"State : Passed");
			
		}else if(score < 65 && score >= 60){
			
			System.out.println("Grade : DC "+"State : Passed"); 
		}else if(score < 60 && score >= 50){
			
			System.out.println("Grade : DD "+"State : Passed"); 
		}else if(score < 50 && score >= 0){
			
			System.out.println("Grade : FF "+"State : Failed"); 
		}
			
			else{
			
			System.out.println("Invalid Score , Program Terminates");
			
		}
	}

}