package bitsplease;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import javax.imageio.*;
import java.awt.image.BufferedImage;
import java.awt.event.*;

public class BitsPleaseMainMenu extends JFrame
{
   final int WINDOW_WIDTH=1024;
   final int WINDOW_HEIGHT=768;
   private Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
   
   
   public BitsPleaseMainMenu()throws IOException
   {
      setTitle("Bits Please Gym MGMT System");
      
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
      
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
      
      setContentPane(new BitsPleaseBackImage());
      
      setVisible(true);

   }
   
}
