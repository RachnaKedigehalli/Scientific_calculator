package Calculator;
import java.util.Scanner;
import org.apache.log4j.Logger;
public class ScientificCalculator {
    private static final Logger logger = Logger.getLogger(ScientificCalculator.class);
    public static void main(String[] args) {
        ScientificCalculator calc = new ScientificCalculator();
        logger.info("Operation, Input1, Input2, Output");
        calc.menu();
    }

    public void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------Simple Scientific Calculator---------------------");
        System.out.println("Choose an operation (Enter the corresponding number)");
        System.out.println("1. Square root");
        System.out.println("Enter 0 to exit");

        int op = sc.nextInt();
        Operations operations = new Operations();

        try {
            switch (op) {
                case 0:
                    logger.info("[EXIT], " + 0.0 + ", " + 0.0 + ", " + 0.0);
                    return;
                case 1:
                    System.out.println("Square root of? ");
                    double x = sc.nextDouble();
                    double answer = operations.sqRoot(x);
                    logger.info("[SQ ROOT], "+ x + ", " + 0.0 + ", " + answer);
                    System.out.println("Square root of "+ x + " is " + answer);
                    menu();
                    break;
                default:
                    logger.warn("[INVALID_OP], " + 0.0 + ", " + 0.0 + ", " + 0.0);
                    System.out.println("Enter a valid operation number\n");
                    menu();
                    break;
            }
        }
        catch(ArithmeticException e) {
            logger.warn("[INVALID_INPUT], " + 0.0 + ", " + 0.0 + ", " + 0.0);
            System.out.println("Invalid input\n");
            menu();
        }

        sc.close();
    }
    
}