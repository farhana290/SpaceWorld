package game;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class AlienController implements KeyListener {

    private static final float WALKING_SPEED = 12;

    private Alien alien;

    public AlienController(Alien a ){
        alien= a;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        // other key commands omitted
        if (code == KeyEvent.VK_1) {
            alien.startWalking(-WALKING_SPEED);
        } else if (code == KeyEvent.VK_2) {
            alien.startWalking(WALKING_SPEED);

        }
    }


    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_1) {
            alien.stopWalking();
        } else if (code == KeyEvent.VK_2) {
            alien.stopWalking();
        }
    }
}

