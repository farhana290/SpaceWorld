
package game;

import city.cs.engine.*;

public class Alien extends Walker {
    private static final Shape alienShape = new PolygonShape(
            -0.11f, 2.8f,
            0.87f, 1.48f,
            0.99f, 0.29f,
            0.24f, -2.32f,
            -1.12f, -2.27f,
            -1.24f, 1.21f);

    private static final BodyImage image =
            new BodyImage("data/alien.png", 5f);

    private int rocketCount;
    private int healthCount;

    public Alien(World world) {
        super(world, alienShape);
        addImage(image);

        rocketCount = 0;
        healthCount = 3;
    }

    public int getrocketCount() {
        return rocketCount;
    }

    public void incremmentRocket() {
        rocketCount++;
        System.out.println("YES! Another point RocketCount = " + rocketCount);
    }

    public int getHealthCount() {
        return healthCount;
    }
    public void decrementhealtCount() {
        healthCount--;
        System.out.println("oh no, Life Lost = " + healthCount);
    }}









