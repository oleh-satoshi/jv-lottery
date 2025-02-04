package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final static int BOUND =  100;
    public Ball getRandomBall() {
        Random random = new Random();
        int value = random.nextInt(BOUND);
        return new Ball(new ColorSupplier().getRandomColor().toString(), value);
    }
}
