

public class WhileLoopMain {
    public static void main(String[] args) {
        double S = 0;
        double denominator = 0.1;
        int n = 10; // number of terms in the series
        int i = 1;
        while (i <= n) {
            S = S + (1 / denominator);
            denominator = denominator / 10;
            i++;
        }
        System.out.println("The sum of the series is: " + S);
    }
}
