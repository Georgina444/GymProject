package observer;

import strategy.WorkoutStrategy;

public class GymRats implements FitnessPlanObserver {

    private FitnessPlanSubscription plan;
    private String name;
    private WorkoutStrategy workoutStrategy;
   // private boolean notified = false;

    public GymRats(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    //Trainees modify their workouts
//    public void setWorkoutStrategy(WorkoutStrategy strategy) {
//        this.workoutStrategy = strategy;
//    }

    @Override
    public void update(String workoutName, String workoutDuration) {
        System.out.println(name + " has been notified about the new workout plan: " + workoutName + " for " + workoutDuration);
    }

    public void setWorkoutStrategy(WorkoutStrategy workoutStrategy) {
        this.workoutStrategy = workoutStrategy;
    }

    public void performWorkout() {
        if (workoutStrategy != null) {
            workoutStrategy.executeWorkout();
        } else {
            System.out.println(name + " has no workout strategy set.");
        }
    }


//    @Override
//    public void update() {
//        if(!notified){
//            System.out.println(this.getName() + " started a new workout plan: " + this.plan.getUpdate());
//            notified = true;
//        }
//        else{
//            System.out.println(this.getName() + " started a new workout plan:  ");
//        }
//        if (workoutStrategy != null) {
//            workoutStrategy.executeWorkout();
//        }
//    }

    @Override
    public void setPlan(FitnessPlanSubscription planSubscription) {
        this.plan = planSubscription;
    }
}
