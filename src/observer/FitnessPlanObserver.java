package observer;

public interface FitnessPlanObserver {


    void update(String workoutName, String workoutDuration);

    void setPlan(FitnessPlanSubscription planSubscription);
}
