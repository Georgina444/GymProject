import observer.FitnessTrainer;
import observer.GymRats;
import observer.GymRats;
import observer.FitnessTrainer;
import singleton.Fitness;
import decorator.*;
import strategy.CardioWorkout;
import strategy.MainWorkout;
import strategy.StrengthWorkout;

public class Main {

    public static void main(String[] args) {

        Fitness fitnessProgramme = Fitness.useFitnessRoom();

        //Use the Singleton class
        FitnessTrainer fitnessTrainer = fitnessProgramme.getInstructor();


        GymRats person1 = new GymRats("Anna");
        GymRats person2 = new GymRats("Andrew");

        // The instructor can subscribe trainees and then notify them
        fitnessTrainer.subscribe(person1);
        fitnessTrainer.subscribe(person2);

        // Selecting a strategy
        // Setting the workout plan will automatically notify the observers
        fitnessTrainer.setWorkoutPlan("Upper body workout", "45 minutes");

        // Modifying trainee's current workout plan
        Workout mainWorkout = new MainWorkout("Full Body Workout", "50 minutes");
        Workout cardioWorkout = new CardioDecorator(mainWorkout);
        Workout fullWorkout = new StrengthTrainingDecorator(cardioWorkout);

        // Overwrite their existing workout plans with the decorated workout
        person1.setWorkoutStrategy(fullWorkout::workout);
        System.out.println(person1.getName() + " enhanced their workout by adding cardio and strength exercises.");

        person2.setWorkoutStrategy(fullWorkout::workout);
        System.out.println(person2.getName() + " has incorporated cardio and strength exercises.");


        // Unsubscribe person1 from notifications
        fitnessTrainer.unsubscribe(person1);
        System.out.println(person1.getName() + " has unsubscribed from the fitness plan notifications.");

        // Now only person2 will be notified of further updates
        fitnessTrainer.setWorkoutPlan("Lower body workout", "30 minutes");
    }
}
