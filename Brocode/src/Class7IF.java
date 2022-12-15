import java.util.Random;
public class Class7IF {

	public static void main(String[] args) {
		Random random = new Random();

		int damage = random.nextInt(150)+1;
		
		System.out.println("The damage is : " + damage);
		
		
	if (damage>=100) {
	System.out.println("You Died !");
	
	} else if (damage<100 && damage >= 50) {
		System.out.println("You are hurt!");
		
	} else {
		System.out.println("You are not effected.");
	}
  }
}