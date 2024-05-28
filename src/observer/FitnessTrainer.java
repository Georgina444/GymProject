package observer;

import java.util.ArrayList;
import java.util.List;

public class FitnessTrainer implements FitnessPlanSubscription {

    private List<FitnessPlanObserver> planObserverList;
    private String workoutName;
    private String workoutDuration;

    public FitnessTrainer() {
        this.planObserverList = new ArrayList<>();
    }

    @Override
    public void subscribe(FitnessPlanObserver planObserver) {
        this.planObserverList.add(planObserver);
       //  planObserver.setPlan(this);
    }

    @Override
    public void unsubscribe(FitnessPlanObserver planObserver) {
        this.planObserverList.remove(planObserver);
      //  planObserver.setPlan(null);
    }

    @Override
    public void notifyObservers() {
        for(FitnessPlanObserver planObserver : this.planObserverList){
            planObserver.update(workoutName, workoutDuration);
        }
    }

    @Override
    public String getUpdate() {
        return workoutName;
    }

    public void setWorkoutPlan(String workoutName, String workoutDuration) {
        this.workoutName = workoutName;
        this.workoutDuration = workoutDuration;
        this.notifyObservers();
    }
}
