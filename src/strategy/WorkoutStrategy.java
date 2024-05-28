package strategy;

public interface WorkoutStrategy {

    // defines the common methods to be implemented by the all concrete strategies
    // each concrete strategy implements this interface with its own algorithm
    void executeWorkout();

}
