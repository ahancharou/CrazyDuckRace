package Ducks;

public class CrazySuperDuck extends AbstractDuck {

    public CrazySuperDuck(){
        super();
        setSpeed(8);
    }

    public void race(){
        int direction = random.nextInt(5); // 1 to 5
        setDistance(getDistance()+(direction < 4? +getSpeed(): -getSpeed()));
    }
}
