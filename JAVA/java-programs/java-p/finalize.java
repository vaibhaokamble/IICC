public class finalize {
    public static void main(String[] args) {
        String str1 = new String("CSE");
        str1 = null;
        System.gc();
        System.out.println("output of main method");

    }

    protected void finalizemethod() {
        System.out.println("output of finalizemethod");
    }
}
