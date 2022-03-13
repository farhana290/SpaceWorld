package game;

import city.cs.engine.*;

public class Rocket extends DynamicBody {

    private static final Shape rocketShape = new CircleShape(1);

    private static final BodyImage image =
            new BodyImage("data/rocket.png", 2f);

    public Rocket(World w) {
        super(w,rocketShape);
        addImage(image);

    }
}
