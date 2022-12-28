
public class lab04_Q4 {

	  // You can change the height to any number and check
    public static final int HEIGHT = 5;

    public static void main(String[] args) {
    	lab04_Q4 stairs = new lab04_Q4();
        for (int j = 0; j < HEIGHT; j++) {
            stairs.printSpace(j);
            stairs.printTop(j);
            stairs.printSpace(j);
            stairs.printMiddle(j);
        }
       stairs.printTop(HEIGHT-1); // added for bottom line stairs 
    }

    public void printSpace(int j) {
        for (int i = j; i < HEIGHT - 1; i++) {
            System.out.print("   ");
        }
    }

    public void printTop(int j) {

        for (int k = 0; k <= j; k++) {
            System.out.print("+--");
        }

        System.out.print("+");
        System.out.println("");
    }

    public void printMiddle(int j) {
        for (int k = 0; k <= j; k++) {
            System.out.print("|  ");
        }
        System.out.print("|");
        System.out.println("");
    }
}