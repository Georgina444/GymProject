package strategy;

// This is a concrete strategy
public class CardioWorkout implements WorkoutStrategy {

    private String enthusiast;

    public CardioWorkout(String enthusiast) {
        this.enthusiast = enthusiast;
        this.executeWorkout();
    }

    @Override
    public void executeWorkout() {
        System.out.println(enthusiast + " enhanced his/her workout by adding cardio exercises.");
    }
}
