public class boxnamespacecollision {
   double w, d, h;

   boxnamespacecollision(double w, double h, double d) {
      w = w;
      d = d;
      h = h;
   }

   void disp() {
      System.out.println("print : " + w);
      System.out.println("print : " + h);
      System.out.println("print : " + d);

   }

}

class NameSpaceCollision {
   public static void main(String[] args) {
      boxnamespacecollision b = new boxnamespacecollision(10, 20, 30);
      b.disp();
   }
}
