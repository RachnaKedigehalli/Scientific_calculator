package Calculator;
import java.util.Scanner;

public class ScientificCalculator {
    public static void main(String[] args) {
        ScientificCalculator calc = new ScientificCalculator();
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
                    return;
                case 1:
                    System.out.println("Square root of? ");
                    double x = sc.nextDouble();
                    double answer = operations.sqRoot(x);
                    System.out.println("Square root of "+ x + " is " + answer);
                    menu();
                    break;
                default:
                    System.out.println("Enter a valid operation number\n");
                    menu();
                    break;
            }
        }
        catch(ArithmeticException e) {
            System.out.println("Invalid input\n");
            menu();
        }

        sc.close();
    }
    
}