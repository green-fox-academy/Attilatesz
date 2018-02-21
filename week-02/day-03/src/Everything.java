import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Everything {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.

        int x = 0;
        int y = 0;
        
        drawCenterLine(x,y,graphics);
        
    }

    private static void drawCenterLine(int x, int y, Graphics graphics) {
        int width = WIDTH/2;
        int height = HEIGHT/2;

        for (int i = 0; i < WIDTH/20; i++) {
            graphics.drawLine(x,y,width,height);
            x+=20;
        }
        for (int i = 0; i < WIDTH/20; i++) {
            graphics.drawLine(x, y, width, height);
            y += 20;
        }
        for (int i = 0; i < WIDTH/20; i++) {
            graphics.drawLine(x, y, width, height);
            x -= 20;
        }
        for (int i = 0; i < WIDTH/20; i++) {
            graphics.drawLine(x, y, width, height);
            y -= 20;
        }
    }


    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;
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