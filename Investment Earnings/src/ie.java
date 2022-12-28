import java.util.Scanner;
public class ie {

	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Please enter the buying price per share.");
    
    double bp = scanner.nextDouble();

    int day=1;
    
    double cp;
    
    /* while(true) loopu sonsuza kadar devam eder.
     * Kullanırken genelde bir şarta bağlı break komutu kullanılır ki loopun ne zaman biteceği belirli olsun.
     * while(true) - break;
     * Kısaca break while(true) loopunu durdurur. 
     */
    
    while(true) {

    	System.out.println("Please enter the closing price per share for day "+day);
    	
    	cp = scanner.nextDouble();
    	
    	double fp = cp - bp;
    	
    	if(cp<=0) {
    		break;
    	}
    	else if (fp>0) {
 
    		System.out.println("Your earnings for the day "+day+" is "+fp+"$");
    		
    	}else if(fp<0) {
    		
    		System.out.println("Your loss for the day "+day+" is "+fp+"$");
    		
    	}else
    		System.out.println("Your don't have any earnings for the day "+day);
    	
    	day = day+1;
    }
    
    
    
    
	}

}
