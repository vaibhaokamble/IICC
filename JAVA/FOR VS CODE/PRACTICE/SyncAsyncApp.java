import java.util.*;

class Table {
    synchronized void showTable(int x) {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d X %d = %d\n", i, x, i * x);
                if (i == 5) {
                    wait(); // unconditional wait
                }
                Thread.sleep(1000);
            }
        } catch (Exception ex) {
            System.out.println("Error is " + ex);
        }
    }

    synchronized void restartTable() {
        try {
            notifyAll();
        } catch (Exception ex) {
            System.out.println("error is " + ex);
        }
    }
}

class Two extends Thread {
    Table t;

    void setTable(Table t) {
        this.t = t;
    }

    public void run() {
        t.showTable(5);
    }
}

class Three extends Thread {
    Table t;

    void setTable(Table t) {
        this.t = t;
    }

    public void run() {
        t.showTable(20);
    }
}

public class SyncAsyncApp {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Table t = new Table();
        Two tw = new Two();
        tw.setTable(t);
        tw.start();
        Three th = new Three();
        th.setTable(t);
        th.start();
        Scanner xyz = new Scanner(System.in);
        do {
            String msg = xyz.nextLine();
            if (msg.equals("restart")) {
                t.restartTable();
            }
            if (msg.equals("stop")) {
                System.exit(0);
            }
        } while (true); // infinite string
    }
}
