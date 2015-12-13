package Factories;

import Ducks.AbstractDuck;
import Ducks.NormalDuck;

public class NormalDuckFactory extends DuckFactory {

    public static AbstractDuck createDuck() {
        return new NormalDuck();
    }
}
