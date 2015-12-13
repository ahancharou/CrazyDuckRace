import Ducks.AbstractDuck;
import Factories.DuckBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Runner {
    static final int TRACK = 100;

    public static void main (String[] agrs){
       //duck race
        Random random = new Random();
        int numOfDucks = 6;
        int numOfTypes = 3;
        int numOfBags = 4;
        List<AbstractDuck> ducks = new ArrayList<AbstractDuck>(numOfDucks);
        for (int a=0; a<numOfDucks; a++){
            AbstractDuck contender =DuckBuilder.createDuck(random.nextInt(numOfTypes), random.nextInt(numOfBags));
            System.out.print("Contender #"+a+" ");
            System.out.println(contender.getClass().getName());
            ducks.add(contender);
        }

        boolean racing = true;
        while (racing){
            if (!(racing)) break;
            for (AbstractDuck duck: ducks){
                if (!duck.testBlownUp()){
                    duck.race();
                    if (testWin(duck)){
                        racing = false;
                        System.out.println("---------WIN-----------");
                        break;
                    }
                }
            }
            System.out.println("Duck positions");
            for (int b=0; b < 6; b++){
                AbstractDuck runningDuck = ducks.get(b);
                System.out.print(runningDuck.getDistance());
                if (runningDuck.testBlownUp()) {
                    System.out.print(" blown up duck");
                }
                System.out.println();
            }
        }
    }

    private static boolean testWin(AbstractDuck duck) {
        return duck.getDistance() >= TRACK;
    }
}
