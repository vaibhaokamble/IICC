public class NumseriesSum {

    public static void main(String[] args) {
        int n = 6; // number of terms
        int sum = 0;
        int a = 1;
        for (int i = 0; i < n; i++) {
            sum = sum + a;
            a = a + i + 2;
        }
        System.out.println("The sum of the first " + n + " terms is: " + sum);
    }
}
