package game;

import city.cs.engine.StepEvent;
import city.cs.engine.StepListener;
import org.jbox2d.common.Vec2;

public class Tracker implements StepListener {
    private game.GameView view;
    private game.Alien alien;
    private Man man;
    public Tracker(game.GameView view, game.Alien alien) {
        this.view = view;
        this.alien = alien;
    }
    public Tracker(game.GameView view, Man man) {
        this.man = man;
    }



    public void preStep(StepEvent e) {}
    public void postStep(StepEvent e) {
        view.setCentre(new Vec2(alien.getPosition()));
    }
}