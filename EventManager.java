import java.util.ArrayList;
import java.util.HashMap;

public class EventManager {
    private HashMap<String, ArrayList<EventListener>> listeners; // Type of event, Listener of this event type

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