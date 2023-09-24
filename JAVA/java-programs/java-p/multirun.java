class Multirun implements Runnable {
    public void run() {
        System.out.println("processing  thread is running...");
    }

    public static void main(String args[]) {
        Multirun m = new Multirun();
        Thread t = new Thread(m);
        t.start();
    }
}