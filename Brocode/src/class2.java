//java.util.Scanner yani import kısmı public classın dışına yazılır
import java.util.Scanner;
public class class2 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	//Sarı olan kısım scannerin ismi
	System.out.println("What is your name");
	String name = scanner.nextLine();
	System.out.println("How old are you");
	int age = scanner.nextInt();
	scanner.nextLine(); 
	/* Buraya boş bir nextLine koymamımzın sebebi nextIntden sonra gelen nextLine boş algılanıyor
	 * Bizde bundan kurtulmak için buraya ekstra bir nextline koyup sonra asıl sorumuza geçiyoruz
	 *
	 */
	System.out.println("What is your favorite food");
	String food = scanner.nextLine();
	
	 
	
	
	System.out.println("Hello "+name);
	System.out.println("You are "+age+" years old" );
	System.out.println("Your favorite food is "+food);
	

	}

}
