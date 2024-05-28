package singleton;

import observer.FitnessTrainer;

public class Fitness {

    private static Fitness fitnessRoom;
    private FitnessTrainer fitnessTrainer;

    private Fitness() {
        fitnessTrainer = new FitnessTrainer();
    }

    public static Fitness useFitnessRoom(){
        if(fitnessRoom == null) {
            fitnessRoom = new Fitness();
        }
        return fitnessRoom;
    }

    public FitnessTrainer getInstructor(){
        return fitnessTrainer;
    }
}
