import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Draw 3 lines with that function. Use loop for that.

        int x = 0;
        int y = 0;

        drawLinToCenter(x, y,graphics);

        }
    public static void drawLinToCenter(int width, int heigth, Graphics line){
        Random random = new Random();
        int x = 160;
        int y = 180;
        for (int i = 0; i < 3; i++) {
            width =random.nextInt(321);
            heigth=random.nextInt(361);
            line.drawLine(x,y,width,heigth);

        }
}

    // Don't touch the code below
    static int WIDTH = 320;
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