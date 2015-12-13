package Ducks;

import java.util.Random;

public class AbstractDuck {

    private int speed = 0;
    private int distance = 0;

    private boolean canBlowUp = false;

    Random random;

    AbstractDuck(){
        random = new Random();
    }

    public void race () {
        distance+=speed;
    }

    public boolean testBlownUp () {
        return canBlowUp && random.nextInt(10) > 8; // 1 to 10
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void setCanBlowUp(boolean canBlowUp) {
        this.canBlowUp = canBlowUp;
    }

}
