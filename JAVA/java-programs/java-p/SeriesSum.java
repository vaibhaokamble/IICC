public class SeriesSum {
    public static void main(String[] args) {
        int n = 10; // number of terms in the series
        int sum = 0; // variable to store the sum
        for (int i = 1; i <= n; i++) {
            // alternating between adding and subtracting 1
            if (i % 2 == 1) {
                sum += 1;
            } else {
                sum -= 1;
            }
        }
        System.out.println("Sum of the series: " + sum);
    }
}