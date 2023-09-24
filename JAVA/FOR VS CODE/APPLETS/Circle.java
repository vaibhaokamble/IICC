import java.awt.*;
import java.applet.*;
public class Circle extends Applet
{
 public void paint(Graphics g)
{
 g.drawOval(20,20,200,120);
 g.setColor(Color.green);
 g.fillOval(70,30,100,100);
}
}

/* <html>
   <head>
   </head>
   <body>
         <applet code = "circle.class" width = "480" height = "360"></applet>
   </body>
</html> */