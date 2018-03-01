import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class square {

  public static void mainDraw(Graphics graphics) {

    drawSquare(2,150,150,300,300,(Graphics2D)graphics);

  }

  private static void drawSquare(int level, int x, int y, int width, int height, Graphics2D g) {

    g.drawRect(x,y,width,height);

    drawSquare(level-1, width/4,height/4,width/2,height/2,g);
    drawSquare(level-1, (width/4)+(width),height/4,width/2,height/2,g);
    drawSquare(level-1, (width/4)+width,(height/4)+height,width/2,height/2,g);
    drawSquare(level-1, width/4,(height/4)+height,width/2,height/2,g);
  }


  //    Don't touch the code below
  static int WIDTH = 600;
  static int HEIGHT = 600;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
static class ImagePanel extends JPanel{
  @Override
  protected void paintComponent(Graphics graphics) {
    super.paintComponent(graphics);
    mainDraw(graphics);

  }
}

}