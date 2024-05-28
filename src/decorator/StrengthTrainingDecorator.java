package decorator;

public class StrengthTrainingDecorator extends WorkoutDecorator{

    public StrengthTrainingDecorator(Workout workout) {
        super(workout);
    }

    @Override
    public void workout() {
        super.workout();
        System.out.println("The trainee incorporated new strength training exercises into his/her routine");
    }
}
