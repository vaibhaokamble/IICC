public class AseriesSum {

    public static void main(String[] args) {

        int a = 2;
        double sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum = sum + Math.pow(a, i) / i;
        }

        System.out.println("The sum of the series is: " + sum);
    }
}
