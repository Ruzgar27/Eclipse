/*  abs = mutlak değer , sqrt = karekök , round = yuvarlama 
 *  max = büyük değeri gösterir , min = küçük değeri gösterir 
 *  floor = aşağı yuvarlama , 
 */
import java.util.Scanner;
public class Class5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double x;
		double y;
		double z;
		
		System.out.println("Enter x : ");
		x = scanner.nextDouble();
		
		System.out.println("Enter y : ");
		y = scanner.nextDouble();
		
		z = Math.sqrt((x*x)+(y*y));
		System.out.println("Hipotenus = "+ z);
		
		
		

	}

}
