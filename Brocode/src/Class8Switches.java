
public class Class8Switches {

	public static void main(String[] args) {
		/* default : uygun yoksa yazacak olanı temsil eder
		 * break : olmazsa uygun olan statementdan sonraki tüm listingleri kabul eder.
		 */
String day = "Monday";

switch(day) {

case "Sunday" : System.out.println("It is Sunday.");
break;
case "Monday" : System.out.println("It is Monday.");
break;
case "Tuesday" : System.out.println("It is Tuesday.");
break;
case "Wednesday" : System.out.println("It is Wednesday.");
break;
case "Thursday" : System.out.println("It is Thursday.");
break;
case "Friday" : System.out.println("It is Friday.");
break;
case "Saturday" : System.out.println("It is Saturday.");
break;
default: System.out.println(day + " is not a valid day.");
}
	}

}
