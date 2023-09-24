public class LastseriesSum {

    public static void main(String[] args) {
        int n = 10; // number of terms
        int x = 2; // given value of x
        double sum = 0; // variable to store sum

        for (int i = 1; i <= n; i++) {
            sum += (i * x + (i + 1)) / factorial(i + 1);
        }

        System.out.println("Sum of the series: " + sum);
    }

    static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
