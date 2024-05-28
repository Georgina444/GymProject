package observer;

public interface FitnessPlanSubscription {

    void subscribe(FitnessPlanObserver planObserver);
    void unsubscribe(FitnessPlanObserver planObserver);
    void notifyObservers();
    String getUpdate();
}
