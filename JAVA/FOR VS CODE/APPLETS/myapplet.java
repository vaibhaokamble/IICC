import java.applet.*;
import java.awt.*;
/*
 
<applet code="myapplet" height="100" width="200">
</applet>

*/

public class myapplet extends Applet {
    public void paint(Graphics g){
        g.drawRect(10, 20, 100, 110);
    }
}
