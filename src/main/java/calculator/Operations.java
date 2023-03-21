package calculator;
import java.lang.Math;

public class Operations {

    public double sqRoot(double x) {
        if(x>=0)
            return Math.sqrt(x);
        else 
            throw new ArithmeticException("Invalid input");
    }

    public double factorial(double x) {
        if(x>=0) {
            double answer = 1;
            for (int i=1; i<=x; i++)
                answer *= i;
            return answer;
        }
        else
            throw new ArithmeticException("Invalid input");
    }

    public double log(double x) {
        if(x>0) {
            return Math.log(x);
        }
        else
            throw new ArithmeticException("Invalid input");
    }
}
