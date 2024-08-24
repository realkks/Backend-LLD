package DesignPatterns.ObserverDP;

// Whoever implements this interface will be a subject
// whoever will be provider must implement this interface and methods first
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);

    public void notifyObservers();
}
