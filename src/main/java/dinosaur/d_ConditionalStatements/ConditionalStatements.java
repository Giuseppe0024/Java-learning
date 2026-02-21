package dinosaur.d_ConditionalStatements;

// LO SCANNER SI RIFERISCE ALLA Java API java.util, una delle librerie fornite da Java
import java.util.Scanner;

public class ConditionalStatements {
    public static void main (String [] args ) {
       Scanner visual = new Scanner(System.in);
        System.out.println("enter a number from 1 to 10");
        int number = visual.nextInt();
        switch (number) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
                System.out.println(number + "is odd");
                break;

            case 2:
            case 4:
            case 6:
            case 8:
            case 10:
                System.out.println( number + " is even");
                break;

            default:
                System.out.println("your number is not valid");
                break;
        }
    }
}
