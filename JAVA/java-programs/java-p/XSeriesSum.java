public class XSeriesSum {
    public static void main(String[] args) {
        int n = 3;
        double x = 2;
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum = sum - Math.pow(x, i) / (2 * i - 1);
            } else {
                sum = sum + Math.pow(x, i) / (2 * i - 1);
            }
        }

        System.out.println("Sum of series upto " + n + " terms is: " + sum);
    }
}