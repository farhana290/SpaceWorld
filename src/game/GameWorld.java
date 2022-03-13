package game;

import city.cs.engine.*;
import city.cs.engine.Shape;
import org.jbox2d.common.Vec2;

import javax.swing.*;
import java.awt.*;

public class GameWorld extends World {


    private game.Alien alien;
    private Man man;

    public GameWorld() {

    }
    {
        // make the ground
        Shape shape = new BoxShape(15, 0.5f);
        StaticBody ground = new StaticBody(this, shape);
        ground.setPosition(new Vec2(0f, -10.5f));
        ground.setFillColor(Color.blue);

       /* Shape shape1 = new BoxShape(11, 0.5f);
        StaticBody ground1 = new StaticBody(this, shape);
        ground.setPosition(new Vec2(2f, -11.5f));
        ground.setFillColor(Color.red);*/

        // make a platform
        Shape platform1Shape = new BoxShape(2, 0.2f);
        StaticBody platform1 = new StaticBody(this, platform1Shape);
        platform1.setPosition(new Vec2(-9, 6.5f));
        platform1.setFillColor(Color.green);
        // add another platform here
        StaticBody platform2 = new StaticBody(this, platform1Shape);
        platform2.setPosition(new Vec2(9, 4.5f));
        platform2.setFillColor(Color.orange);

        StaticBody platform3 = new StaticBody(this, platform1Shape);
        platform3.setPosition(new Vec2(-8, -2.5f));
        platform3.setFillColor(Color.orange);

        StaticBody platform4 = new StaticBody(this, platform1Shape);
        platform4.setPosition(new Vec2(-2, -4.5f));
        platform4.setFillColor(Color.red);

        StaticBody platform5 = new StaticBody(this, platform1Shape);
        platform5.setPosition(new Vec2(7, 0.5f));
        platform5.setFillColor(Color.pink);


        StaticBody platform6 = new StaticBody(this, platform1Shape);
        platform6.setPosition(new Vec2(2, 3.5f));
        platform6.setFillColor(Color.white);


        Shape platform7Shape = new BoxShape(2, 0.2f);
        StaticBody platform7 = new StaticBody(this, platform1Shape);
        platform7.setPosition(new Vec2(1, 8.5f));
        platform7.setFillColor(Color.red);







        // add another platform here
     /* Shape wallShape = new BoxShape(0.5f, 6f);
        StaticBody wall1 = new StaticBody(this, wallShape);
        wall1.setPosition(new Vec2(-11.5f, -6));
        wall1.setFillColor(Color.white);
        // add another platform here
        StaticBody wall2 = new StaticBody(this, wallShape);
        wall2.setPosition(new Vec2(11.5f, -6));
wall2.setFillColor(Color.green);
*/
        alien = new game.Alien(this);
        alien.setPosition(new Vec2(8, -10));
        RocketCollect pickup = new RocketCollect(alien);
        alien.addCollisionListener(pickup);

        for (int i = 0; i<15; i++) {
            Body Rocket = new Rocket(this);
            Rocket.setPosition(new Vec2(i*2-10, 10)) ;
            Rocket.addCollisionListener(new RocketCollect(alien));
        }


        // add more bodies here
        Man man = new Man(this);
        man.setPosition(new Vec2(-3,-10));
    }

    public game.Alien getAlien() {
        return alien;
    }
    public Man getMan () {
        return man;

    }

}
