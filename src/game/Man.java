package game;

import city.cs.engine.*;

public class Man extends Walker {

    private static final Shape manShape = new PolygonShape(
            1.84f,1.99f, 1.96f,-0.3f, 1.5f,-2.36f,
            -0.47f,-2.33f, -1.98f,1.69f, 0.5f,2.46f
    );



    private static final BodyImage image =
            new BodyImage("data/man.png", 8f);


    public Man(World world) {
        super(world, manShape);
        addImage(image);
    }
}
