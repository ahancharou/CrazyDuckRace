package Factories;

import Ducks.AbstractDuck;

public class DuckBuilder {
    public static AbstractDuck createDuck (int duckType, int bag){
        AbstractDuck duck;
        switch (duckType) {
            case 0:
                duck = createNormalDuck();
                break;
            case 1:
                duck = createCrazySuperDuck();
                break;
            case 2:
                duck = createRubberDuck();
                break;
            default: throw new RuntimeException();
        }
        switch (bag){
            case 0:
                //emptyBag
                break;
            case 1:
                giveRocketPack(duck);
                break;
            case 2:
                giveBricksBag(duck);
                break;
            case 3:
                giveCrazyRocketPack(duck);
                break;
            default: throw new RuntimeException();
        }

        return duck;
    }

    private static AbstractDuck createNormalDuck() {
        return NormalDuckFactory.createDuck();
    }

    private static AbstractDuck createCrazySuperDuck(){
        return CrazySuperDuckFactory.createDuck();
    }

    private static AbstractDuck createRubberDuck(){
        return RubberDuckFactory.createDuck();
    }

    private static void giveRocketPack(AbstractDuck duck){
        duck.setSpeed(duck.getSpeed()+3);
    }

    private static void giveBricksBag(AbstractDuck duck) {
        if (duck.getSpeed()!=0){
            duck.setSpeed(duck.getSpeed()/2);
        }
    }

    private static void giveCrazyRocketPack(AbstractDuck duck) {
        duck.setSpeed(duck.getSpeed()+7);
        duck.setCanBlowUp(true);
    }
}
