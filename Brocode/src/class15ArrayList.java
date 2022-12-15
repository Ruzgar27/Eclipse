import java.util.ArrayList;

public class class15ArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("pizza");
		food.add("hamburger");
		food.add("icecream");
		
		food.set(0 , "sushi");
		
		for(int i = 0; i<food.size();i++) {
			System.out.println(food.get(i));
			
		}
	}

}
