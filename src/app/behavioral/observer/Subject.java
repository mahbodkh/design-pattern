package app.behavioral.observer;

/*
 * created by Mahbod Kh with ❤️.
 */

public interface Subject {

    void register(Observer obj);

    void unregister(Observer obj);

    void notifyObservers();

    Object getUpdate(Observer obj);

}