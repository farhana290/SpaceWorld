package game;

import city.cs.engine.CollisionEvent;
import city.cs.engine.CollisionListener;

public class RocketCollect implements CollisionListener {

    private game.Alien alien;
    public RocketCollect(game.Alien s){
        this.alien= s;
    }

    private Man man;
    public RocketCollect(Man m ){ this.man = m ;}

    //  @Override
    public void collide(CollisionEvent e) {
        System.out.println("COLLECTED");
        if (e.getOtherBody()  == man);
        //  alien.incremmentRocket();{
        // alien.addRocket();
        // e.getOtherBody().destroy();
    }
}
