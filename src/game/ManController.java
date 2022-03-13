package game;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ManController implements KeyListener {

    private static final float WALKING_SPEED = 12;

    private Man man;

    public ManController(Man m ){
        man = m;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        // other key commands omitted
        if (code == KeyEvent.VK_3) {
            man.startWalking(-WALKING_SPEED);
        } else if (code == KeyEvent.VK_4) {
            man.startWalking(WALKING_SPEED);

        }
    }


    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_3) {
            man.stopWalking();
        } else if (code == KeyEvent.VK_4) {
            man.stopWalking();
        }
    }
}
