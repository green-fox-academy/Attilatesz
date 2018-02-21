import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 2 parameters:
        // The square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.


        int x = 0;
        int y = 0;
        rainbowBox(x,y,graphics);

        }

    private static void rainbowBox(int width, int heigth, Graphics graphics) {
        for (int i = 50; i < WIDTH; i+=2) {
            Random random = new Random();
            width = i;
            heigth = i;
            int r = random.nextInt(256);
            int g = random.nextInt(256);
            int b = random.nextInt(256);
            Color randomColor = new Color(r, g, b);
            graphics.setColor(randomColor);
            graphics.drawRect(160-(width/2), 180-(heigth/2), width, heigth);

        }
    }
    // Don't touch the code below
    static int WIDTH = 360;
    static int HEIGHT = 360;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}