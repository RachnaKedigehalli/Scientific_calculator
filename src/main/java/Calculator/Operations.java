package Calculator;
import java.lang.Math;

public class Operations {

    public double sqRoot(double x) {
        if(x>=0)
            return Math.sqrt(x);
        else 
            throw new ArithmeticException("Invalid input");
    }
}
