import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {

    public static void mainDraw(Graphics graphics) {
        int coordinateX = 0;
        int coordinateY = 0;
        int endcoordinateX = 300;
        int endcoordinateY = 300;
        int dividedCoordinateWidth = WIDTH / 40;
        int dividedCoordinateHeight = HEIGHT / 40;


        for (int i = 0; i < 20; i++) {
            coordinateX += dividedCoordinateWidth;
            endcoordinateY += dividedCoordinateHeight;
            graphics.drawLine(coordinateX, coordinateY + (HEIGHT / 2), endcoordinateX, endcoordinateY);
        }
        for (int i = 0; i < 20; i++) {
            coordinateX += dividedCoordinateWidth;
            endcoordinateY -= dividedCoordinateHeight;
            graphics.drawLine(coordinateX, coordinateY + (HEIGHT / 2), endcoordinateX, endcoordinateY);
        }
        for (int i = 0; i < 20; i++) {
            coordinateY += dividedCoordinateWidth;
            endcoordinateX += dividedCoordinateHeight;
            graphics.drawLine(coordinateX - (WIDTH / 2), coordinateY, endcoordinateX, endcoordinateY);
        }
        for (int i = 0; i < 20; i++) {
            coordinateX += dividedCoordinateWidth;
            endcoordinateY -= dividedCoordinateHeight;
            graphics.drawLine(coordinateX -(WIDTH), coordinateY, endcoordinateX - (WIDTH/2),
                    endcoordinateY+15);
        }
        //graphics.drawLine(0, 300,300, 300);
    }

    static int WIDTH = 600;
    static int HEIGHT = 600;

    public static void main(String[] args) {

        ImagePanel imagePanel = new ImagePanel();
        imagePanel.setBackground(Color.BLACK);
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