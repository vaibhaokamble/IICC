import java.math.BigDecimal;
import java.math.MathContext;

public class FactorialMain {
    public static void main(String[] args) {
        int n = 10;
        BigDecimal sum = new BigDecimal(0);
        BigDecimal factorial = new BigDecimal(1);
        MathContext mc = new MathContext(5);

        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(new BigDecimal(i));
            sum = sum.add(new BigDecimal(1).divide(factorial, mc));
        }

        System.out.println("The sum of the series is: " + sum);
    }
}
