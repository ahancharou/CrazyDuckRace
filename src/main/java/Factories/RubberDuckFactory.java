package Factories;

import Ducks.AbstractDuck;
import Ducks.RubberDuck;

public class RubberDuckFactory extends DuckFactory{

    public static AbstractDuck createDuck(){
        return new RubberDuck();
    }
}

