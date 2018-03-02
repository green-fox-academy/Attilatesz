
import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class square {

  public static void mainDraw(Graphics graphics) {



    drawSquare(5,100,100,200,20, graphics);

  }


  private static void drawSquare(int level, int x, int y, int squareSize, int lineWidth, Graphics graphics) {
    if (level == 1) {
      return;

    } else {

      Color newColorOne = new Color(0,255,255);
      Color newColorTwo = new Color(255,255,255);

      graphics.setColor(newColorOne);
      graphics.fillRect(x, y, squareSize, lineWidth);

      graphics.setColor(newColorTwo);
      graphics.fillRect(x+lineWidth, y+squareSize, squareSize, lineWidth);

      graphics.setColor(newColorOne);
      graphics.fillRect(x, y, lineWidth, lineWidth+squareSize);

      graphics.setColor(newColorTwo);
      graphics.fillRect(x+squareSize, y, lineWidth, squareSize);

      int newSquareSize = squareSize/2;
      int newLineWidth = lineWidth/2;
      int x1 = x-newSquareSize/2;
      int y1 = y-newSquareSize/2;


      drawSquare(level-1, x1, y1, newSquareSize, newLineWidth, graphics);
      drawSquare(level-1, x1+squareSize, y1, newSquareSize, newLineWidth, graphics);
      drawSquare(level-1, x1, y1+squareSize, newSquareSize, newLineWidth, graphics);
      drawSquare(level-1, x1+squareSize, y1+squareSize, newSquareSize, newLineWidth ,graphics);

    }
  }

  //    Don't touch the code below
  static int WIDTH = 400;
  static int HEIGHT = 400;

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
    this.setBackground(Color.black);

  }
}

}