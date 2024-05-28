package decorator;

public abstract class WorkoutDecorator implements Workout {

    protected Workout decoratedWorkout;

    public WorkoutDecorator(Workout workout) {
        this.decoratedWorkout = workout;
    }

    public void workout() {
        decoratedWorkout.workout();
    }
}

// Base class for all concrete decorators
// This class holds a reference to a Workout instance and delegates to it.
// The WorkoutDecorator abstract class ensures that all concrete decorators maintain
// compatibility with the base Workout interface.
