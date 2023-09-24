public class TwiBox {
    int a,b,c,vol1;
    int Box11(){
        return a*b*c;
    }
    void getVolume(){
        System.out.println("the volume of box " +Box11()); 
    }

    public static void main(String[] args) {
       TwiBox b1 = new TwiBox();
       TwiBox b2 = new TwiBox();
       
       b1.a=10;
       b1.b=5;
       b1.c=5;

       b2.a=5;
       b2.b=2;
       b2.c=3;

       b1.getVolume();
       b2.getVolume();
    }
}
