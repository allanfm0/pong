import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;;

public class Game extends Canvas implements Runnable {

    public static int WIDTH = 240;
    public static int HEIGTH = 120;
    public static int SCALE = 3;

    public Game() {
        this.setPreferredSize(new Dimension(WIDTH * SCALE, HEIGTH * SCALE));
    }

    public static void main(String[] args) {
        Game game = new Game();
        JFrame frame = new JFrame("Pong");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(game);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void run() {

    }

}
