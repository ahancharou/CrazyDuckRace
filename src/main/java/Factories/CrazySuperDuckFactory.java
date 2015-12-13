package Factories;

import Ducks.AbstractDuck;
import Ducks.CrazySuperDuck;

public class CrazySuperDuckFactory extends DuckFactory{

    static AbstractDuck createDuck(){
        return new CrazySuperDuck();
    }
}
