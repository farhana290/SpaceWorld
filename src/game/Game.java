package game;

import javax.swing.JFrame;
import java.awt.*;

/**
 * A world with some bodies.
 */
public class Game {


    /** The World in which the bodies move and interact. */
    private GameWorld world;

    /** A graphical display of the world (a specialised JPanel). */
    private GameView view;

    /** Initialise a new Game. */
    public Game() {


        // make the world
        GameWorld world = new GameWorld();

        // make a view
        view = new GameView(world, 500, 500);
        view.setZoom(17);

        // uncomment this to draw a 1-metre grid over the view
        // view.setGridResolution(1);


        //view.addMouseListener(new MouseHandler(world, view));

        AlienController controller = new AlienController(world.getAlien());
        view.addKeyListener(controller);

        view.addKeyListener(controller);


        final JFrame frame = new JFrame("Space world");
        frame.add(view);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationByPlatform(true);
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);

        frame.addKeyListener(new AlienController(world.getAlien()));


        // uncomment this to make a debugging view
        //JFrame debugView = new DebugViewer(world, 500, 500);

        // start our game world simulation!
        world.start();
    }

    /** Run the game. */
    public static void main(String[] args) {


        new Game();
    }
}
