package decorator;

// concrete implementation of the workout decorator that enhances the base workout with specific exercises.
public class CardioDecorator extends WorkoutDecorator{

    public CardioDecorator(Workout workout) {
        super(workout);
    }

    @Override
    public void workout() {
        super.workout();  // the decorator first delegates the execution of the base workout
        System.out.println("The trainee added a new cardio exercise to his/her routine.");  // adds its functionality after

        // ensures that the complete operation includes both the original behavior of the base workout
        // and the enhancements provided by the decorator.
    }
}
