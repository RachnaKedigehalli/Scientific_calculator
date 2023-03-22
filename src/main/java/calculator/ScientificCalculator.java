package calculator;
import java.util.Scanner;
import org.apache.log4j.Logger;
public class ScientificCalculator {
    private static final Logger logger = Logger.getLogger(ScientificCalculator.class);
    public static void main(String[] args) {
        ScientificCalculator calc = new ScientificCalculator();
        calc.menu();
    }

    public void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------Simple Scientific Calculator---------------------");
        System.out.println("Choose an operation (Enter the corresponding number)");
        System.out.println("1. Square root");
        System.out.println("2. Factorial");
        System.out.println("3. Natural logarithm");
        System.out.println("4. Power");
        System.out.println("Enter 0 to exit");

        int op = sc.nextInt();
        Operations operations = new Operations();

        double x=0.0, y=0.0, answer=0.0;
        try {
            switch (op) {
                case 0:
                    logger.info("[EXIT] " + 0.0 + " " + 0.0 + " " + 0.0);
                    return;
                case 1:
                    System.out.println("Square root of? ");
                    x = sc.nextDouble();
                    answer = operations.sqRoot(x);
                    logger.info("[SQ_ROOT] "+ x + " " + 0.0 + " " + answer);
                    System.out.println("Square root of "+ x + " is " + answer + "\n");
                    menu();
                    break;
                case 2:
                    System.out.println("Factorial of? ");
                    x = sc.nextDouble();
                    answer = operations.factorial(x);
                    logger.info("[FACTORIAL] "+ x + " " + 0.0 + " " + answer);
                    System.out.println("Factorial of "+ x + " is " + answer + "\n");
                    menu();
                    break;
                case 3:
                    System.out.println("Natural logarithm of? ");
                    x = sc.nextDouble();
                    answer = operations.log(x);
                    logger.info("[LOGARITHM] "+ x + " " + 0.0 + " " + answer);
                    System.out.println("Natural logarithm of "+ x + " is " + answer + "\n");
                    menu();
                    break;
                case 4:
                    System.out.println("Base = ");
                    x = sc.nextDouble();
                    System.out.println("Power = ");
                    y = sc.nextDouble();
                    answer = operations.power(x, y);
                    logger.info("[POWER] "+ x + " " + y + " " + answer);
                    System.out.println("Power of "+ x + " raised to " + y + " is " + answer + "\n");
                    menu();
                    break;
                default:
                    logger.warn("[INVALID_OP] " + 0.0 + " " + 0.0 + " " + 0.0);
                    System.out.println("Enter a valid operation number\n");
                    menu();
                    break;
            }
        }
        catch(ArithmeticException e) {
            logger.warn("[INVALID_INPUT] " + x + " " + 0.0 + " " + 0.0);
            System.out.println("Invalid input\n");
            menu();
        }

        sc.close();
    }
    
}