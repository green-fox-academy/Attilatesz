import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Connect {
    public static void mainDraw(Graphics graphics) {
        // Create a function that takes 1 parameter:
        // An array of {x, y} points
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}

        int[][] groupBox = {{10, 10}, {290, 10}, {290, 290}, {10, 290}};


        connectLines(groupBox, graphics);

    }

    private static void connectLines(int[][] groupBox, Graphics graphics) {
        graphics.setColor(Color.GREEN);
        int[] firstArray = groupBox[0];
        int[] previousArray = groupBox[0];
        for (int i = 1; i < groupBox.length; i++) {
            graphics.drawLine(previousArray[0], previousArray[1], groupBox[i][0], groupBox[i][1]);
//                if (i == (dots.length - 1)){
//                    graphics.drawLine(dots[i][0], dots[i][1], firstArray[0], firstArray[1]);
//                }
            previousArray = groupBox[i];
        }
        graphics.drawLine(previousArray[0], previousArray[1], firstArray[0], firstArray[1]);
    }




    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

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
