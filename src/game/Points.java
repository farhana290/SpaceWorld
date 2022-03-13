package game;
import city.cs.engine.*;
public class Points implements CollisionListener {
    private game.Alien alien;

    public Points(game.Alien alien) {
        this.alien = alien;
    }
    @Override
    public void collide(CollisionEvent e){
        if (e.getOtherBody()== alien){
            alien.incremmentRocket();
            e.getReportingBody().destroy();
        }
    }
}
