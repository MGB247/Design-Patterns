package ObserverPattern;

import java.util.ArrayList;
import java.util.HashMap;

public class EventManager {
    // Type of event, Listener of this event type
    private HashMap<String, ArrayList<EventListener>> listeners = new HashMap<String, ArrayList<EventListener>>();

    public EventManager() {
        this.listeners.put("Movie Released", new ArrayList<EventListener>());
        this.listeners.put("Upcoming Movies", new ArrayList<EventListener>());
        this.listeners.put("Upcoming Tv Series", new ArrayList<EventListener>());
    }

    public boolean subscribe(String event, EventListener listener) {
        ArrayList<EventListener> listeners = this.listeners.get(event);
        if (listeners != null) {
            listeners.add(listener);
            this.listeners.put(event, listeners);
            return true;
        }
        return false;
    }

    public boolean unsubscribe(String event, EventListener listener) {
        ArrayList<EventListener> listeners = this.listeners.get(event);
        if (listeners != null) {
            listeners.remove(listener);
            this.listeners.put(event, listeners);
            return true;
        }
        return false;
    }

    public void notifyListeners(String event, String message) {
        ArrayList<EventListener> listeners = this.listeners.get(event);
        for (EventListener listener : listeners) {
            listener.update(event, message);
        }
    }
}