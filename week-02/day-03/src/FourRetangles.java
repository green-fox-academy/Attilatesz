import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRetangles {

    public static void mainDraw(Graphics graphics) {
        // draw four different size and color rectangles.
        // avoid code duplication.


        for (int i = 0; i < 4; i++) {
            Random random = new Random();
            int x = random.nextInt(321);
            int y = random.nextInt(361);
            int width = random.nextInt(100);
            int height = random.nextInt(100);
            graphics.fillRect(x, y, width, height);
            graphics.setColor(Color.getHSBColor
                    (random.nextInt(361), random.nextInt(100) + 80, 100));
        }

    }

    //    Don't touch the code below
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