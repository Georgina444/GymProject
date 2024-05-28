package strategy;

// Another concrete strategy that implements the interface
public class HIITWorkout implements WorkoutStrategy {

    private String enthusiast;

    public HIITWorkout(String enthusiast) {
        this.enthusiast = enthusiast;
        this.executeWorkout();
    }

    @Override
    public void executeWorkout() {
        System.out.println(enthusiast + " updated his/her workout routine to include cardio exercises.");
    }
}
