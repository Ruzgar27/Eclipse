import java.util.Scanner;
public class Class10whileloop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	String name = "";
	
	while(name.isBlank()) {
		System.out.println("What is your name?");
		name = scanner.nextLine();
		
	}
    System.out.println("Hello "+name);

	}

}
