package decorator;

public class HIITWorkoutDecorator extends WorkoutDecorator{
    public HIITWorkoutDecorator(Workout workout) {
        super(workout);
    }

    @Override
    public void workout() {
        super.workout();  // invoking the method from the class being extended by the current class(parent class)
        System.out.println("The trainee incorporated HIIT exercises into his/her routine");
    }
}
