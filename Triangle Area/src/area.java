import java.util.Scanner;
public class area {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Üçgenin ilk kenarı : ");
        double a = s.nextDouble();

        System.out.println("Üçgenin ikinci kenarı : ");
        double b = s.nextDouble();

        System.out.println("Üçgenin üçüncü kenarı : ");
        double c = s.nextDouble();

        area at = new area();
        
        if (at.ucgen(a, b, c)) {
            double area = at.alanhesaplama(a, b, c);
            System.out.println("Alan = " + area);

        } else {
            System.out.println("Üçgen olmaz");
        }
    }
        private double alanhesaplama( double a, double b, double c){

            double v = (a + b + c) / 2;
            return Math.sqrt(v * (v - a) * (v - b) * (v - c));
        }
        private boolean ucgen ( double a, double b, double c){
            if ((a + b) > c && (a + c) > b && (b + c) > a) {
                return true;
            } else {
                return false;
            }
        }
    }