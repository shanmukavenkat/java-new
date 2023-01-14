import java.awt.*; 
import javax.swing.*;

class TestFrame1 
{
  public static void main ( String[] args )
  {
    JFrame frame = new JFrame("Test Frame 1");
    frame.setSize(400,300);
    frame.setVisible( true );
    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  }
}