class InheritingThreadClass1 extends Thread {
     InheritingThreadClass1(String n) {
          super(n);
          System.out.println("Thread is :" + getName());
     }

     public void run() {
          try {
               for (int i = 1; i <= 5; i++) {
                    System.out.println(getName() + ":" + i);
                    sleep(200);
               }
          } catch (InterruptedException e) {
               System.out.println(getName() + " is Interrupted");
          }
     }
}

class InheritingThreadClass2 extends Thread {
     InheritingThreadClass2(String n) {
          super(n);
          System.out.println("Thread is:" + getName());
     }

     public void run() {
          try {
               for (int i = 1; i <= 10; i++) {
                    System.out.println(getName() + ":" + i);
                    sleep(200);
               }
          } catch (InterruptedException e) {
               System.out.println(getName() + " is Interrupted");
          }
     }
}

class isAliveJoinExample {
     public static void main(String args[]) {
          InheritingThreadClass1 t1 = new InheritingThreadClass1(" Thread Naresh");
          InheritingThreadClass2 t2 = new InheritingThreadClass2(" Thread someone");
          t1.start();
          while (t1.isAlive() && t2.isAlive()) {
               try {
                    Thread.sleep(400);
               } catch (InterruptedException e) {
               }
               try {
                    t1.join();
                    t2.join();
               } catch (InterruptedException e) {
               }
          }
          if (!t1.isAlive())
               System.out.println(" Thread Naresh is Over");
          if (!t2.isAlive())
               System.out.println(" Thread someone is Over");
     }
}